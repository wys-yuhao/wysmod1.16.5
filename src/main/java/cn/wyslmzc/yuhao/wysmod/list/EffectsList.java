package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.effects.*;
import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

import java.util.Map;

public class EffectsList {
    public static final Effect respawn = new Respawn(EffectType.BENEFICIAL, 0xFFD700, false).setRegistryName("respawn");

    public static final Effect explosionself = new ExplosionSelf(EffectType.BENEFICIAL, 0xFF1111, false).setRegistryName("explosionself");
    public static final Effect flight = new Flight(EffectType.BENEFICIAL, 0x9FFFFF, false).setRegistryName("flight");
    public static final Effect upsetinv = new UpsetInv(EffectType.HARMFUL, 0xFF5555, false).setRegistryName("upsetting");
    public static final Effect invulnerable = new Invulnerable(EffectType.BENEFICIAL, 0xA52A2A, false).setRegistryName("invulnerable");
    public static final Effect genshin_impack = new BaseEffect(EffectType.HARMFUL, 0xA52A2A, false).setRegistryName("genshin_impack");
    public static final Effect xuwangzhinuo = new XuWangZhiNuo(EffectType.BENEFICIAL, 0xA52A2A, false).setRegistryName("xuwangzhinuo");
    public static Map<String, Effect> effectMap = RegistryEvents.effectList;

    public static void init() {
        effectMap.put("flight", flight);
        effectMap.put("upsetinv", upsetinv);
        effectMap.put("explosionself", explosionself);
        effectMap.put("invulnerable", invulnerable);
        effectMap.put("respawn", respawn);
        effectMap.put("genshin_impack", genshin_impack);
        effectMap.put("xuwangzhinuo", xuwangzhinuo);
    }
}
