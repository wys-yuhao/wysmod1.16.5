package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

import java.util.Timer;
import java.util.TimerTask;

public class ZeroPurchase extends ItemBase {
    public ZeroPurchase(Properties properties) {
        super(properties);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a使用后进入创造模式三秒，随心所欲的\"购物\"");
        tip.addTip("§c注:请勿套娃(拿取零元购)");
        tip.addInfo("§e《军火出示》");
        tip.addInfo("§e《百亿补贴》");
        tip.addInfo("§e《0元抢购》");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        boolean creative = player.isCreative();

        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : playerWorld.players()) {
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
    }
}
