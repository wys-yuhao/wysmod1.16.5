package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Timer;
import java.util.TimerTask;

public class GenshinImpack extends ItemBase {
    public GenshinImpack(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a使用后延时几秒，使对方原神启动。");
        tip.addTip("§d前摇:6s | 持续: 3s");
        tip.addTip("§c(注:对方可以控制游戏,并非\"沉默\")");
        tip.addInfo("§r§l真·原神启动");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : playerWorld.players()) {
            playerEntity.playSound(SoundsList.genshin_impack, 1.0f, 1.0f);
        }

        PropUtils.title(playerWorld, player, "§3§l原神正在启动...");

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                PropUtils.title(playerWorld, player, "§6§l原神启动!");
                PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s wys:genshin_impack 3 1 true");
                PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s wys:genshin_impack 3 1 true");
            }
        };
        timer.schedule(timerTask, 6000);
    }
}
