package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ShiGuiFengJin extends ItemBase {
    public ShiGuiFengJin(Properties properties) {
        super(properties);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a随机封禁一位敌方玩家(距离限制8block)");
        tip.addInfo("§e谁跟你PVP啊,直接给你封掉");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[distance=0..8,team=blue] at @s run gamemode spectator @s");
        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[distance=0..8,team=red] at @s run gamemode spectator @s");

        PropUtils.title(playerWorld, player, "§c§l尸鬼封尽");
    }
}
