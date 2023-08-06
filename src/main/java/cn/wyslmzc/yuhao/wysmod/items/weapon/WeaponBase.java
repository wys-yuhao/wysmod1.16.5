package cn.wyslmzc.yuhao.wysmod.items.weapon;

import cn.wyslmzc.yuhao.wysmod.utils.ToolsTier;
import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import com.google.common.collect.Multimap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class WeaponBase extends SwordItem {
    private int damage;
    private float speed;

    public WeaponBase(int damage, float speed, Properties properties) {
        super(ToolsTier.Inf, damage - 1, speed - 4, properties);
        this.damage = damage;
        this.speed = speed;
    }

    /**
     * 取两个文本之间的文本值
     *
     * @param text  源文本 比如：欲取全文本为 12345
     * @param left  文本前面
     * @param right 后面文本
     * @return 返回 String
     */
    private static String getSubString(String text, String left, String right) {
        String result = "";
        int zLen;
        if (left == null || left.isEmpty()) {
            zLen = 0;
        } else {
            zLen = text.indexOf(left);
            if (zLen > -1) {
                zLen += left.length();
            } else {
                zLen = 0;
            }
        }
        int yLen = text.indexOf(right, zLen);
        if (yLen < 0 || right == null || right.isEmpty()) {
            yLen = text.length();
        }
        result = text.substring(zLen, yLen);
        return result;
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        tip.addTip("§c攻击伤害: +" + damage);
        tip.addTip("§b攻击速度: +" + speed + "次/秒");

        addTooltip(tip);

        tip.show();

        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        useItem(p_77659_1_, p_77659_2_, p_77659_3_);
        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        stack.addTagElement("HideFlags", IntNBT.valueOf(2));
        attribute(stack);
        return super.getAttributeModifiers(slot, stack);
    }

    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
        if (!(p_77663_3_ instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) p_77663_3_;


        if (player.getMainHandItem().getItem() == this) {
            invTick(p_77663_1_, p_77663_2_, player);
            onHandTick(p_77663_1_, p_77663_2_, player);
        } else {
            invTick(p_77663_1_, p_77663_2_, player);
        }


        super.inventoryTick(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    }

    //其他武器特殊效果
    public void addTooltip(Tooltip tooltip) {
    }

    public void useItem(World world, PlayerEntity player, Hand hand) {
    }

    public void invTick(ItemStack stack, World world, PlayerEntity player) {
    }

    public void onHandTick(ItemStack stack, World world, PlayerEntity player) {
    }

    public void attribute(ItemStack stack) {
    }
}
