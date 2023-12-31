package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.items.bases.weaponBase;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeMod;

public class YanMoTangLuLu extends weaponBase {
    public YanMoTangLuLu(int damage, float speed, Properties properties) {
        super(damage, speed, properties);
    }

    @Override
    public void addTooltip(Tooltip tooltip) {
        tooltip.addTip("§a攻击距离: +1b");
    }

    @Override
    public void attribute(ItemStack stack) {
        stack.addAttributeModifier(ForgeMod.REACH_DISTANCE.get(),
                new AttributeModifier("reach",
                        1,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.MAINHAND);
        stack.addAttributeModifier(Attributes.ATTACK_DAMAGE,
                new AttributeModifier("reach",
                        999,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.MAINHAND);
        super.attribute(stack);
    }
}
