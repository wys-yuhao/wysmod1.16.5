package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import cn.wyslmzc.yuhao.wysmod.utils.ArmorSuit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArmorList {
    public static Map<String, Item> itemList = RegistryEvents.itemList;

    public static ArmorSuit crystal;
    public static ArmorSuit mingren4;
    public static ArmorSuit bofengshuimen;
    public static ArmorSuit dihu;
    public static ArmorSuit feiying;
    public static ArmorSuit jingang;
    public static ArmorSuit xiuluo;
    public static ArmorSuit fengying;
    public static ArmorSuit xingtian;
    public static ArmorSuit yanlong;
    public static ArmorSuit kongwo;
    public static ArmorSuit shiwang;
    public static ArmorSuit jinming;
    public static ArmorSuit ban;
    public static ArmorSuit liudao;
    public static ArmorSuit gaiya;
    public static ArmorSuit daina;
    public static ArmorSuit xieedijia;
    public static ArmorSuit sailuo;
    public static ArmorSuit dijia;
    public static ArmorSuit ironman;
    public static ArmorSuit fengmoshiwang;
    public static ArmorSuit dihuang;
    public static ArmorSuit notch;
    public static ArmorSuit him;


    public static void init() {
        crystal = addArmor("crystal", 800, 0, 0, "全装由水晶打造,存粹凑数的qvq");
        mingren4 = addArmor("mingren4", 1200, 0, 0, "抗性提升1", "生命恢复4");
        bofengshuimen = addArmor("bofengshuimen", 1300, 0, 0, "速度3", "抗性提升2");
        dihu = addArmor("dihu", 1360, 0, 0, "缓慢1", "跳跃提升1", "抗性提升2");
        feiying = addArmor("feiying", 1400, 0, 0, "速度3", "跳跃提升2", "生命恢复3");
        jingang = addArmor("jingang", 1500, 0, 0, "跳跃提升1", "抗性提升1", "力量1");
        xiuluo = addArmor("xiuluo", 1540, 0, 0, "速度2", "跳跃提升1", "抗性提升1");
        fengying = addArmor("fengying", 1540, 0, 0, "速度3", "跳跃提升1", "力量提升1");
        xingtian = addArmor("xingtian", 1580, 0, 0, "速度1", "力量2", "抗性提升1");
        yanlong = addArmor("yanlong", 1640, 0, 0, "速度2", "力量2", "抗性提升1");
        kongwo = addArmor("kongwo", 1640, 0, 0, "速度2", "跳跃提升2", "抗性提升2");
        shiwang = addArmor("shiwang", 1900, 0, 0, "速度2", "跳跃提升1", "抗性提升1", "力量1");
        jinming = addArmor("jinming", 1980, 0, 0, "速度1", "跳跃提升1", "力量3");
        ban = addArmor("ban", 2100, 0, 0, "抗性提升2", "速度1");
        liudao = addArmor("liudao", 2200, 0, 0, "抗性提升2", "速度1", "生命恢复8", "飞行", "力量1");
        gaiya = addArmor("gaiya", 2300, 0, 0, "生命恢复8", "飞行", "抗性提升3", "力量2");
        daina = addArmor("daina", 2340, 0, 0, "生命恢复8", "飞行", "抗性提升3", "力量2");
        xieedijia = addArmor("xieedijia", 2400, 0, 0, "生命恢复8", "飞行", "抗性提升3", "力量2");
        sailuo = addArmor("sailuo", 2600, 0, 0, "生命恢复8", "飞行", "抗性提升3", "力量2");
        dijia = addArmor("dijia", 2750, 0, 0, "生命恢复8", "飞行", "抗性提升3", "力量2");
        ironman = addArmor("ironman", 200, 0, 0, "无敌", "飞行");
        fengmoshiwang = addArmor("fengmoshiwang", 2950, 0, 0, "速度4", "跳跃提升2", "抗性提升4", "发光", "飞行");
        dihuang = addArmor("dihuang", 3150, 0, 0, "速度5", "跳跃提升2", "抗性提升3", "发光", "飞行", "力量2");
        notch = addArmor("notch", 6666, 0, 0, "无敌", "飞行", "力量", "发光");
        him = addArmor("him", 6666, 0, 0, "无敌", "飞行", "力量", "发光");
    }

    private static ArmorSuit addArmor(String name, int health, int armor, int armorToughness, String... info) {
        List<String> tooltip = new ArrayList<>();
        tooltip.add("§d生命值 +" + (health / 4));

        tooltip.addAll(Arrays.asList(info));

        ArmorSuit a = new ArmorSuit(name, health, armor, armorToughness, tooltip);

        itemList.put(a.getName(EquipmentSlotType.HEAD), a.getHelmet());
        itemList.put(a.getName(EquipmentSlotType.CHEST), a.getChestPlate());
        itemList.put(a.getName(EquipmentSlotType.LEGS), a.getLegging());
        itemList.put(a.getName(EquipmentSlotType.FEET), a.getFeet());

        return a;
    }
}
