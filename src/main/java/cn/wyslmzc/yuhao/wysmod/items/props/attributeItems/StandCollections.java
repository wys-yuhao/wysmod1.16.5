package cn.wyslmzc.yuhao.wysmod.items.props.attributeItems;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import com.google.common.collect.Multimap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeMod;

import javax.annotation.Nullable;
import java.util.List;

public class StandCollections extends Item {
    public StandCollections(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a血量+1200");
        tip.addTip("§a距离+15b");
        tip.addTip("§a击退抗性+10");
        tip.addInfo("§e三个总比一个好");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        stack.addTagElement("HideFlags", IntNBT.valueOf(2));
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

        return super.getAttributeModifiers(slot, stack);
    }
}