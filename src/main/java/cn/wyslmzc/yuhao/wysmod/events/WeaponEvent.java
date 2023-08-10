package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.WeaponList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class WeaponEvent {
    @SubscribeEvent
    public static void event(LivingDamageEvent event) {
        //get player
        if (!(event.getSource().getEntity() instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) event.getSource().getEntity();
        //get target
        if (!(event.getEntity() instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity target = (PlayerEntity) event.getEntity();
        ItemStack stack = player.getMainHandItem();
        float damage = event.getAmount();

        weaponEvent(player, target, stack, damage);
    }

    public static void weaponEvent(PlayerEntity player, PlayerEntity target, ItemStack stack, float damage) {
        if (stack.getItem() == WeaponList.feiduandeliandao) {
            //飞段镰刀吸血
            float blood = (float) (player.getHealth() + (damage * 0.4));
            player.setHealth(blood);
            PropUtils.actionBarTitle(player.level, player, "§6§l您成功吸了§c§l" + (int) blood + "§6§l点血");
        } else if (stack.getItem() == WeaponList.rilundao_woqishanyi) {
            //wqsy日轮刀召唤闪电
            PropUtils.runCommand(target, "summon minecraft:lightning_bolt ~ ~ ~");
        } else if (stack.getItem() == WeaponList.nashenga) {
            //螺旋丸一次耐久
            player.setItemInHand(Hand.MAIN_HAND, ItemStack.EMPTY);
            player.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
        }
    }
}