package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.WysMod;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class RenderGuiEvent {

    private static final ResourceLocation genshin1 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_1.png");
    private static final ResourceLocation genshin2 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_2.png");
    private static final ResourceLocation genshin3 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_3.png");
    private static final ResourceLocation genshin4 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_4.png");
    private static final ResourceLocation genshin5 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_5.png");
    private static int genshin_impack_alpha = 0;

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void renderGuiEvent(RenderGameOverlayEvent event) {

        if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
            int posX = (event.getWindow().getWidth()) / 2;
            int posY = (event.getWindow().getHeight()) / 2;

            PlayerEntity player = Minecraft.getInstance().player;
            if (player == null) {
                throw new RuntimeException("Player is null");
            }
            World world = player.level;

            genshinImpack(event, player, posX, posY);
        }
    }

    private static void genshinImpack(RenderGameOverlayEvent event, PlayerEntity player, int posX, int posY) {
        if (player.hasEffect(EffectsList.genshin_impack)) {
            genshin_impack_alpha++;
            //渐变
            if (genshin_impack_alpha < 2) {
                Minecraft.getInstance().getTextureManager().bind(genshin1);
            } else if (genshin_impack_alpha < 4) {
                Minecraft.getInstance().getTextureManager().bind(genshin2);
            } else if (genshin_impack_alpha < 6) {
                Minecraft.getInstance().getTextureManager().bind(genshin3);
            } else if (genshin_impack_alpha < 8) {
                Minecraft.getInstance().getTextureManager().bind(genshin4);
            } else {
                Minecraft.getInstance().getTextureManager().bind(genshin5);
            }
            //显示
            AbstractGui.blit(event.getMatrixStack(),
                    0, 0,
                    0, 0,
                    posX, posY,
                    posX, posY);
        } else {
            genshin_impack_alpha = 0;
        }
    }
}

