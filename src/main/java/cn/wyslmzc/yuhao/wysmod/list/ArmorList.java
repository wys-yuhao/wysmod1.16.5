package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.utils.ArmorTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import java.util.Map;

public class ArmorList {
    public static Map<String, Item> armorList = RegistryEvents.armorList;

    ArmorItem armorItem = new ArmorItem(ArmorTier.Inf,
            EquipmentSlotType.HEAD,
            new Item.Properties().tab(TabList.ArmorGroup));


    public static void init() {

    }
}
