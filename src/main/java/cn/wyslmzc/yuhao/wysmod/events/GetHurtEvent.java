package cn.wyslmzc.yuhao.wysmod.events;

import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
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
