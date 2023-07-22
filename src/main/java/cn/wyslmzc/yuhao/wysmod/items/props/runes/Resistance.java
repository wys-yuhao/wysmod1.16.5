package cn.wyslmzc.yuhao.wysmod.items.props.runes;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Resistance extends RuneBase {
    public Resistance(Properties p_i48487_1_) {
        super(p_i48487_1_, true, "minecraft:resistance");
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a给予自己§b抗性§aIII*1s");
        tip.addInfo("§e《因为太怕疼所以全点防御力了》");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }
}
