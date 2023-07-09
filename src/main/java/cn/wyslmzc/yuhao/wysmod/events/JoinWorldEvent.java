package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class JoinWorldEvent {
    @SubscribeEvent
    public static void event(EntityJoinWorldEvent event) {
        World world = event.getWorld();

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

    }
}
