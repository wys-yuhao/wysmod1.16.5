package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Wing extends Item {
    public Wing(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a放置在背包中,获得飞行能力");
        tip.addInfo("§e♫我要飞得更高~");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity entity, int p_77663_4_, boolean p_77663_5_) {
        if (!(entity instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) entity;
        player.addEffect(new EffectInstance(EffectsList.flight, 1, 1, true, true));
        super.inventoryTick(p_77663_1_, p_77663_2_, entity, p_77663_4_, p_77663_5_);
    }
}
