
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.techiecrow.xenorite.item.XenoriteSwordItem;
import com.techiecrow.xenorite.item.XenoriteShovelItem;
import com.techiecrow.xenorite.item.XenoriteShearsItem;
import com.techiecrow.xenorite.item.XenoritePickaxeItem;
import com.techiecrow.xenorite.item.XenoriteIngotItem;
import com.techiecrow.xenorite.item.XenoriteHoeItem;
import com.techiecrow.xenorite.item.XenoriteAxeItem;
import com.techiecrow.xenorite.item.XenoriteArmorItem;
import com.techiecrow.xenorite.item.FinoriteSwordItem;
import com.techiecrow.xenorite.item.FinoriteShovelItem;
import com.techiecrow.xenorite.item.FinoriteShearsItem;
import com.techiecrow.xenorite.item.FinoritePickaxeItem;
import com.techiecrow.xenorite.item.FinoriteIngotItem;
import com.techiecrow.xenorite.item.FinoriteHoeItem;
import com.techiecrow.xenorite.item.FinoriteAxeItem;
import com.techiecrow.xenorite.item.FinoriteArmorItem;
import com.techiecrow.xenorite.item.CoreoriteSwordItem;
import com.techiecrow.xenorite.item.CoreoriteShovelItem;
import com.techiecrow.xenorite.item.CoreoriteShearsItem;
import com.techiecrow.xenorite.item.CoreoritePickaxeItem;
import com.techiecrow.xenorite.item.CoreoriteIngotItem;
import com.techiecrow.xenorite.item.CoreoriteHoeItem;
import com.techiecrow.xenorite.item.CoreoriteAxeItem;
import com.techiecrow.xenorite.item.CoreoriteArmorItem;
import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, XenoriteMod.MODID);
	public static final RegistryObject<Item> XENORITE_SMELTER = block(XenoriteModBlocks.XENORITE_SMELTER, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XENORITE_ORE = block(XenoriteModBlocks.XENORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> COREORITE_ORE = block(XenoriteModBlocks.COREORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> FINORITE_ORE = block(XenoriteModBlocks.FINORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XENORITE_BLOCK = block(XenoriteModBlocks.XENORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> COREORITE_BLOCK = block(XenoriteModBlocks.COREORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> FINORITE_BLOCK = block(XenoriteModBlocks.FINORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XENORITE_INGOT = REGISTRY.register("xenorite_ingot", () -> new XenoriteIngotItem());
	public static final RegistryObject<Item> COREORITE_INGOT = REGISTRY.register("coreorite_ingot", () -> new CoreoriteIngotItem());
	public static final RegistryObject<Item> FINORITE_INGOT = REGISTRY.register("finorite_ingot", () -> new FinoriteIngotItem());
	public static final RegistryObject<Item> XENORITE_PICKAXE = REGISTRY.register("xenorite_pickaxe", () -> new XenoritePickaxeItem());
	public static final RegistryObject<Item> COREORITE_PICKAXE = REGISTRY.register("coreorite_pickaxe", () -> new CoreoritePickaxeItem());
	public static final RegistryObject<Item> FINORITE_PICKAXE = REGISTRY.register("finorite_pickaxe", () -> new FinoritePickaxeItem());
	public static final RegistryObject<Item> XENORITE_SHOVEL = REGISTRY.register("xenorite_shovel", () -> new XenoriteShovelItem());
	public static final RegistryObject<Item> COREORITE_SHOVEL = REGISTRY.register("coreorite_shovel", () -> new CoreoriteShovelItem());
	public static final RegistryObject<Item> FINORITE_SHOVEL = REGISTRY.register("finorite_shovel", () -> new FinoriteShovelItem());
	public static final RegistryObject<Item> XENORITE_AXE = REGISTRY.register("xenorite_axe", () -> new XenoriteAxeItem());
	public static final RegistryObject<Item> COREORITE_AXE = REGISTRY.register("coreorite_axe", () -> new CoreoriteAxeItem());
	public static final RegistryObject<Item> FINORITE_AXE = REGISTRY.register("finorite_axe", () -> new FinoriteAxeItem());
	public static final RegistryObject<Item> XENORITE_HOE = REGISTRY.register("xenorite_hoe", () -> new XenoriteHoeItem());
	public static final RegistryObject<Item> COREORITE_HOE = REGISTRY.register("coreorite_hoe", () -> new CoreoriteHoeItem());
	public static final RegistryObject<Item> FINORITE_HOE = REGISTRY.register("finorite_hoe", () -> new FinoriteHoeItem());
	public static final RegistryObject<Item> XENORITE_SHEARS = REGISTRY.register("xenorite_shears", () -> new XenoriteShearsItem());
	public static final RegistryObject<Item> COREORITE_SHEARS = REGISTRY.register("coreorite_shears", () -> new CoreoriteShearsItem());
	public static final RegistryObject<Item> FINORITE_SHEARS = REGISTRY.register("finorite_shears", () -> new FinoriteShearsItem());
	public static final RegistryObject<Item> XENORITE_SWORD = REGISTRY.register("xenorite_sword", () -> new XenoriteSwordItem());
	public static final RegistryObject<Item> COREORITE_SWORD = REGISTRY.register("coreorite_sword", () -> new CoreoriteSwordItem());
	public static final RegistryObject<Item> FINORITE_SWORD = REGISTRY.register("finorite_sword", () -> new FinoriteSwordItem());
	public static final RegistryObject<Item> XENORITE_ARMOR_HELMET = REGISTRY.register("xenorite_armor_helmet", () -> new XenoriteArmorItem.Helmet());
	public static final RegistryObject<Item> XENORITE_ARMOR_CHESTPLATE = REGISTRY.register("xenorite_armor_chestplate",
			() -> new XenoriteArmorItem.Chestplate());
	public static final RegistryObject<Item> XENORITE_ARMOR_LEGGINGS = REGISTRY.register("xenorite_armor_leggings",
			() -> new XenoriteArmorItem.Leggings());
	public static final RegistryObject<Item> XENORITE_ARMOR_BOOTS = REGISTRY.register("xenorite_armor_boots", () -> new XenoriteArmorItem.Boots());
	public static final RegistryObject<Item> COREORITE_ARMOR_HELMET = REGISTRY.register("coreorite_armor_helmet",
			() -> new CoreoriteArmorItem.Helmet());
	public static final RegistryObject<Item> COREORITE_ARMOR_CHESTPLATE = REGISTRY.register("coreorite_armor_chestplate",
			() -> new CoreoriteArmorItem.Chestplate());
	public static final RegistryObject<Item> COREORITE_ARMOR_LEGGINGS = REGISTRY.register("coreorite_armor_leggings",
			() -> new CoreoriteArmorItem.Leggings());
	public static final RegistryObject<Item> COREORITE_ARMOR_BOOTS = REGISTRY.register("coreorite_armor_boots", () -> new CoreoriteArmorItem.Boots());
	public static final RegistryObject<Item> FINORITE_ARMOR_HELMET = REGISTRY.register("finorite_armor_helmet", () -> new FinoriteArmorItem.Helmet());
	public static final RegistryObject<Item> FINORITE_ARMOR_CHESTPLATE = REGISTRY.register("finorite_armor_chestplate",
			() -> new FinoriteArmorItem.Chestplate());
	public static final RegistryObject<Item> FINORITE_ARMOR_LEGGINGS = REGISTRY.register("finorite_armor_leggings",
			() -> new FinoriteArmorItem.Leggings());
	public static final RegistryObject<Item> FINORITE_ARMOR_BOOTS = REGISTRY.register("finorite_armor_boots", () -> new FinoriteArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
