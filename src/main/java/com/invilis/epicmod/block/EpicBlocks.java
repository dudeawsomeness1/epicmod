package com.invilis.epicmod.block;

import java.util.function.Supplier;

import com.invilis.epicmod.EpicMod;
import com.invilis.epicmod.item.EpicCreativeModeTab;
import com.invilis.epicmod.item.EpicItems;

import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DeadBushBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EpicBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicMod.MOD_ID);

    // destroy time: value * 150 = seconds to break?
    public static final RegistryObject<Block> ATHELAS = registerBlock("athelas",
        () -> new FlowerBlock(MobEffects.HEAL, 1, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> ATHELAS_CROP = registerBlock("athelas_crop",
        () -> new AthelasCrop(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
        () -> new SandBlock(0x000000, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).strength(0.5f).sound(SoundType.SAND)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> BLESSED_CORN = registerBlock("blessed_corn",
        () -> new BlessedCorn(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> CORN_KERNEL_BLOCK = registerBlock("corn_kernel_block",
        () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE).strength(0.5f).sound(SoundType.SAND)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock("mithril_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0F, 5.0F)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
        () -> new Block(BlockBehaviour.Properties.copy(MITHRIL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.7F, 3.5F).sound(SoundType.DEEPSLATE)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(RUBY_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MAGICALITY_TABLE = registerBlock("magicality_table",
        () -> new MagicalityTable(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MALLORN_DOOR = registerBlock("mallorn_door",
        () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.1F).sound(SoundType.WOOD).noOcclusion()), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MALLORN_LEAVES_AUTUMNAL = registerBlock("mallorn_leaves_autumnal",
        () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MALLORN_LEAVES = registerBlock("mallorn_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MALLORN_LOG = registerBlock("mallorn_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (bs) -> {
            return bs.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.SAND : MaterialColor.QUARTZ;
         }).strength(2.1F).sound(SoundType.WOOD)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MALLORN_PLANKS = registerBlock("mallorn_planks",
        () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.1F, 3.5F).sound(SoundType.WOOD)), EpicCreativeModeTab.EPIC_TAB);
    /*public static final RegistryObject<Block> MALLORN_SAPLING = registerBlock("mallorn_sapling",
        () -> new SaplingBlock(new AbstractTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), EpicCreativeModeTab.EPIC_TAB);*/
    public static final RegistryObject<Block> MALLORN_TRAPDOOR = registerBlock("mallorn_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.1F).sound(SoundType.WOOD).noOcclusion()), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(52.0F, 1250.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    //public static final RegistryObject<Block> MITHRIL_CHEST = registerBlock("mithril_chest", block, EpicCreativeModeTab.EPIC_TAB);
    //public static final RegistryObject<Block> ELVEN_PORTAL = registerBlock("elven_portal", block, EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> STRIPPED_MALLORN_LOG = registerBlock("stripped_mallorn_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.1F).sound(SoundType.WOOD)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> TANZANITE_BLOCK = registerBlock("tanzanite_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2.3F, 5.7F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(4.0F, 6.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(3.5F, 5.9F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(3.0F, 5.8F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2.3F, 5.7F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2.0F, 5.6F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(3.0F, 5.8F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(4.4F, 6.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(4.7F, 6.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> WITHERED_BUSH = registerBlock("withered_bush",
        () -> new DeadBushBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noCollission().instabreak().sound(SoundType.GRASS)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().strength(32.0F, 1250.0F).sound(SoundType.METAL)), EpicCreativeModeTab.EPIC_TAB);
    public static final RegistryObject<Block> ADAMANT = registerBlock("adamant",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(6.0F, 6.5F).sound(SoundType.STONE)), EpicCreativeModeTab.EPIC_TAB);
    //public static final RegistryObject<Block> ZZZ = registerBlock("zzz", block, EpicCreativeModeTab.EPIC_TAB);
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return EpicItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
