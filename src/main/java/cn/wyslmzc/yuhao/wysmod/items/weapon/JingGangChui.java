package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.items.bases.weaponBase;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class JingGangChui extends weaponBase {
    public JingGangChui(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a手持时获得 §8缓慢I §aBuff");
    }

    @Override
    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
        PropUtils.addEffect(player, Effects.MOVEMENT_SLOWDOWN, 1, 1);
        super.onHandTick(stack, world, player);
    }
}
