package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RiLunDao_WoQiShanYi extends WeaponBase {
    public RiLunDao_WoQiShanYi(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a命中敌人后召唤闪电击中敌方");
        tooltip.addTip("§a手持时获得§b速度V");
    }

    @Override
    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
        PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 5);
        super.invTick(stack, world, player);
    }
}
