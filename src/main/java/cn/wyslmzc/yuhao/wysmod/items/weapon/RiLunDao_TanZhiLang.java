package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RiLunDao_TanZhiLang extends NormalWeapon {
    public RiLunDao_TanZhiLang(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a手持时获得附魔§l:§r §c火焰附加§rLv.§610");
    }

    @Override
    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
        if (!stack.isEnchanted()) {
            stack.enchant(Enchantments.FIRE_ASPECT, 10);
        }

        super.invTick(stack, world, player);
    }
}
