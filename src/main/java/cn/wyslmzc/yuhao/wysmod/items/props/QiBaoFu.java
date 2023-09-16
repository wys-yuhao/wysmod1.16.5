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

public class QiBaoFu extends ItemBase {

    public QiBaoFu(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§a使用后引发爆炸!");
        tip.addInfo("§e起爆符，又名爆破符\n" +
                "是一种符咒，引爆之后，经过一定时间后就可爆炸\n" +
                "威力巨大，不亚于上忍释放的高级火遁忍术");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        player.setItemInHand(hand, ItemStack.EMPTY);

        player.addEffect(new EffectInstance(EffectsList.explosionself, 5, 20, true, true));

        PropUtils.title(playerWorld, player, "§c引爆了起爆符!");
    }
}
