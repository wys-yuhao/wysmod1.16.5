package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class RedEye extends ItemBase {
    public RedEye(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a戴在头上时伤害+500");
        tip.addTip("§a右键戴在头上(注意会§c替换§a头部装备!)");
        tip.addInfo("§c§l危!");
    }

    @Override
    public void setAttribute(ItemStack stack) {
        stack.addAttributeModifier(Attributes.ATTACK_DAMAGE,
                new AttributeModifier("ATTACK_DAMAGE",
                        500,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.HEAD);
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : playerWorld.players()) {
            playerEntity.playSound(SoundsList.redeye, 0.8f, 1.0f);
        }

        player.inventory.armor.set(3, itemstack);
        player.inventory.setChanged();
    }

}
