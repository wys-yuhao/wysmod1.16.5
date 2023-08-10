package cn.wyslmzc.yuhao.wysmod.list;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList {
    public static final Food sweet_madame = new Food.Builder()
            .nutrition(20)
            .saturationMod(4.0f)
            .effect(() -> new EffectInstance(Effects.HEAL, 20, 10), 1)
            .alwaysEat()
            .build();
}
