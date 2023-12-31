package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.Map;

public class SoundsList {
    public static Map<ResourceLocation, SoundEvent> sounds = RegistryEvents.sounds;


    public static SoundEvent zero_purchase = new SoundEvent(new ResourceLocation("wys", "zero_purchase"));
    static ResourceLocation RL_zero_purchase = new ResourceLocation("wys", "zero_purchase");

    public static SoundEvent haoziweizhi = new SoundEvent(new ResourceLocation("wys", "haoziweizhi"));
    static ResourceLocation RL_haoziweizhi = new ResourceLocation("wys", "haoziweizhi");

    public static SoundEvent wuguang_v2 = new SoundEvent(new ResourceLocation("wys", "wuguang_v2"));
    static ResourceLocation RL_wuguang_v2 = new ResourceLocation("wys", "wuguang_v2");

    public static SoundEvent flash = new SoundEvent(new ResourceLocation("wys", "flash"));
    static ResourceLocation RL_flash = new ResourceLocation("wys", "flash");

    public static SoundEvent redeye = new SoundEvent(new ResourceLocation("wys", "redeye"));
    static ResourceLocation RL_redeye = new ResourceLocation("wys", "redeye");

    public static SoundEvent aoligei = new SoundEvent(new ResourceLocation("wys", "aoligei"));
    static ResourceLocation RL_aoligei = new ResourceLocation("wys", "aoligei");

    public static SoundEvent genshin_impack = new SoundEvent(new ResourceLocation("wys", "genshin_impack"));
    static ResourceLocation RL_genshin_impack = new ResourceLocation("wys", "genshin_impack");

    public static void init() {
        sounds.put(RL_zero_purchase, zero_purchase);
        sounds.put(RL_haoziweizhi, haoziweizhi);
        sounds.put(RL_redeye, redeye);
        sounds.put(RL_wuguang_v2, wuguang_v2);
        sounds.put(RL_flash, flash);
        sounds.put(RL_aoligei, aoligei);
        sounds.put(RL_genshin_impack, genshin_impack);
    }
}
