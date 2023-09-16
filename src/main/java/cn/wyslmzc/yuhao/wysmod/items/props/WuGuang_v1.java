package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.list.EffectsList;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WuGuang_v1 extends ItemBase {

    public WuGuang_v1(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a艺术就是§c爆炸§a!");
        tip.addInfo("§e感谢无光的友情出演~");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        player.addEffect(new EffectInstance(EffectsList.explosionself, 5, 10, true, true));

        PropUtils.title(playerWorld, player, "§c享受艺术吧！！！！");
    }

}
