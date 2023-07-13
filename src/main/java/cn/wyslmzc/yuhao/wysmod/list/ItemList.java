package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinBlueTeam;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinRedTeam;
import cn.wyslmzc.yuhao.wysmod.items.foods.SweetMadame;
import cn.wyslmzc.yuhao.wysmod.items.props.Wing;
import cn.wyslmzc.yuhao.wysmod.items.props.ZeroPurchase;
import cn.wyslmzc.yuhao.wysmod.items.props.runes.Speed;
import cn.wyslmzc.yuhao.wysmod.items.props.runes.Wither;
import net.minecraft.item.Item;

import java.util.Map;

import static cn.wyslmzc.yuhao.wysmod.utils.Location.location;

public class ItemList {

    private static final Map<String, Item> itemList = RegistryEvents.itemList;
    private static final Item.Properties adminProperties = new Item.Properties()
            .tab(TabList.adminGroup)
            .stacksTo(1);
    //加入红队
    public static final Item team_red = new JoinRedTeam(adminProperties)
            .setRegistryName(location("team_red"));
    //加入蓝队
    public static final Item team_blue = new JoinBlueTeam(adminProperties)
            .setRegistryName(location("team_blue"));
    private static final Item.Properties propProperties = new Item.Properties()
            .tab(TabList.propGroup)
            .stacksTo(1);
    //甜甜花酿鸡
    public static final Item sweet_madame = new SweetMadame(new Item.Properties()
            .tab(TabList.foodGroup)
            .food(FoodList.sweet_madame))
            .setRegistryName(location("sweet_madame"));
    //零元购
    public static final Item zero_purchase = new ZeroPurchase(propProperties)
            .setRegistryName(location("zero_purchase"));
    //翅膀
    public static final Item wing = new Wing(propProperties)
            .setRegistryName(location("wing"));
    //凋零符文
    public static final Item rune_wither = new Wither(propProperties)
            .setRegistryName(location("rune_wither"));
    //速度符文
    public static final Item rune_speed = new Speed(propProperties)
            .setRegistryName(location("rune_speed"));


    public static void init() {
        itemList.put("team_red", team_red);
        itemList.put("team_blue", team_blue);
        itemList.put("sweet_madame", sweet_madame);
        itemList.put("zero_purchase", zero_purchase);
        itemList.put("wing", wing);
        itemList.put("rune_wither", rune_wither);
        itemList.put("rune_speed", rune_speed);
    }
}
