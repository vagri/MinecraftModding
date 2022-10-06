package net.vagri.thecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THE_CRAFT_ARMOR_TAB = new CreativeModeTab("armortab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.endsteelingot.get());
        }
    };
    public static final CreativeModeTab THE_CRAFT_WEAPON_TAB = new CreativeModeTab("weaponstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.endsteelingot.get());
        }
    };
    public static final CreativeModeTab THE_CRAFT_BLOCK_TAB = new CreativeModeTab("blockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.endsteelingot.get());
        }
    };
    public static final CreativeModeTab THE_CRAFT_MISC_TAB = new CreativeModeTab("misctab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.endsteelingot.get());
        }
    };
    public static final CreativeModeTab THE_CRAFT_MOB_TAB = new CreativeModeTab("mobstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.endsteelingot.get());
        }
    };
}
