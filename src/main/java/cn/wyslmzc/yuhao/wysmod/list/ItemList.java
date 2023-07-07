package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.TestProp;
import cn.wyslmzc.yuhao.wysmod.items.ZeroPurchase;
import cn.wyslmzc.yuhao.wysmod.items.runes.Wing;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.Map;
import java.util.Objects;

import static cn.wyslmzc.yuhao.wysmod.utils.Location.location;

public class ItemList {
    public static final Item test_item = new Item(new Item.Properties()
            .tab(TabList.adminGroup))
            .setRegistryName(location("test_item"));
    public static final Item test_block = new BlockItem(BlockList.test_block,
            new Item.Properties().tab(TabList.adminGroup))
            .setRegistryName(Objects.requireNonNull(BlockList.test_block.getRegistryName()));
    public static final Item test_prop = new TestProp(new Item.Properties()
            .tab(TabList.adminGroup))
            .setRegistryName(location("test_prop"));
    //甜甜花酿鸡
    public static final Item sweet_madame = new Item(new Item.Properties()
            .tab(TabList.foodGroup)
            .food(FoodList.sweet_madame))
            .setRegistryName(location("sweet_madame"));
    private static final Map<String, Item> itemList = RegistryEvents.itemList;
    private static final Item.Properties propProperties =
            new Item.Properties()
                    .tab(TabList.propGroup)
                    .stacksTo(1);
    //零元购
    public static final Item zero_purchase = new ZeroPurchase(propProperties)
            .setRegistryName(location("zero_purchase"));
    //翅膀
    public static final Item wing = new Wing(propProperties)
            .setRegistryName(location("wing"));


    public static void init() {
        itemList.put("test_item", test_item);
        itemList.put("test_block", test_block);
        itemList.put("test_prop", test_prop);


        itemList.put("sweet_madame", sweet_madame);
        itemList.put("zero_purchase", zero_purchase);
        itemList.put("wing", wing);
    }
}
