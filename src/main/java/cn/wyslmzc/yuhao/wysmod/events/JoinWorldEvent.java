package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class JoinWorldEvent {


    @SubscribeEvent
    public static void event(PlayerEvent.PlayerLoggedInEvent event) {
        World world = event.getEntity().level;

        if (world.isClientSide) {
            return;
        }


        PropUtils.runCommand(world, "team add red");
        PropUtils.runCommand(world, "team add blue");
        PropUtils.runCommand(world, "team modify red friendlyFire false");
        PropUtils.runCommand(world, "team modify blue friendlyFire false");
        PropUtils.runCommand(world, "team modify red color red");
        PropUtils.runCommand(world, "team modify blue color aqua");
        PropUtils.runCommand(world, "team modify red seeFriendlyInvisibles true");
        PropUtils.runCommand(world, "team modify blue seeFriendlyInvisibles true");
        PropUtils.runCommand(world, "gamerule sendCommandFeedback false");

        PropUtils.runCommand(world, "team add umpire");
        PropUtils.runCommand(world, "team modify umpire friendlyFire false");
        PropUtils.runCommand(world, "team modify umpire color gold");
        PropUtils.runCommand(world, "team modify umpire seeFriendlyInvisibles true");
    }
}
