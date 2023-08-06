package cn.wyslmzc.yuhao.wysmod.utils;

import cn.wyslmzc.yuhao.wysmod.list.TabList;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class ArmorSuit {
    public String name;
    public int health;
    public int armorToughness;
    public List<String> tooltip;
    ArmorTier tier;

    public Armor helmet;
    public Armor chest;
    public Armor legs;
    public Armor feet;

    public ArmorSuit(String name, int health, int armor, int armorToughness, List<String> tooltip) {
        this.name = name;
        this.health = health;
        this.armorToughness = armorToughness / 4;
        this.tooltip = tooltip;
        int armors = armor / 4;

        this.tier = new ArmorTier(name,
                0,
                new int[]{0, 0, 0, 0},
                0,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                0,
                0.0F,
                () -> {
                    return Ingredient.of(Items.AIR);
                }
        );

        helmet = new Armor(tier, EquipmentSlotType.HEAD, new Item.Properties().tab(TabList.ArmorGroup), EquipmentSlotType.HEAD);
        chest = new Armor(tier, EquipmentSlotType.CHEST, new Item.Properties().tab(TabList.ArmorGroup), EquipmentSlotType.CHEST);
        legs = new Armor(tier, EquipmentSlotType.LEGS, new Item.Properties().tab(TabList.ArmorGroup), EquipmentSlotType.LEGS);
        feet = new Armor(tier, EquipmentSlotType.FEET, new Item.Properties().tab(TabList.ArmorGroup), EquipmentSlotType.FEET);
    }

    public String getName(EquipmentSlotType type) {
        String s;

        switch (type) {
            case HEAD:
                s = "helmet";
                break;
            case CHEST:
                s = "chest";
                break;
            case LEGS:
                s = "legging";
                break;
            case FEET:
                s = "feet";
                break;
            default:
                s = "error";
                break;
        }

        return name + "_" + s;
    }

    public Item getHelmet() {
        return helmet.setRegistryName(name + "_helmet");
    }

    public Item getChestPlate() {
        return chest.setRegistryName(name + "_chest");
    }

    public Item getLegging() {
        return legs.setRegistryName(name + "_legging");
    }

    public Item getFeet() {
        return feet.setRegistryName(name + "_feet");
    }

    public class Armor extends ArmorItem {
        EquipmentSlotType slotType;

        public Armor(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Properties p_i48534_3_, EquipmentSlotType slotType) {
            super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
            this.slotType = slotType;
        }

        @Override
        public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
            Tooltip tip = new Tooltip(tooltip);

            for (String s : ArmorSuit.this.tooltip) {
                tip.addTip("§a" + s);
            }

            tip.show();

            super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
        }

        @Override
        public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
            stack.addAttributeModifier(Attributes.MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "Max health", (double) health / 4, AttributeModifier.Operation.ADDITION), slotType);
            stack.addTagElement("HideFlags", IntNBT.valueOf(2));
            return ArrayListMultimap.create();
        }
    }
}
