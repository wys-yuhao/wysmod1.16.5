package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeMod;

public class Stand extends ItemBase {
    public Stand(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a血量+500");
        tip.addTip("§a距离+10b");
        tip.addInfo("§e其实这只是个手办");
    }

    @Override
    public void setAttribute(ItemStack stack) {
        stack.addAttributeModifier(Attributes.MAX_HEALTH,
                new AttributeModifier("health",
                        500,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
        stack.addAttributeModifier(ForgeMod.REACH_DISTANCE.get(),
                new AttributeModifier("reach",
                        10,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
    }
}
