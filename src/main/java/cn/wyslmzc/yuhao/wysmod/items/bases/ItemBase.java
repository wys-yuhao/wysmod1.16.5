package cn.wyslmzc.yuhao.wysmod.items.bases;

import cn.wyslmzc.yuhao.wysmod.utils.Tooltip;
import cn.wyslmzc.yuhao.wysmod.utils.Umpire;
import com.google.common.collect.Multimap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBase extends Item {
    public ItemBase(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        Tooltip tip = new Tooltip(tooltip);

        setTip(tip);

        tip.show();
        super.appendHoverText(p_77624_1_, p_77624_2_, tip.getTooltip(), p_77624_4_);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        //隐藏标签
        stack.addTagElement("HideFlags", IntNBT.valueOf(2));

        //传址
        setAttribute(stack);

        return super.getAttributeModifiers(slot, stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World p_77663_2_, Entity entity, int p_77663_4_, boolean selected) {
        if (!(entity instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) entity;

        invTick(player, player.level, stack, selected);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            return ActionResult.pass(itemstack);
        }



        World playerWorld = player.level;


        //裁判系统发送文本
        Umpire.send(playerWorld, player, "§d使用道具:§r§l" +
                "§a「§b" +
                new TranslationTextComponent("item.wys." + itemstack.getItem().getRegistryName().getPath()).getString() +
                "§r§a」");

        useTick(player, playerWorld, itemstack, hand);

        return ActionResult.pass(itemstack);
    }

    public void setTip(Tooltip tip) {
    }

    public void setAttribute(ItemStack stack) {
    }

    public void invTick(PlayerEntity player, World level, ItemStack stack, boolean isSelected) {
    }

    public void useTick(PlayerEntity player, World playerWorld, ItemStack itemstack, Hand hand) {
    }
}
