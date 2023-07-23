package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinBlueTeam;
import cn.wyslmzc.yuhao.wysmod.items.adminItems.JoinRedTeam;
import cn.wyslmzc.yuhao.wysmod.items.foods.SweetMadame;
import cn.wyslmzc.yuhao.wysmod.items.props.*;
import cn.wyslmzc.yuhao.wysmod.items.props.attributeItems.*;
import cn.wyslmzc.yuhao.wysmod.items.props.runes.*;
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
    public static final Item stand_liushang = new Stand(propProperties)
            .setRegistryName(location("stand_liushang"));
    //yh替身
    public static final Item stand_yuhao = new Stand(propProperties)
            .setRegistryName(location("stand_yuhao"));
    //xc替身
    public static final Item stand_xiaochao = new Stand(propProperties)
            .setRegistryName(location("stand_xiaochao"));
    //好自为之
    public static final Item haoziweizhi = new HaoZiWeiZhi(propProperties)
            .setRegistryName(location("haoziweizhi"));
    //红眼
    public static final Item redeye = new RedEye(propProperties)
            .setRegistryName(location("redeye"));
    //乾坤大挪移
    public static final Item qiankundanuoyi = new QianKunDaNuoYi(propProperties)
            .setRegistryName(location("qiankundanuoyi"));
    //起爆符
    public static final Item qibaofu = new QiBaoFu(propProperties)
            .setRegistryName(location("qibaofu"));
    //两只老虎爱跳舞
    public static final Item wuguang_v2 = new WuGuang_v2(propProperties)
            .setRegistryName(location("wuguang_v2"));
    //月读
    public static final Item yuedu = new YueDu(propProperties)
            .setRegistryName(location("yuedu"));
    //斑 须佐能乎
    public static final Item xuzuogujia_ban = new XuZuo_Gujia(propProperties, "§l我斑愿称你为最强!")
            .setRegistryName(location("xuzuogujia_ban"));
    //鼬 须佐能乎
    public static final Item xuzuogujia_you = new XuZuo_Gujia(propProperties, "§4§l你的写轮眼能看多远呢？")
            .setRegistryName(location("xuzuogujia_you"));
    //佐助 须佐能乎
    public static final Item xuzuogujia_zuozhu = new XuZuo_Gujia(propProperties, "§lあの男を殺したいです")
            .setRegistryName(location("xuzuogujia_zuozhu"));
    //斑 须佐能乎 半全体
    public static final Item xuzuobanquanti_ban = new XuZuo_BanQuanTi(propProperties, "§l原谅我佐助！这是最后一次了...")
            .setRegistryName(location("xuzuobanquanti_ban"));
    //鼬 须佐能乎 半全体
    public static final Item xuzuobanquanti_you = new XuZuo_BanQuanTi(propProperties, "§l绝望吧，这就是宇智波斑！神的力量！")
            .setRegistryName(location("xuzuobanquanti_you"));
    //佐助 须佐能乎 半全体
    public static final Item xuzuobanquanti_zuozhu = new XuZuo_BanQuanTi(propProperties, "§l当你觉得友谊是个愚蠢的东西\n" +
            "那你肯定是一个彻头彻尾的笨蛋！\n" +
            "当你失去友谊的时候你才会觉得可怜\n" +
            "那都是你们这些不懂的友谊的后果\n" +
            "也许我也就这样傻过\n")
            .setRegistryName(location("xuzuobanquanti_zuozhu"));
    //求道玉
    public static final Item qiudaoyu = new QiuDaoYu(propProperties)
            .setRegistryName(location("qiudaoyu"));
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
        itemList.put("redeye", redeye);
        itemList.put("qiankundanuoyi", qiankundanuoyi);
        itemList.put("qibaofu", qibaofu);
        itemList.put("wuguang_v2", wuguang_v2);
        itemList.put("yuedu", yuedu);
        itemList.put("xuzuogujia_ban", xuzuogujia_ban);
        itemList.put("xuzuogujia_you", xuzuogujia_you);
        itemList.put("xuzuogujia_zuozhu", xuzuogujia_zuozhu);
        itemList.put("xuzuobanquanti_ban", xuzuobanquanti_ban);
        itemList.put("xuzuobanquanti_you", xuzuobanquanti_you);
        itemList.put("xuzuobanquanti_zuozhu", xuzuobanquanti_zuozhu);
        itemList.put("qiudaoyu", qiudaoyu);
        //itemList.put("luckyblock", luckyblock);
        itemList.put("test", test);
    }
}
