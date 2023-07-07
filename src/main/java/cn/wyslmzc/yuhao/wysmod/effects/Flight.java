package cn.wyslmzc.yuhao.wysmod.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectType;

public class Flight extends BaseEffect {
    public static Flight INSTANCE;

    public Flight(EffectType type, int color, boolean isInstant) {
        super(type, color, isInstant);
        INSTANCE = this;
    }

    @Override
    protected boolean canApplyEffect(int remainingTicks, int level) {
        return remainingTicks % 5 == 0;
    }

    //这个是buff在身上持续作用的效果函数
    @Override
    public void applyEffectTick(LivingEntity living, int amplified) {
        if (living instanceof PlayerEntity) {
            if (((PlayerEntity) living).abilities.flying) {
                living.fallDistance = 0;
            }
        }
    }

    //声明buff是好buff还是debuff
    @Override
    public boolean isBeneficial() {
        return true;
    }

}
