package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinBlueTeam;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinRedTeam;
import cn.wyslmzc.yuhao.wysmod.items.foods.SweetMadame;
import cn.wyslmzc.yuhao.wysmod.items.props.HaoZiWeiZhi;
import cn.wyslmzc.yuhao.wysmod.items.props.Wing;
import cn.wyslmzc.yuhao.wysmod.items.props.ZeroPurchase;
import cn.wyslmzc.yuhao.wysmod.items.props.offhandItems.StandBase;
import cn.wyslmzc.yuhao.wysmod.items.props.runes.*;
import cn.wyslmzc.yuhao.wysmod.items.props.test;
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
    //隐身符文
    public static final Item rune_invisibility = new Invisibility(propProperties)
            .setRegistryName(location("rune_invisibility"));
    //力量符文
    public static final Item rune_strength = new Strength(propProperties)
            .setRegistryName(location("rune_strength"));
    //抗性符文
    public static final Item rune_resistance = new Resistance(propProperties)
            .setRegistryName(location("rune_resistance"));
    //生命恢复符文
    public static final Item rune_regeneration = new Regeneration(propProperties)
            .setRegistryName(location("rune_regeneration"));
    //ls替身
    public static final Item stand_liushang = new StandBase(propProperties)
            .setRegistryName(location("stand_liushang"));
    //yh替身
    public static final Item stand_yuhao = new StandBase(propProperties)
            .setRegistryName(location("stand_yuhao"));
    //xc替身
    public static final Item stand_xiaochao = new StandBase(propProperties)
            .setRegistryName(location("stand_xiaochao"));
    //xc替身
    public static final Item haoziweizhi = new HaoZiWeiZhi(propProperties)
            .setRegistryName(location("haoziweizhi"));
    /*
    //luckyblock
    public static final Item luckyblock = new BlockItem(BlockList.luckyblock, adminProperties)
            .setRegistryName(Objects.requireNonNull(BlockList.luckyblock.getRegistryName()));

     */
    //测试
    public static final Item test = new test(new Item.Properties().tab(TabList.adminGroup).stacksTo(1))
            .setRegistryName(location("test"));


    public static void init() {
        itemList.put("team_red", team_red);
        itemList.put("team_blue", team_blue);
        itemList.put("sweet_madame", sweet_madame);
        itemList.put("zero_purchase", zero_purchase);
        itemList.put("wing", wing);
        itemList.put("rune_wither", rune_wither);
        itemList.put("rune_speed", rune_speed);
        itemList.put("rune_invisibility", rune_invisibility);
        itemList.put("rune_strength", rune_strength);
        itemList.put("rune_resistance", rune_resistance);
        itemList.put("rune_regeneration", rune_regeneration);
        itemList.put("stand_liushang", stand_liushang);
        itemList.put("stand_yuhao", stand_yuhao);
        itemList.put("stand_xiaochao", stand_xiaochao);
        itemList.put("haoziweizhi", haoziweizhi);
        //itemList.put("luckyblock", luckyblock);
        itemList.put("test", test);
    }
}
