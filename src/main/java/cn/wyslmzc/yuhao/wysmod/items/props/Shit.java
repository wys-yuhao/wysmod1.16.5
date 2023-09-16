package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Shit extends ItemBase {

    public Shit(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a给予敌方缓慢效果");
        tip.addInfo("§b站岗ing");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : playerWorld.players()) {
            playerEntity.playSound(SoundsList.aoligei, 0.8f, 1.0f);
        }

        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s slowness 5 255");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s slowness 5 255");

        PropUtils.title(playerWorld, player, "§c奥力给");
    }
}