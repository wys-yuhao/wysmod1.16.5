/*
package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.BlockList;
import cn.wyslmzc.yuhao.wysmod.list.ItemList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LuckyBlockDropEvent {
    @SubscribeEvent
    public static void event(BlockEvent.BreakEvent event) {
        World world = (World) event.getWorld();
        PropUtils.tellRaw(world, event.getState().getBlock().getRegistryName().toString());
        if (event.getState().getBlock().getRegistryName() != BlockList.luckyblock.getRegistryName()) {
            return;
        }
        PropUtils.tellRaw(world, "You have broken a lucky block");
        new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ItemList.sweet_madame));
    }
}

 */
