package net.vagri.thecraft.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import net.vagri.thecraft.item.ModCreativeModeTab;
import net.vagri.thecraft.item.ModItems;
import net.vagri.thecraft.thecraft;

import java.util.function.Supplier;

public class ModBlocks{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, thecraft.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_END_STEEL = registerBlock("blockofendsteel",
            () ->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    public static final RegistryObject<Block> BLOCK_OF_RAW_END_STEEL = registerBlock("blockofrawendsteel",
            () ->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    public static final RegistryObject<Block> END_STEEL_ORE = registerBlock("endsteelore",
            () ->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(2,6)), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    public static final RegistryObject<Block> ANUN_ORE = registerBlock("anunore",
            () ->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,9)), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    public static final RegistryObject<Block> BLOCK_OF_ENDERNIUM = registerBlock("blockofendernium",
            () ->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    public static final RegistryObject<Block> SOLID_FARMLAND = registerBlock("solidfarmland",
            () ->new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_CRAFT_BLOCK_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
