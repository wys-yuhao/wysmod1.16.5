package cn.wyslmzc.yuhao.wysmod.items.props;

import cn.wyslmzc.yuhao.wysmod.items.bases.ItemBase;
import cn.wyslmzc.yuhao.wysmod.utils.EntityMoveUtils;
import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Flash extends ItemBase {
    public Flash(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void setTip(Tooltip tip) {
        tip.addTip("§e闪现一段距离");
        tip.addTip("§a冷却时间 §l2§r§a秒");
        tip.addInfo("§e小心闪现撞墙哦");
    }

    @Override
    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
        PropUtils.runCommand(player, "playsound wys:flash voice @a ~ ~ ~");
        player.getCooldowns().addCooldown(this, 40);
        EntityMoveUtils.PushToForward(player, 2.0F);
    }

}
