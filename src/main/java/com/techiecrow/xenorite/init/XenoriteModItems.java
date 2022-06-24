
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.techiecrow.xenorite.item.XenoriteSwordItem;
import com.techiecrow.xenorite.item.XenoriteShovelItem;
import com.techiecrow.xenorite.item.XenoritePickaxeItem;
import com.techiecrow.xenorite.item.XenoriteIngotItem;
import com.techiecrow.xenorite.item.XenoriteHoeItem;
import com.techiecrow.xenorite.item.XenoriteAxeItem;
import com.techiecrow.xenorite.item.XenoriteArmorItem;
import com.techiecrow.xenorite.item.XenBookVol1Item;
import com.techiecrow.xenorite.item.UniverseSoulSplitItem;
import com.techiecrow.xenorite.item.ShadowBoronSwordItem;
import com.techiecrow.xenorite.item.ShadowBoronShovelItem;
import com.techiecrow.xenorite.item.ShadowBoronPickaxeItem;
import com.techiecrow.xenorite.item.ShadowBoronIngotItem;
import com.techiecrow.xenorite.item.ShadowBoronHoeItem;
import com.techiecrow.xenorite.item.ShadowBoronAxeItem;
import com.techiecrow.xenorite.item.ShadowBoronArmorItem;
import com.techiecrow.xenorite.item.HeavenlyGlintSwordItem;
import com.techiecrow.xenorite.item.HeavenlyGlintShovelItem;
import com.techiecrow.xenorite.item.HeavenlyGlintPickaxeItem;
import com.techiecrow.xenorite.item.HeavenlyGlintIngotItem;
import com.techiecrow.xenorite.item.HeavenlyGlintHoeItem;
import com.techiecrow.xenorite.item.HeavenlyGlintAxeItem;
import com.techiecrow.xenorite.item.HeavenlyGlintArmorItem;
import com.techiecrow.xenorite.item.FinoriteSwordItem;
import com.techiecrow.xenorite.item.FinoriteShovelItem;
import com.techiecrow.xenorite.item.FinoritePickaxeItem;
import com.techiecrow.xenorite.item.FinoriteIngotItem;
import com.techiecrow.xenorite.item.FinoriteHoeItem;
import com.techiecrow.xenorite.item.FinoriteAxeItem;
import com.techiecrow.xenorite.item.FinoriteArmorItem;
import com.techiecrow.xenorite.item.CoreoriteSwordItem;
import com.techiecrow.xenorite.item.CoreoriteShovelItem;
import com.techiecrow.xenorite.item.CoreoritePickaxeItem;
import com.techiecrow.xenorite.item.CoreoriteIngotItem;
import com.techiecrow.xenorite.item.CoreoriteHoeItem;
import com.techiecrow.xenorite.item.CoreoriteAxeItem;
import com.techiecrow.xenorite.item.CoreoriteArmorItem;
import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, XenoriteMod.MODID);
	public static final RegistryObject<Item> XENORITE_ORE = block(XenoriteModBlocks.XENORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> COREORITE_ORE = block(XenoriteModBlocks.COREORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> FINORITE_ORE = block(XenoriteModBlocks.FINORITE_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> HEAVENLY_GLINT_ORE = block(XenoriteModBlocks.HEAVENLY_GLINT_ORE,
			XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> SHADOW_BORON_ORE = block(XenoriteModBlocks.SHADOW_BORON_ORE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XENORITE_BLOCK = block(XenoriteModBlocks.XENORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> COREORITE_BLOCK = block(XenoriteModBlocks.COREORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> FINORITE_BLOCK = block(XenoriteModBlocks.FINORITE_BLOCK, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> HEAVENLY_GLINT_BLOCK = block(XenoriteModBlocks.HEAVENLY_GLINT_BLOCK,
			XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> SHADOW_BORON_BLOCK = block(XenoriteModBlocks.SHADOW_BORON_BLOCK,
			XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XENORITE_INGOT = REGISTRY.register("xenorite_ingot", () -> new XenoriteIngotItem());
	public static final RegistryObject<Item> COREORITE_INGOT = REGISTRY.register("coreorite_ingot", () -> new CoreoriteIngotItem());
	public static final RegistryObject<Item> FINORITE_INGOT = REGISTRY.register("finorite_ingot", () -> new FinoriteIngotItem());
	public static final RegistryObject<Item> SHADOW_BORON_INGOT = REGISTRY.register("shadow_boron_ingot", () -> new ShadowBoronIngotItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_INGOT = REGISTRY.register("heavenly_glint_ingot", () -> new HeavenlyGlintIngotItem());
	public static final RegistryObject<Item> XENORITE_SWORD = REGISTRY.register("xenorite_sword", () -> new XenoriteSwordItem());
	public static final RegistryObject<Item> COREORITE_SWORD = REGISTRY.register("coreorite_sword", () -> new CoreoriteSwordItem());
	public static final RegistryObject<Item> FINORITE_SWORD = REGISTRY.register("finorite_sword", () -> new FinoriteSwordItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_SWORD = REGISTRY.register("heavenly_glint_sword", () -> new HeavenlyGlintSwordItem());
	public static final RegistryObject<Item> SHADOW_BORON_SWORD = REGISTRY.register("shadow_boron_sword", () -> new ShadowBoronSwordItem());
	public static final RegistryObject<Item> XENORITE_PICKAXE = REGISTRY.register("xenorite_pickaxe", () -> new XenoritePickaxeItem());
	public static final RegistryObject<Item> COREORITE_PICKAXE = REGISTRY.register("coreorite_pickaxe", () -> new CoreoritePickaxeItem());
	public static final RegistryObject<Item> FINORITE_PICKAXE = REGISTRY.register("finorite_pickaxe", () -> new FinoritePickaxeItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_PICKAXE = REGISTRY.register("heavenly_glint_pickaxe",
			() -> new HeavenlyGlintPickaxeItem());
	public static final RegistryObject<Item> SHADOW_BORON_PICKAXE = REGISTRY.register("shadow_boron_pickaxe", () -> new ShadowBoronPickaxeItem());
	public static final RegistryObject<Item> XENORITE_SHOVEL = REGISTRY.register("xenorite_shovel", () -> new XenoriteShovelItem());
	public static final RegistryObject<Item> COREORITE_SHOVEL = REGISTRY.register("coreorite_shovel", () -> new CoreoriteShovelItem());
	public static final RegistryObject<Item> FINORITE_SHOVEL = REGISTRY.register("finorite_shovel", () -> new FinoriteShovelItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_SHOVEL = REGISTRY.register("heavenly_glint_shovel", () -> new HeavenlyGlintShovelItem());
	public static final RegistryObject<Item> SHADOW_BORON_SHOVEL = REGISTRY.register("shadow_boron_shovel", () -> new ShadowBoronShovelItem());
	public static final RegistryObject<Item> XENORITE_AXE = REGISTRY.register("xenorite_axe", () -> new XenoriteAxeItem());
	public static final RegistryObject<Item> COREORITE_AXE = REGISTRY.register("coreorite_axe", () -> new CoreoriteAxeItem());
	public static final RegistryObject<Item> FINORITE_AXE = REGISTRY.register("finorite_axe", () -> new FinoriteAxeItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_AXE = REGISTRY.register("heavenly_glint_axe", () -> new HeavenlyGlintAxeItem());
	public static final RegistryObject<Item> SHADOW_BORON_AXE = REGISTRY.register("shadow_boron_axe", () -> new ShadowBoronAxeItem());
	public static final RegistryObject<Item> XENORITE_HOE = REGISTRY.register("xenorite_hoe", () -> new XenoriteHoeItem());
	public static final RegistryObject<Item> COREORITE_HOE = REGISTRY.register("coreorite_hoe", () -> new CoreoriteHoeItem());
	public static final RegistryObject<Item> FINORITE_HOE = REGISTRY.register("finorite_hoe", () -> new FinoriteHoeItem());
	public static final RegistryObject<Item> HEAVENLY_GLINT_HOE = REGISTRY.register("heavenly_glint_hoe", () -> new HeavenlyGlintHoeItem());
	public static final RegistryObject<Item> SHADOW_BORON_HOE = REGISTRY.register("shadow_boron_hoe", () -> new ShadowBoronHoeItem());
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
	public static final RegistryObject<Item> HEAVENLY_GLINT_ARMOR_HELMET = REGISTRY.register("heavenly_glint_armor_helmet",
			() -> new HeavenlyGlintArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVENLY_GLINT_ARMOR_CHESTPLATE = REGISTRY.register("heavenly_glint_armor_chestplate",
			() -> new HeavenlyGlintArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVENLY_GLINT_ARMOR_LEGGINGS = REGISTRY.register("heavenly_glint_armor_leggings",
			() -> new HeavenlyGlintArmorItem.Leggings());
	public static final RegistryObject<Item> HEAVENLY_GLINT_ARMOR_BOOTS = REGISTRY.register("heavenly_glint_armor_boots",
			() -> new HeavenlyGlintArmorItem.Boots());
	public static final RegistryObject<Item> SHADOW_BORON_ARMOR_HELMET = REGISTRY.register("shadow_boron_armor_helmet",
			() -> new ShadowBoronArmorItem.Helmet());
	public static final RegistryObject<Item> SHADOW_BORON_ARMOR_CHESTPLATE = REGISTRY.register("shadow_boron_armor_chestplate",
			() -> new ShadowBoronArmorItem.Chestplate());
	public static final RegistryObject<Item> SHADOW_BORON_ARMOR_LEGGINGS = REGISTRY.register("shadow_boron_armor_leggings",
			() -> new ShadowBoronArmorItem.Leggings());
	public static final RegistryObject<Item> SHADOW_BORON_ARMOR_BOOTS = REGISTRY.register("shadow_boron_armor_boots",
			() -> new ShadowBoronArmorItem.Boots());
	public static final RegistryObject<Item> XENORITE_SMELTER = block(XenoriteModBlocks.XENORITE_SMELTER, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);
	public static final RegistryObject<Item> XEN_BOOK_VOL_1 = REGISTRY.register("xen_book_vol_1", () -> new XenBookVol1Item());
	public static final RegistryObject<Item> XEN_BEAST = REGISTRY.register("xen_beast_spawn_egg",
			() -> new ForgeSpawnEggItem(XenoriteModEntities.XEN_BEAST, -1, -1, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB)));
	public static final RegistryObject<Item> XEN_PIG = REGISTRY.register("xen_pig_spawn_egg",
			() -> new ForgeSpawnEggItem(XenoriteModEntities.XEN_PIG, -1, -1, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB)));
	public static final RegistryObject<Item> UNIVERSE_SOUL_SPLIT = REGISTRY.register("universe_soul_split", () -> new UniverseSoulSplitItem());
	public static final RegistryObject<Item> SOUL_TABLE = block(XenoriteModBlocks.SOUL_TABLE, XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
