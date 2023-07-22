package cn.wyslmzc.yuhao.wysmod.items.props.runes;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Regeneration extends RuneBase {
    public Regeneration(Properties p_i48487_1_) {
        super(p_i48487_1_, true, "minecraft:regeneration", 9);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a给予自己§d生命恢复§aLv.10*1s");
        tip.addInfo("§e《打的不如回的多》");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }
}
