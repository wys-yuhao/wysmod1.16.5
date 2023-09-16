package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public class XuZuo_Gujia extends ItemBase {
    String info;

    public XuZuo_Gujia(Properties p_i48487_1_, String info) {
        super(p_i48487_1_);
        this.info = info;
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a血量+800");
        tip.addTip("§a击退抗性+100%");
        tip.addInfo(info);
    }

    @Override
    public void setAttribute(ItemStack stack) {
        stack.addAttributeModifier(Attributes.MAX_HEALTH,
                new AttributeModifier("health",
                        800,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
        stack.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE,
                new AttributeModifier("KNOCKBACK_RESISTANCE",
                        100,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
    }
}
