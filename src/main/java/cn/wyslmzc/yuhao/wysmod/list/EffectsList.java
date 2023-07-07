package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.effects.Flight;
import cn.wyslmzc.yuhao.wysmod.effects.UpsetInv;
import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

import java.util.Map;

public class EffectsList {
    public static final Effect flight = new Flight(EffectType.BENEFICIAL, 0x9FFFFF, false).setRegistryName("flight");
    public static final Effect upsetinv = new UpsetInv(EffectType.HARMFUL, 0xFF5555, false).setRegistryName("upsetting");
    public static Map<String, Effect> effectMap = RegistryEvents.effectMap;

    public static void init() {
        effectMap.put("flight", flight);
        effectMap.put("upsetinv", upsetinv);
    }
}
