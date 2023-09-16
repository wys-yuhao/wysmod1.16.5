package cn.wyslmzc.yuhao.wysmod.items.props.transformer;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.ArmorList;
import cn.wyslmzc.yuhao.wysmod.utils.ArmorSuit;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SaiLuo extends ItemBase {
    private final ArmorSuit armor = ArmorList.sailuo;

    public SaiLuo(Properties properties) {
        super(properties);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a变身为赛罗奥特曼");
        tip.addTip("§c注意会替换装备栏!");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        PropUtils.runCommand(player, "replaceitem entity @s armor.head wys:sailuo_helmet");
        PropUtils.runCommand(player, "replaceitem entity @s armor.chest wys:sailuo_chest");
        PropUtils.runCommand(player, "replaceitem entity @s armor.legs wys:sailuo_legging");
        PropUtils.runCommand(player, "replaceitem entity @s armor.feet wys:sailuo_feet");

        PropUtils.runCommand(player, "particle minecraft:explosion ~ ~ ~ 2 2 2 0 500 force");


        PropUtils.title(playerWorld, player, "§7§l赛罗奥特曼");
    }
}