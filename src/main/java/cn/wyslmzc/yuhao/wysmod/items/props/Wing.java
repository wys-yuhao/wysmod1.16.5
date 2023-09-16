package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class Wing extends ItemBase {
    public Wing(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a放置在背包中,获得飞行能力");
        tip.addInfo("§e♫我要飞得更高~");
    }

    @Override
    public void invTick(PlayerEntity player, World level, ItemStack stack, boolean isSelected) {
        player.addEffect(new EffectInstance(EffectsList.flight, 1, 1, true, true));
    }
}
