package cn.wyslmzc.yuhao.wysmod.items.foods;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class SweetMadame extends Item {

    public SweetMadame(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a吃下获取§d瞬间治疗§aLV10一秒 ");
        tip.addInfo("§e蜜酿后烤熟的禽肉");
        tip.addInfo("§e肉质如同流蜜一般香甜软糯");
        tip.addInfo("§e叫人想把每一根骨头都吮吸干净");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }
}
