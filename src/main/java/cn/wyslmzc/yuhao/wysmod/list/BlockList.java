package cn.wyslmzc.yuhao.wysmod.list;

import cn.wyslmzc.yuhao.wysmod.events.RegistryEvents;
import net.minecraft.block.Block;

import java.util.Map;

public class BlockList {
    /*
    public static final Block test_block = new Block(AbstractBlock.Properties.of(Material.STONE)
            .strength(5, 6)
            .sound(SoundType.STONE))
            .setRegistryName(location("test_block"));
     */
    private static final Map<String, Block> blockList = RegistryEvents.blockMap;

    public static void init() {
        /*blockList.put("test_block", test_block);*/

    }
}
