package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.foods.SweetMadame;
import cn.wyslmzc.yuhao.wysmod.items.props.Wing;
import cn.wyslmzc.yuhao.wysmod.items.props.ZeroPurchase;
import net.minecraft.item.Item;

import java.util.Map;

import static cn.wyslmzc.yuhao.wysmod.utils.Location.location;

public class ItemList {
    //甜甜花酿鸡
    public static final Item sweet_madame = new SweetMadame(new Item.Properties()
            .tab(TabList.foodGroup)
            .food(FoodList.sweet_madame))
            .setRegistryName(location("sweet_madame"));
    private static final Map<String, Item> itemList = RegistryEvents.itemList;
    private static final Item.Properties propProperties = new Item.Properties()
            .tab(TabList.propGroup)
            .stacksTo(1);
    //零元购
    public static final Item zero_purchase = new ZeroPurchase(propProperties)
            .setRegistryName(location("zero_purchase"));
    //翅膀
    public static final Item wing = new Wing(propProperties)
            .setRegistryName(location("wing"));


    public static void init() {
        itemList.put("sweet_madame", sweet_madame);
        itemList.put("zero_purchase", zero_purchase);
        itemList.put("wing", wing);
    }
}
