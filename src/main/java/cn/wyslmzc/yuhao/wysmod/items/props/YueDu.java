package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class YueDu extends ItemBase {

    public YueDu(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a给予敌方玩家失明和缓慢II | 5s");
        tip.addInfo("§e(つくよみ)");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s slowness 5 3");
        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s blindness 5 1");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s slowness 5 3");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s blindness 5 1");


        PropUtils.title(playerWorld, player, "§5月读");
    }
}
