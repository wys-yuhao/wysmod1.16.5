package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.WysMod;
import cn.wyslmzc.yuhao.wysmod.list.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger logger = WysMod.LOGGER;
    public static Map<String, Item> itemList = new HashMap<>();
    public static Map<String, Block> blockMap = new HashMap<>();
    public static Map<String, Effect> effectMap = new HashMap<>();
    public static Map<ResourceLocation, SoundEvent> sounds = new HashMap<>();

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        //初始化item列表
        ItemList.init();
        WeaponList.init();
        ArmorList.init();

        //遍历注册
        for (String name : itemList.keySet()) {
            logger.log(Level.INFO, "[WYS]Registering item:" + name);
            event.getRegistry().register(itemList.get(name));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        //初始化
        BlockList.init();

        //遍历注册
        for (String name : blockMap.keySet()) {
            logger.log(Level.INFO, "[WYS]Registering block:" + name);
            event.getRegistry().register(blockMap.get(name));
        }
    }

    @SubscribeEvent
    public static void registerEffects(final RegistryEvent.Register<Effect> event) {
        //初始化
        EffectsList.init();

        //遍历注册
        for (String name : effectMap.keySet()) {
            logger.log(Level.INFO, "[WYS]Registering effect:" + name);
            event.getRegistry().register(effectMap.get(name));
        }
    }

    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
        SoundsList.init();

        for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
            event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
    }
}
