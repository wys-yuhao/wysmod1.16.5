package cn.wyslmzc.yuhao.wysmod.items;

import cn.wyslmzc.yuhao.wysmod.utils.PropUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TestProp extends Item {
    public TestProp(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        World pw = player.level;

        PropUtils.runCommand(pw, "tp @a ~ ~10 ~");
        PropUtils.title(pw, "test");

        return ActionResult.pass(itemstack);
    }

}
