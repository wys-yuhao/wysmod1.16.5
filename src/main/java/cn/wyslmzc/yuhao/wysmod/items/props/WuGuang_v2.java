package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.SoundsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WuGuang_v2 extends ItemBase {

    public WuGuang_v2(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a打乱敌方背包!");
        tip.addInfo("§e感谢无光的友情出演~");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        for (PlayerEntity playerEntity : playerWorld.players()) {
            playerEntity.playSound(SoundsList.wuguang_v2, 0.8f, 1.0f);
        }

        PropUtils.runCommand(player, "execute as @s[team=blue] at @s run execute as @a[team=red] at @s run effect give @s wys:upsetting 1 1");
        PropUtils.runCommand(player, "execute as @s[team=red] at @s run execute as @a[team=blue] at @s run effect give @s wys:upsetting 1 1");


        PropUtils.title(playerWorld, player, "§6两只老虎爱跳舞");
    }
}
