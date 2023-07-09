package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.item.Item;

import java.util.Map;

public class SwordList {
    /*
     *      SwordItem swordItem = new SwordItem(
     *      ToolsTier.Inf,
     *      100,
     *      1,
     *      new Item.Properties().tab(TabList.weaponGroup));
     */
    public static Map<String, Item> itemList = RegistryEvents.itemList;

    public static void init() {
        /*itemList.put("test_sword", test_sword);*/

    }

}