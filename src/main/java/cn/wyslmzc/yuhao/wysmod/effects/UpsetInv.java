package cn.wyslmzc.yuhao.wysmod.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectType;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class UpsetInv extends BaseEffect {
    public UpsetInv(EffectType type, int color, boolean isInstant) {
        super(type, color, isInstant);
    }

    @Override
    public void applyEffectTick(LivingEntity living, int amplified) {
        if (living instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) living;
            Random r = player.getRandom();

            int r1 = r.nextInt(36);
            int r2 = r.nextInt(36);

            swap(player, r1, r2);

            player.inventory.setChanged();
        }
    }

    @Override
    protected boolean canApplyEffect(int remainingTicks, int level) {
        return remainingTicks % 2 == 0;
    }

    //声明buff是好buff还是debuff
    @Override
    public boolean isBeneficial() {
        return false;
    }

    private void swap(PlayerEntity p, int i, int j) {
        ItemStack a = p.inventory.getItem(i);
        ItemStack b = p.inventory.getItem(j);

        p.inventory.setItem(i, ItemStack.EMPTY);
        p.inventory.setItem(j, ItemStack.EMPTY);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                p.inventory.setItem(i, b);
                p.inventory.setItem(j, a);
            }
        };
        timer.schedule(timerTask, 10);

    }
}
