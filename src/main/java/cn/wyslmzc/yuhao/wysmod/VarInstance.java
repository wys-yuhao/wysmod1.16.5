package cn.wyslmzc.yuhao.wysmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class VarInstance {
    public static VarInstance INSTANCE;

    public Map<PlayerEntity, Boolean> isSaved = new HashMap<>();
    public Map<PlayerEntity, BlockPos> blockPos = new HashMap<>();

    public Map<PlayerEntity, Integer> ironmanHurtCount = new HashMap<>();

    public VarInstance() {
        INSTANCE = this;
    }
}
