package cn.wyslmzc.yuhao.wysmod.events;

import net.minecraft.world.GameType;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerRespawnEvent {
    @SubscribeEvent
    public static void dead(PlayerEvent.PlayerRespawnEvent event) {
        event.getPlayer().setGameMode(GameType.SPECTATOR);
    }
}
