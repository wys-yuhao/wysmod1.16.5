package cn.wyslmzc.yuhao.wysmod.list;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TabList {
    public static final ItemGroup adminGroup = new AdminGroup("wys_admin");
    public static final ItemGroup propGroup = new PropGroup("wys_prop");
    public static final ItemGroup weaponGroup = new WeaponGroup("wys_weapon");
    public static final ItemGroup ArmorGroup = new ArmorGroup("wys_armor");
    public static final ItemGroup foodGroup = new FoodGroup("wys_food");


    private static class AdminGroup extends ItemGroup {
        public AdminGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.test_item);
        }
    }

    private static class PropGroup extends ItemGroup {
        public PropGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.zero_purchase);
        }
    }

    private static class WeaponGroup extends ItemGroup {
        public WeaponGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SwordList.test_sword);
        }
    }

    private static class ArmorGroup extends ItemGroup {
        public ArmorGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.sweet_madame);
        }
    }

    private static class FoodGroup extends ItemGroup {
        public FoodGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.sweet_madame);
        }
    }
}
