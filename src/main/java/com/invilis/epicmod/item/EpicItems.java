package com.invilis.epicmod.item;

import com.invilis.epicmod.EpicMod;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EpicItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EpicMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",             () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",               () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> ATHELAS_LEAF = ITEMS.register("athelas_leaf",           () -> new Athelas(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB).stacksTo(16))); //.group(EpicMod.EPIC_ITEM_GROUP)
    public static final RegistryObject<Item> ATHELAS_PLANTLING = ITEMS.register("athelas_plantling", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> ATHELAS_TEA = ITEMS.register("athelas_tea",             () -> new AthelasTea(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> BALROG_SWORD = ITEMS.register("balrog_sword",           () -> new BalrogSword(4, -2.4F, new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> BOOK_OF_LEGENDS = ITEMS.register("book_of_legends",     () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> BUCKET_OF_CORN_KERNELS = ITEMS.register("bucket_of_corn_kernels", () -> new BucketOfCornKernels(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CORN_KERNELS = ITEMS.register("corn_kernels", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",                 () -> new Item(new Item.Properties().food(EpicFoods.CORN).tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",             () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> IRON_MAIL = ITEMS.register("iron_mail",       () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> IRON_SPRING = ITEMS.register("iron_spring",   () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> JELLY_BEANS = ITEMS.register("jelly_beans",   () -> new Item(new Item.Properties().food(EpicFoods.JELLY_BEANS).tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> LEMBAS = ITEMS.register("lembas",             () -> new Item(new Item.Properties().food(EpicFoods.LEMBAS).tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MALLORN_NUT = ITEMS.register("mallorn_nut",   () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",         () -> new ArmorItem(EpicArmorMaterials.MITHRIL, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(EpicArmorMaterials.MITHRIL, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",     () -> new ArmorItem(EpicArmorMaterials.MITHRIL, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",           () -> new ArmorItem(EpicArmorMaterials.MITHRIL, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",     () -> new Item(new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",     () -> new MithrilSword(3, -2.4F, new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(EpicTiers.MITHRIL, 1, -2.8F, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",   () -> new ShovelItem(EpicTiers.MITHRIL, 1.5F, -3.0F, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",         () -> new AxeItem(EpicTiers.MITHRIL, 5.0F, -3.0F, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",         () -> new Item(new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",       () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",     () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> POPCORN = ITEMS.register("popcorn", () -> new Item(new Item.Properties().food(EpicFoods.POPCORN).tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> RING_OF_FLYING = ITEMS.register("ring_of_flying", () -> new Item(new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",         () -> new Item(new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SCANNER = ITEMS.register("scanner",   () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SCANNER2 = ITEMS.register("scanner2", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SCANNER3 = ITEMS.register("scanner3", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SEASONAL_HELMET = ITEMS.register("seasonal_helmet",         () -> new SeasonalArmor(EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SEASONAL_CHESTPLATE = ITEMS.register("seasonal_chestplate", () -> new SeasonalArmor(EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SEASONAL_LEGGINGS = ITEMS.register("seasonal_leggings",     () -> new SeasonalArmor(EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SEASONAL_BOOTS = ITEMS.register("seasonal_boots",           () -> new SeasonalArmor(EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SHARD_OF_THE_INTERPLANE = ITEMS.register("shard_of_the_interplane", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SE_BARROW_WIGHT = ITEMS.register("se_barrow_wight", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SE_ELF = ITEMS.register("se_elf",                   () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SE_SHARK = ITEMS.register("se_shark",               () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> SE_OYSTER = ITEMS.register("se_oyster",             () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> THIN_IRON_WIRE = ITEMS.register("thin_iron_wire", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite", () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",         () -> new Item(new Item.Properties().tab(EpicCreativeModeTab.EPIC_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
