package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.utils.ArmorSuit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArmorList {
    public static Map<String, Item> itemList = RegistryEvents.itemList;

    public static ArmorSuit crystal;


    public static void init() {
        List<String> crystal_tooltip = new ArrayList<>();
        crystal_tooltip.add("生命值+25");
        List<String> crystal_info = new ArrayList<>();
        crystal_info.add("材质来自1.8.9幸运方块扩展");
        crystal = new ArmorSuit("crystal", 100, crystal_tooltip, crystal_info);

        itemList.put(crystal.getName(EquipmentSlotType.HEAD), crystal.getHelmet());
        itemList.put(crystal.getName(EquipmentSlotType.CHEST), crystal.getChestPlate());
        itemList.put(crystal.getName(EquipmentSlotType.LEGS), crystal.getLegging());
        itemList.put(crystal.getName(EquipmentSlotType.FEET), crystal.getFeet());

    }
}
