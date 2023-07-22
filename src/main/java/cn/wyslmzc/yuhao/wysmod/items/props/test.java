package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class test extends Item {
    public test(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a用于测试代码");
        tip.addInfo("§e用于测试代码");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (PropUtils.isPlayerEquipArmor(player, ArmorList.crystal)) {
            PropUtils.tellRaw(world, "玩家 §a" + player.getName().getContents() + "§r 穿戴了装备!");
        } else {
            PropUtils.tellRaw(world, "玩家 §a" + player.getName().getContents() + "§r 未穿戴装备!");
        }
        return super.use(world, player, hand);
    }
}
