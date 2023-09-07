package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.VarInstance;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KuWu extends NormalWeapon {
    public KuWu(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a右键进行飞雷神");
        tooltip.addTip("§a首次右键将保存当前位置");
        tooltip.addTip("§a再次右键将回到保存的位置");
    }

    @Override
    public void useItem(World world, PlayerEntity player, Hand hand) {
        if (world.isClientSide) {
            return;
        }

        if (VarInstance.INSTANCE.isSaved.get(player) == null || !VarInstance.INSTANCE.isSaved.get(player)) {
            VarInstance.INSTANCE.isSaved.put(player, true);
            VarInstance.INSTANCE.blockPos.put(player, new BlockPos(player.position()));
            PropUtils.actionBarTitle(player.level, player, "§a飞雷神已保存");
        } else {
            VarInstance.INSTANCE.isSaved.put(player, false);
            player.teleportTo(VarInstance.INSTANCE.blockPos.get(player).getX(),
                    VarInstance.INSTANCE.blockPos.get(player).getY(),
                    VarInstance.INSTANCE.blockPos.get(player).getZ());
            PropUtils.actionBarTitle(player.level, player, "§a飞雷神已传送");
        }

        super.useItem(world, player, hand);
    }
}
