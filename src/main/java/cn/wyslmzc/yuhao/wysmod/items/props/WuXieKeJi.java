package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WuXieKeJi extends ItemBase {

    public WuXieKeJi(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a使用后将免疫一切伤害 持续时间10s");
        tip.addInfo("§e我使用无懈可击无懈了你对我打出无懈可击无懈的我的无懈可击");
        tip.addInfo("§e0.o??");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        player.addEffect(new EffectInstance(EffectsList.invulnerable, 200, 10, true, true));

        PropUtils.title(playerWorld, player, "§c!无懈可击!");
    }
}