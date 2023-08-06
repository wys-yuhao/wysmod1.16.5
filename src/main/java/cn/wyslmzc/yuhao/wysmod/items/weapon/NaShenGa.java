package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NaShenGa extends WeaponBase {
    public NaShenGa(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a手持时获得附魔§l:§r §e击退§rLv.§610");
        tooltip.addTip("§c攻击敌人后损坏!");
    }

    @Override
    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
        stack.enchant(Enchantments.KNOCKBACK, 10);
        super.onHandTick(stack, world, player);
    }
}
