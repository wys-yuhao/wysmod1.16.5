package cn.wyslmzc.yuhao.wysmod.utils.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ToolsTier implements IItemTier {

    Inf(0, 2147483647, 0.0F, 0.0F, 0, () -> {
        return Ingredient.of(Items.AIR);
    });


    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private ToolsTier(int level, int uses, float speed, float damage, int enchantment, Supplier repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantment;
        this.repairIngredient = new LazyValue(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}
