package cn.wyslmzc.yuhao.wysmod.gui;

import cn.wyslmzc.yuhao.wysmod.WysMod;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class GenshinImpack extends GUIBase {

    private static final ResourceLocation genshin1 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_1.png");
    private static final ResourceLocation genshin2 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_2.png");
    private static final ResourceLocation genshin3 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_3.png");
    private static final ResourceLocation genshin4 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_4.png");
    private static final ResourceLocation genshin5 = new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_5.png");
    private static int genshin_impack_alpha = 0;

    public GenshinImpack() {
        super();
    }

    @Override
    public void render(RenderGameOverlayEvent event, PlayerEntity player) {
        int posX = event.getWindow().getWidth() / 2;
        int posY = event.getWindow().getHeight() / 2;
        int sposX = event.getWindow().getGuiScaledWidth();
        int sposY = event.getWindow().getGuiScaledHeight();

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
                    sposX, sposY);
        } else {
            genshin_impack_alpha = 0;
        }
    }
}
