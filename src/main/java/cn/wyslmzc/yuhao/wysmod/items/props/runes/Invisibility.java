package cn.wyslmzc.yuhao.wysmod.items.props.runes;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Invisibility extends RuneBase {
    public Invisibility(Properties p_i48487_1_) {
        super(p_i48487_1_, true, "minecraft:invisibility");
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a给予自己§7隐身§aIII*1s");
        tip.addInfo("§eA1高闪来一个好吗?");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }
}
