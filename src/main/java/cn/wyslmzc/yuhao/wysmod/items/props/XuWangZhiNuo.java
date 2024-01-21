package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.VarInstance;
import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class XuWangZhiNuo extends ItemBase {
    public XuWangZhiNuo(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§6暂时篡改自身的命运。");
        tip.addTip("§6技能期间受到的所有伤害效果将在虚妄之诺结束后结算");
        tip.addTip("§6结算后将以魔法伤害(类似伤害药水)返还");
        tip.addTip("§6施放时将移除目标身上大部分的负面状态效果。");
        tip.addTip("§6持续时间: §a10s");

        tip.addInfo("§8来自DOTA2-神谕者");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        Map<Effect, EffectInstance> activeEffectsMap = player.getActiveEffectsMap();
        for (Effect effect : activeEffectsMap.keySet()) {
            if (effect.isBeneficial()) {
                continue;
            }
            player.removeEffect(effect);
        }

        player.addEffect(new EffectInstance(EffectsList.xuwangzhinuo, 200, 10, true, true));
        PropUtils.title(playerWorld, player, "§5§l虚妄之诺");
        VarInstance.INSTANCE.xuwangzhinuo.put(player, 0d);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                float damage = VarInstance.INSTANCE.xuwangzhinuo.get(player).floatValue();
                player.hurt(DamageSource.MAGIC, damage);
                PropUtils.tellRaw(playerWorld, "§5§l[虚妄之诺]§6伤害结算: §a" + damage);
                VarInstance.INSTANCE.xuwangzhinuo.remove(player);
            }
        };
        timer.schedule(timerTask, 10000);

    }
}
