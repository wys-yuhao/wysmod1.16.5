package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.utils.ToolsTier;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.SwordItem;

import java.util.Map;

public class SwordList {
    /*
     *      SwordItem swordItem = new SwordItem(
     *      ToolsTier.Inf,
     *      100,
     *      1,
     *      new Item.Properties().tab(TabList.weaponGroup));
     */
    public static final Item test_sword = new SwordItem(
            ToolsTier.Inf, 2147483647, 5.0F,
            new Properties().tab(TabList.adminGroup)).setRegistryName("test_sword");
    public static Map<String, Item> itemList = RegistryEvents.itemList;

    public static void init() {
        itemList.put("test_sword", test_sword);
    }

}