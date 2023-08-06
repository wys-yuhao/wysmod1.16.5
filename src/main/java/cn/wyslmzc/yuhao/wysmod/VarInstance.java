package cn.wyslmzc.yuhao.wysmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class VarInstance {
    public static VarInstance INSTANCE;

    //飞雷神传送
    public Map<PlayerEntity, Boolean> isSaved = new HashMap<>();
    public Map<PlayerEntity, BlockPos> blockPos = new HashMap<>();
    //钢铁侠受伤次数记录
    public Map<PlayerEntity, Integer> ironmanHurtCount = new HashMap<>();

    public VarInstance() {
        INSTANCE = this;
    }
}
