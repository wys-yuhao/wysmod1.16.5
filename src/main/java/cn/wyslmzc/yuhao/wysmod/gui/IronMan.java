package cn.wyslmzc.yuhao.wysmod.gui;

import cn.wyslmzc.yuhao.wysmod.VarInstance;
import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class IronMan extends GUIBase {
    @Override
    public void render(RenderGameOverlayEvent event, PlayerEntity player) {
        int posX = event.getWindow().getWidth() / 2;
        int posY = event.getWindow().getHeight() / 2;

        if (!PropUtils.isPlayerEquipArmor(player, ArmorList.ironman)) {
            return;
        }

        int count;
        try {
            count = VarInstance.INSTANCE.ironmanHurtCount.get(player);
        } catch (Exception e) {
            count = 0;
            VarInstance.INSTANCE.ironmanHurtCount.put(player, count);
        }


        Minecraft.getInstance().font.draw(event.getMatrixStack(),
                "§6[钢铁侠套装]§d剩余耐久: " + (8 - count) + "/8",
                posX / 2,
                posY / 2,
                -12829636);
    }
}
