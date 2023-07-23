package cn.wyslmzc.yuhao.wysmod.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectType;
import net.minecraft.world.Explosion;

public class ExplosionSelf extends BaseEffect {
    public static ExplosionSelf INSTANCE;

    public ExplosionSelf(EffectType type, int color, boolean isInstant) {
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
        if (living.level.isClientSide) {
            return;
        }
        living.level.explode(living,
                living.position().x,
                living.position().y,
                living.position().z,
                amplified + 1,
                Explosion.Mode.NONE);
    }

    //声明buff是好buff还是debuff
    @Override
    public boolean isBeneficial() {
        return true;
    }

}
