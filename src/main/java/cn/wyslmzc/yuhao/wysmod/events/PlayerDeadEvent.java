package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.Umpire;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerDeadEvent {
    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {
        if (!(event.getEntity() instanceof PlayerEntity)) {
            return;
        }

        PlayerEntity player = (PlayerEntity) event.getEntity();

        respawnEffect(event, player);
    }

    private static void respawnEffect(LivingDeathEvent event, PlayerEntity player) {
        if (!player.hasEffect(EffectsList.respawn)) {
            return;
        }
        player.setHealth(player.getMaxHealth() / 2);
        player.removeEffect(EffectsList.respawn);
        Umpire.send(player.level, player, "重生BUFF生效");
        event.setCanceled(true);
    }
}
