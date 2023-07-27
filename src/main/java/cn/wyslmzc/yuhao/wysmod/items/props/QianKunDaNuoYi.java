package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QianKunDaNuoYi extends Item {

    public QianKunDaNuoYi(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a进行乾坤大挪移,使自己传送至一处安全位置");
        tip.addTip("§a注意:平台将会在十秒后消失!");
        tip.addInfo("§e明教历代相传的一门最厉害的武功，只有教主方可修炼。\n" +
                "其根本道理也并不奥妙，只不过是先要激发自身潜力，然后牵引挪移，其中变化莫测，匪夷所思。");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        World playerWorld = player.level;

        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.title(playerWorld, player, " §b乾坤大挪移! ");
        player.teleportTo(player.position().x, player.position().y + 10, player.position().z);
        PropUtils.runCommand(player, "fill ~1 ~-2 ~1 ~-1 ~-2 ~-1 slime_block replace air");
        PropUtils.runCommand(player, "summon minecraft:area_effect_cloud ~ ~1 ~ {Tags:[\"qkdny\"],CustomNameVisible:0b,NoAI:1b,Invulnerable:1b,Silent:1b,NoGravity:1b,Age:0,Duration:2200,Color:0,Radius:0}");

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                PropUtils.runCommand(playerWorld, "execute as @e[tag=qkdny] at @s run fill ~1 ~-2 ~1 ~-1 ~-3 ~-1 air replace slime_block");
                PropUtils.runCommand(player, "kill @e[tag=qkdny]");
            }
        };
        timer.schedule(timerTask, 10000);

        return ActionResult.pass(itemstack);
    }
}
