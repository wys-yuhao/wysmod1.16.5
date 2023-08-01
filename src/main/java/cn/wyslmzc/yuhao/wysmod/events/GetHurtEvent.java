package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.VauleInstance;
import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
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
            int count = VauleInstance.INSTANCE.ironmanHurtCount.get(player);
            if (count < 3) {
                VauleInstance.INSTANCE.ironmanHurtCount.put(player, count + 1);
                PropUtils.actionBarTitle(player.level, player, "§6[钢铁侠套装]§d剩余耐久: " + (3 - count) + "/3");
            } else {
                PropUtils.actionBarTitle(player.level, player, "§6[钢铁侠套装]§c§l已损坏!");
                for (ItemStack armor : player.getArmorSlots()) {
                    armor = ItemStack.EMPTY;
                }
                player.inventory.setChanged();
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
