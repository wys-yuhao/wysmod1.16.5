package cn.wyslmzc.yuhao.wysmod.items;

import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ZeroPurchase extends Item {
    public ZeroPurchase(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a使用后进入创造模式三秒，随心所欲的\"购物\"");
        tip.addInfo("§e《军火出示》");
        tip.addInfo("§e《百亿补贴》");
        tip.addInfo("§e《0元抢购》");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        World playerWorld = player.level;
        boolean creative = player.isCreative();

        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : world.players()) {
            playerEntity.playSound(SoundsList.zero_purchase, 1.0f, 1.0f);
        }

        player.setGameMode(GameType.CREATIVE);
        PropUtils.title(playerWorld, player, "§6§l零元购");

        if (!creative) {
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    player.setGameMode(GameType.SURVIVAL);
                }
            };
            timer.schedule(timerTask, 3000);
        }

        return ActionResult.pass(itemstack);
    }
}
