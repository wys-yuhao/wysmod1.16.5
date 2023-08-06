package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.VarInstance;
import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber
public class GetHurtEvent {
    @SubscribeEvent
    public static void event(LivingDamageEvent event) {
        if (!(event.getEntity() instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) event.getEntity();
        //闪避
        invulnerable(event, player);
        //钢铁侠套装
        ironman(event, player);
    }

    private static void ironman(LivingDamageEvent event, PlayerEntity player) {
        if (PropUtils.isPlayerEquipArmor(player, ArmorList.ironman)) {
            int count = 1;
            try {
                count = VarInstance.INSTANCE.ironmanHurtCount.get(player);
            } catch (Exception e) {
                VarInstance.INSTANCE.ironmanHurtCount.put(player, count + 1);
            }

            if (count < 8) {
                VarInstance.INSTANCE.ironmanHurtCount.put(player, count + 1);
                PropUtils.actionBarTitle(player.level, player, "§6[钢铁侠套装]§d剩余耐久: " + (8 - count) + "/8");
            } else {
                VarInstance.INSTANCE.ironmanHurtCount.put(player, 0);
                PropUtils.actionBarTitle(player.level, player, "§6[钢铁侠套装]§c§l已损坏!");

                player.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);

                PropUtils.runCommand(player, "replaceitem entity @s armor.head air");
                PropUtils.runCommand(player, "replaceitem entity @s armor.chest air");
                PropUtils.runCommand(player, "replaceitem entity @s armor.legs air");
                PropUtils.runCommand(player, "replaceitem entity @s armor.feet air");
            }
        }
    }

    private static void invulnerable(LivingDamageEvent event, PlayerEntity player) {
        if (!player.hasEffect(EffectsList.invulnerable)) {
            return;
        }

        int level = Objects.requireNonNull(player.getEffect(EffectsList.invulnerable)).getAmplifier();

        int i = player.getRandom().nextInt(10);

        if (i <= level) {
            event.setCanceled(true);
            PropUtils.actionBarTitle(player.level, player, "§6§l您闪避了一次攻击!");
        }
    }

}
