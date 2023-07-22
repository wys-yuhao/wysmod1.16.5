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
    int level;

    public RuneBase(Properties p_i48487_1_, boolean self, String effect) {
        super(p_i48487_1_);
        this.effect = effect;
        this.self = self;
        this.level = 2;
    }

    public RuneBase(Properties p_i48487_1_, boolean self, String effect, int level) {
        super(p_i48487_1_);
        this.effect = effect;
        this.self = self;
        this.level = level;
    }

    @Override
    public void inventoryTick(ItemStack itemStack, World world, Entity _player, int p_77663_4_, boolean p_77663_5_) {
        if (!(_player instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) _player;
        String playerName = player.getName().getContents();
        if (self) {
            PropUtils.runCommand(player.level, "effect give " + playerName + " " + effect + " 1 " + level);
        } else {
            PropUtils.runCommand(player, "execute as " + playerName + "[team=blue] at " + playerName + " run execute as @a[distance=0..8,team=red] at @s run effect give @s " + effect + " 1 " + level);
            PropUtils.runCommand(player, "execute as " + playerName + "[team=red] at " + playerName + " run execute as @a[distance=0..8,team=blue] at @s run effect give @s " + effect + " 1 " + level);
        }
        super.inventoryTick(itemStack, world, player, p_77663_4_, p_77663_5_);
    }
}
