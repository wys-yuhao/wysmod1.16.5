package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WeiSheng_v1 extends ItemBase {

    public WeiSheng_v1(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a恶心敌方玩家");
        tip.addInfo("§c伪神の痛你懂吗？");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s blindness 6 4");
        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s wither 6 2");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s blindness 6 4");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s wither 6 2");

        PropUtils.title(playerWorld, player, "§c感受我的痛吧！！！！");
    }
}
