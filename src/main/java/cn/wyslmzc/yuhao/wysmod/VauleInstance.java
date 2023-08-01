package cn.wyslmzc.yuhao.wysmod;

import net.minecraft.entity.player.PlayerEntity;

import java.util.HashMap;
import java.util.Map;

public class VauleInstance {
    public static VauleInstance INSTANCE;

    public Map<PlayerEntity, Integer> ironmanHurtCount = new HashMap<>();

    public VauleInstance() {
        INSTANCE = this;
    }
}
