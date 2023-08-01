package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ArmorSuitEvent {
    @SubscribeEvent
    public static void event(LivingEvent.LivingUpdateEvent event) {
        if (!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();

        if (PropUtils.isPlayerEquipArmor(player, ArmorList.mingren4)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 4);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.bofengshuimen)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 2);
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 3);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.dihu)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SLOWDOWN, 1, 1);
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.feiying)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 3);
            PropUtils.addEffect(player, Effects.JUMP, 1, 2);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 3);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.jingang)) {
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.xiuluo)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 2);
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.fengying)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 3);
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.xingtian)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.yanlong)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.kongwo)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 2);
            PropUtils.addEffect(player, Effects.JUMP, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.shiwang)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 2);
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.jinming)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 1);
            PropUtils.addEffect(player, Effects.JUMP, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 3);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.ban)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.liudao)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 2);
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 1);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.gaiya)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.daina)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.xieedijia)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.sailuo)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.dijia)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.REGENERATION, 1, 8);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.ironman)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 5);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.fengmoshiwang)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 4);
            PropUtils.addEffect(player, Effects.JUMP, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 4);
            PropUtils.addEffect(player, Effects.GLOWING, 1, 1);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.dihuang)) {
            PropUtils.addEffect(player, Effects.MOVEMENT_SPEED, 1, 5);
            PropUtils.addEffect(player, Effects.JUMP, 1, 2);
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 3);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 2);
            PropUtils.addEffect(player, Effects.GLOWING, 1, 1);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.notch)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 5);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 5);
            PropUtils.addEffect(player, Effects.GLOWING, 1, 1);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
        } else if (PropUtils.isPlayerEquipArmor(player, ArmorList.him)) {
            PropUtils.addEffect(player, Effects.DAMAGE_RESISTANCE, 1, 5);
            PropUtils.addEffect(player, Effects.DAMAGE_BOOST, 1, 5);
            PropUtils.addEffect(player, Effects.GLOWING, 1, 1);
            PropUtils.addEffect(player, EffectsList.flight, 1, 1);
        }
    }
}
