package cn.wyslmzc.yuhao.wysmod.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectType;

import java.util.Random;

public class UpsetInv extends BaseEffect {
    public UpsetInv(EffectType type, int color, boolean isInstant) {
        super(type, color, isInstant);
    }

    @Override
    public void applyEffectTick(LivingEntity living, int amplified) {
        if (living instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) living;
            Random r = player.getRandom();

            if (player.level.isClientSide) {
                return;
            }

            for (int i = 0; i < 36; i++) {
                //随机交换玩家背包物品
                int r2 = r.nextInt(36);
                swap(player, i, r2);
            }
        }
    }

    private void swap(PlayerEntity player, int r1, int r2) {
        ItemStack a = player.inventory.getItem(r1);
        ItemStack b = player.inventory.getItem(r2);
        player.inventory.setItem(r1, b);
        player.inventory.setItem(r2, a);
        player.inventory.setChanged();
    }

    @Override
    protected boolean canApplyEffect(int remainingTicks, int level) {
        return remainingTicks % 20 == 0;
    }

    //声明buff是好buff还是debuff
    @Override
    public boolean isBeneficial() {
        return false;
    }
}
