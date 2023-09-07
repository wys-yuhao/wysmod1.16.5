package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.items.weapon.*;
import net.minecraft.item.Item;

import java.util.Map;

import static cn.wyslmzc.yuhao.wysmod.utils.Location.location;

public class WeaponList {
    public static Map<String, Item> itemList = RegistryEvents.itemList;
    public static Item.Properties weapon = new Item.Properties().tab(TabList.weaponGroup).stacksTo(1);

    public static Item chongtian = new NormalWeapon(650, 1, weapon)
            .setRegistryName(location("chongtian"));
    public static Item dihuzhua = new NormalWeapon(500, 1, weapon)
            .setRegistryName(location("dihuzhua"));
    public static Item jiguangjian = new NormalWeapon(5000, 1.5f, weapon)
            .setRegistryName(location("jiguangjian"));
    public static Item jiyingdao = new NormalWeapon(650, 1, weapon)
            .setRegistryName(location("jiyingdao"));
    public static Item fengyingnu = new NormalWeapon(700, 1, weapon)
            .setRegistryName(location("fengyingnu"));
    public static Item modaoqianren = new NormalWeapon(2000, 1, weapon)
            .setRegistryName(location("modaoqianren"));
    public static Item potie = new NormalWeapon(500, 1, weapon)
            .setRegistryName(location("potie"));
    public static Item riyuexizhang = new NormalWeapon(1200, 1, weapon)
            .setRegistryName(location("riyuexizhang"));
    public static Item xingkongfu = new NormalWeapon(600, 1, weapon)
            .setRegistryName(location("xingkongfu"));
    //TODO: 泰拉刃right click
    public static Item tailazhiren = new NormalWeapon(500, 1, weapon)
            .setRegistryName(location("tailazhiren"));
    public static Item xingtianliejian = new NormalWeapon(750, 1, weapon)
            .setRegistryName(location("xingtianliejian"));
    public static Item xiuluowandao = new NormalWeapon(821, 1, weapon)
            .setRegistryName(location("xiuluowandao"));
    public static Item xizhangri = new NormalWeapon(888, 1, weapon)
            .setRegistryName(location("xizhangri"));
    public static Item xizhangyue = new NormalWeapon(888, 1, weapon)
            .setRegistryName(location("xizhangyue"));
    public static Item lieyandao = new NormalWeapon(777, 1, weapon)
            .setRegistryName(location("lieyandao"));
    public static Item zhanshoudadao = new NormalWeapon(450, 1, weapon)
            .setRegistryName(location("zhanshoudadao"));
    public static Item gaozhendonglizidao = new NormalWeapon(500, 1, weapon)
            .setRegistryName(location("gaozhendonglizidao"));
    public static Item feiduandeliandao = new FeiDuanDeLianDao(400, 1, weapon)
            .setRegistryName(location("feiduandeliandao"));
    public static Item rilundao_tanzhilang = new RiLunDao_TanZhiLang(800, 1, weapon)
            .setRegistryName(location("rilundao_tanzhilang"));
    public static Item rilundao_woqishanyi = new RiLunDao_WoQiShanYi(800, 3, weapon)
            .setRegistryName(location("rilundao_woqishanyi"));
    public static Item rilundao_zuipingyizhizhu = new RiLunDao_ZuiPingYiZhiZhu(800, 1, weapon)
            .setRegistryName(location("rilundao_zuipingyizhizhu"));
    public static Item jiaoji = new JiaoJi(800, 1, weapon)
            .setRegistryName(location("jiaoji"));
    public static Item jingangchui = new JingGangChui(800, 1, weapon)
            .setRegistryName(location("jingangchui"));
    public static Item junpei = new JunPei(800, 1, weapon)
            .setRegistryName(location("junpei"));
    public static Item nashenga = new NaShenGa(300, 1, weapon)
            .setRegistryName(location("nashenga"));
    public static Item kuwu = new KuWu(500, 1, weapon)
            .setRegistryName(location("kuwu"));
    public static Item yanmotanglulu = new YanMoTangLuLu(1000, 1, weapon)
            .setRegistryName(location("yanmotanglulu"));


    public static void init() {
        itemList.put("chongtian", chongtian);
        itemList.put("dihuzhua", dihuzhua);
        itemList.put("jiguangjian", jiguangjian);
        itemList.put("jiyingdao", jiyingdao);
        itemList.put("fengyingnu", fengyingnu);
        itemList.put("modaoqianren", modaoqianren);
        itemList.put("potie", potie);
        itemList.put("riyuexizhang", riyuexizhang);
        itemList.put("xingkongfu", xingkongfu);
        itemList.put("tailazhiren", tailazhiren);
        itemList.put("xingtianliejian", xingtianliejian);
        itemList.put("xiuluowandao", xiuluowandao);
        itemList.put("xizhangri", xizhangri);
        itemList.put("xizhangyue", xizhangyue);
        itemList.put("lieyandao", lieyandao);
        itemList.put("zhanshoudadao", zhanshoudadao);
        itemList.put("gaozhendonglizidao", gaozhendonglizidao);
        itemList.put("feiduandeliandao", feiduandeliandao);
        itemList.put("rilundao_tanzhilang", rilundao_tanzhilang);
        itemList.put("rilundao_woqishanyi", rilundao_woqishanyi);
        itemList.put("rilundao_zuipingyizhizhu", rilundao_zuipingyizhizhu);
        itemList.put("jiaoji", jiaoji);
        itemList.put("jingangchui", jingangchui);
        itemList.put("junpei", junpei);
        itemList.put("nashenga", nashenga);
        itemList.put("kuwu", kuwu);
        itemList.put("yanmotanglulu", yanmotanglulu);
    }

}