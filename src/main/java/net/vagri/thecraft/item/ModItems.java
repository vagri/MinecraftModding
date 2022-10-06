package net.vagri.thecraft.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vagri.thecraft.thecraft;

import java.awt.event.InputEvent;
import java.util.UUID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, thecraft.MOD_ID);

    public static final RegistryObject<Item> endstonehandle = ITEMS.register("endstonehandle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> endsteelingot = ITEMS.register("endsteelingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> rawendsteel = ITEMS.register("rawendsteel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> endsteelnugget = ITEMS.register("endsteelnugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> anuncrystalshard = ITEMS.register("anuncrystalshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item>  anuncrystal = ITEMS.register("anuncrystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> enderniumingot = ITEMS.register("enderniumingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> pole = ITEMS.register("pole",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> branch = ITEMS.register("branch",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> rock = ITEMS.register("rock",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> hardLeather = ITEMS.register("hardleather",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));

    public static final RegistryObject<Item> steelplate = ITEMS.register("steelplate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_MISC_TAB)));




    public static final RegistryObject<SwordItem> woodenclub = ITEMS.register("woodenclub",
            () -> new SwordItem(Tiers.WOOD,5,-2.7f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> stoneclub = ITEMS.register("stoneclub",
            () -> new SwordItem(Tiers.STONE,5,-2.7f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> stonedagger = ITEMS.register("stonedagger",
            () -> new SwordItem(Tiers.STONE,2,-2f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> stonespear = ITEMS.register("stonespear",
            () -> new SwordItem(Tiers.STONE,3,-2.5f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> irondagger = ITEMS.register("irondagger",
            () -> new SwordItem(Tiers.IRON,2,-2f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironmace = ITEMS.register("ironmace",
            () -> new SwordItem(Tiers.IRON,5,-2.7f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironlongsword = ITEMS.register("ironlongsword",
            () -> new SwordItem(Tiers.IRON,7,-3f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironbattleaxe = ITEMS.register("ironbattleaxe",
            () -> new SwordItem(Tiers.IRON,7,-3.1f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironwarhammer = ITEMS.register("ironwarhammer",
            () -> new SwordItem(Tiers.IRON,8,-3.2f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironspear = ITEMS.register("ironspear",
            () -> new SwordItem(Tiers.IRON,3,-2.5f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<SwordItem> ironhalberd = ITEMS.register("ironhalberd",
            () -> new SwordItem(Tiers.IRON,5,-3f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));


    public static final RegistryObject<PickaxeItem> endsteelpickaxe = ITEMS.register("endsteelpickaxe",
            () -> new PickaxeItem(modTiers.end_steel,0,-2.8f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<AxeItem> endsteelhatchet = ITEMS.register("endsteelhatchet",
            () -> new AxeItem(modTiers.end_steel,4,-2.6f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<ShovelItem> endsteelshovel = ITEMS.register("endsteelshovel",
            () -> new ShovelItem(modTiers.end_steel,0,-3f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));

    public static final RegistryObject<HoeItem> endsteelhoe = ITEMS.register("endsteelhoe",
            () -> new HoeItem(modTiers.end_steel,0,-2f, new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB)));


    public static final RegistryObject<Item> shortbow = ITEMS.register("shortbow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.THE_CRAFT_WEAPON_TAB).durability(500)));

    public static class modTiers {
        public static final Tier end_steel = new ForgeTier(2, 800, 6, 2, 14, null,
                () -> Ingredient.of(ModItems.endsteelingot.get()));
        public static final Tier endernium = new ForgeTier(4, 1700, 9, 4, 20, null,
                () -> Ingredient.of(ModItems.enderniumingot.get()));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
