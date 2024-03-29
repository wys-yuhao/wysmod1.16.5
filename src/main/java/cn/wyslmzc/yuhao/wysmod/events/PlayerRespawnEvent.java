package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.VarInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerRespawnEvent {
    @SubscribeEvent
    public static void dead(PlayerEvent.PlayerRespawnEvent event) {
        ironman(event);
    }

    private static void ironman(PlayerEvent.PlayerRespawnEvent event) {
        PlayerEntity player = event.getPlayer();
        VarInstance.INSTANCE.ironmanHurtCount.putIfAbsent(player, 0);
    }
}
