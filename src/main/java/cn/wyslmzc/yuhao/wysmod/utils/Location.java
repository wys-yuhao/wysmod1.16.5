package cn.wyslmzc.yuhao.wysmod.utils;

import net.minecraft.util.ResourceLocation;

import static cn.wyslmzc.yuhao.wysmod.WysMod.modId;

public class Location {
    public static ResourceLocation location(String name) {
        return new ResourceLocation(modId, name);
    }
}
