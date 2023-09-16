package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class QiuDaoYu extends ItemBase {
    public QiuDaoYu(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§b放置在副手将获得以下效果:");
        tip.addTip("§d血量 +300");
        tip.addTip("§3护甲 +50");
        tip.addTip("§a给予飞行效果");
        tip.addInfo("§e秋刀鱼(bushi)");
    }

    @Override
    public void setAttribute(ItemStack stack) {
        stack.addAttributeModifier(Attributes.ARMOR,
                new AttributeModifier("Armor",
                        50,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
        stack.addAttributeModifier(Attributes.MAX_HEALTH,
                new AttributeModifier("Health",
                        300,
                        AttributeModifier.Operation.ADDITION)
                , EquipmentSlotType.OFFHAND);
    }

    @Override
    public void invTick(PlayerEntity player, World level, ItemStack stack, boolean isSelected) {
        if (player.inventory.offhand.get(0).getItem() != this) {
            return;
        }

        player.addEffect(new EffectInstance(EffectsList.flight, 1, 1, true, true));
    }
}
