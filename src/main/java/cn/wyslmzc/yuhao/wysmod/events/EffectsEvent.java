package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EffectsEvent {

    @SubscribeEvent
    public static void Effect(LivingUpdateEvent event) {
        if (!(event.getEntityLiving() instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();


        /* 飞行BUFF */
        if (player.hasEffect(EffectsList.flight)) {
            player.abilities.mayfly = true;
        } else {
            if (player.isCreative()) {
                player.abilities.mayfly = true;
                return;
            }
            if (player.isSpectator()) {
                player.abilities.mayfly = true;
                return;
            }
            player.abilities.mayfly = false;
            player.abilities.flying = false;
        }
    }
}
