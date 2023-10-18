package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.block.Block;

import java.util.Map;

public class BlockList {
    private static final Map<String, Block> blockList = RegistryEvents.blockMap;

    /*
    public static Block luckyblock = new Block(
            Block.Properties.of(Material.STONE)
            .strength(2, 38000)
                    .sound(SoundType.STONE)).setRegistryName("luckyblock");


     */
    public static void init() {
        //blockList.put("luckyblock", luckyblock);
    }

}
