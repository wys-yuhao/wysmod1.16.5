package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ArmorSuitEvent {
    @SubscribeEvent
    public static void event(LivingEvent.LivingUpdateEvent event) {
        if (!(event.getEntityLiving() instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();

        if (PropUtils.isPlayerEquipArmor(player, ArmorList.crystal)) {
            return;
        } /*else if () {

        }*/
    }
}
