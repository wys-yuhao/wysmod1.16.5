package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Timer;
import java.util.TimerTask;

public class QianKunDaNuoYi extends ItemBase {

    public QianKunDaNuoYi(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a进行乾坤大挪移,使自己传送至一处安全位置");
        tip.addTip("§a注意:平台将会在十秒后消失!");
        tip.addInfo("§e明教历代相传的一门最厉害的武功，只有教主方可修炼。\n" +
                "其根本道理也并不奥妙，只不过是先要激发自身潜力，然后牵引挪移，其中变化莫测，匪夷所思。");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
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
    }
}
