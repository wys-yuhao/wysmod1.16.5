package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeMod;

public class StandCollections extends ItemBase {
    public StandCollections(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a血量+1200");
        tip.addTip("§a距离+15b");
        tip.addTip("§a击退抗性+10");
        tip.addInfo("§e三个诸葛亮打过一个臭皮匠(");
    }

    @Override
    public void setAttribute(ItemStack stack) {
        stack.addAttributeModifier(Attributes.MAX_HEALTH,
                new AttributeModifier("health",
                        1200,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
        stack.addAttributeModifier(ForgeMod.REACH_DISTANCE.get(),
                new AttributeModifier("reach",
                        15,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
        stack.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE,
                new AttributeModifier("KNOCKBACK_RESISTANCE",
                        1,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
    }
}
