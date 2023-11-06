package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.gui.GUIBase;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;


@Mod.EventBusSubscriber
public class RenderGuiEvent {
    private static final Map<String, GUIBase> GUIList = RegistryEvents.GUIList;

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void renderGuiEvent(RenderGameOverlayEvent event) {

        if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
            PlayerEntity player = Minecraft.getInstance().player;
            if (player == null) {
                throw new RuntimeException("Player is null");
            }

            for (String name : GUIList.keySet()) {
                GUIList.get(name).render(event, player);
            }
        }
    }
}

