package cn.wyslmzc.yuhao.wysmod.gui;

import cn.wyslmzc.yuhao.wysmod.WysMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class Attribute extends GUIBase {

    private static final ResourceLocation background =
            new ResourceLocation(WysMod.modId + ":textures/hud/genshin_impack_1.png");

    @Override
    public void render(RenderGameOverlayEvent event, PlayerEntity player) {
        //TODO:属性界面
    }
}
