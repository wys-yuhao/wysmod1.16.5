package cn.wyslmzc.yuhao.wysmod.items.props.transformer;

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

public class DaiNa extends Item {
    public DaiNa(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§a变身为戴拿奥特曼");
        tip.addTip("§c注意会替换装备栏!");
        tip.addInfo("§e");

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        World playerWorld = player.level;

        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.runCommand(player, "replaceitem entity @s armor.head wys:daina_helmet");
        PropUtils.runCommand(player, "replaceitem entity @s armor.chest wys:daina_chest");
        PropUtils.runCommand(player, "replaceitem entity @s armor.legs wys:daina_legging");
        PropUtils.runCommand(player, "replaceitem entity @s armor.feet wys:daina_feet");

        PropUtils.runCommand(player, "particle minecraft:explosion ~ ~ ~ 2 2 2 0 500 force");


        PropUtils.title(playerWorld, player, "§a§l戴拿奥特曼");

        return ActionResult.pass(itemstack);
    }
}