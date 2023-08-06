package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RiLunDao_ZuiPingYiZhiZu extends WeaponBase {
    public RiLunDao_ZuiPingYiZhiZu(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a手持时获得§c力量§aV");
    }

    @Override
    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
        PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 5);
        super.invTick(stack, world, player);
    }
}
