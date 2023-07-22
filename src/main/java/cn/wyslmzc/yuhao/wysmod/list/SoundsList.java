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

    public static void init() {
        sounds.put(RL_zero_purchase, zero_purchase);
        sounds.put(RL_haoziweizhi, haoziweizhi);
    }
}
