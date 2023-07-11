package cn.wyslmzc.yuhao.wysmod.items.props.runes;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RuneBase extends Item {
    String effect;
    boolean self;

    public RuneBase(Properties p_i48487_1_, boolean self, String effect) {
        super(p_i48487_1_);
        this.effect = effect;
        this.self = self;
    }

    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity _player, int p_77663_4_, boolean p_77663_5_) {
        if (!(_player instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) _player;
        if (self) {
            PropUtils.runCommand(player, "effect give @s " + effect + " 1 2");
        } else {
            PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[distance=0..8,team=red] at @s run effect give @s " + effect + " 1 2");
            PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[distance=0..8,team=blue] at @s run effect give @s " + effect + " 1 2");
        }
        super.inventoryTick(p_77663_1_, p_77663_2_, player, p_77663_4_, p_77663_5_);
    }
}
