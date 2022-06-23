
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.techiecrow.xenorite.block.XenoriteSmelterBlock;
import com.techiecrow.xenorite.block.XenoriteOreBlock;
import com.techiecrow.xenorite.block.XenoriteBlockBlock;
import com.techiecrow.xenorite.block.ShadowBoronOreBlock;
import com.techiecrow.xenorite.block.ShadowBoronBlockBlock;
import com.techiecrow.xenorite.block.HeavenlyGlintOreBlock;
import com.techiecrow.xenorite.block.HeavenlyGlintBlockBlock;
import com.techiecrow.xenorite.block.FinoriteOreBlock;
import com.techiecrow.xenorite.block.FinoriteBlockBlock;
import com.techiecrow.xenorite.block.CoreoriteOreBlock;
import com.techiecrow.xenorite.block.CoreoriteBlockBlock;
import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, XenoriteMod.MODID);
	public static final RegistryObject<Block> XENORITE_ORE = REGISTRY.register("xenorite_ore", () -> new XenoriteOreBlock());
	public static final RegistryObject<Block> COREORITE_ORE = REGISTRY.register("coreorite_ore", () -> new CoreoriteOreBlock());
	public static final RegistryObject<Block> FINORITE_ORE = REGISTRY.register("finorite_ore", () -> new FinoriteOreBlock());
	public static final RegistryObject<Block> HEAVENLY_GLINT_ORE = REGISTRY.register("heavenly_glint_ore", () -> new HeavenlyGlintOreBlock());
	public static final RegistryObject<Block> SHADOW_BORON_ORE = REGISTRY.register("shadow_boron_ore", () -> new ShadowBoronOreBlock());
	public static final RegistryObject<Block> XENORITE_BLOCK = REGISTRY.register("xenorite_block", () -> new XenoriteBlockBlock());
	public static final RegistryObject<Block> COREORITE_BLOCK = REGISTRY.register("coreorite_block", () -> new CoreoriteBlockBlock());
	public static final RegistryObject<Block> FINORITE_BLOCK = REGISTRY.register("finorite_block", () -> new FinoriteBlockBlock());
	public static final RegistryObject<Block> HEAVENLY_GLINT_BLOCK = REGISTRY.register("heavenly_glint_block", () -> new HeavenlyGlintBlockBlock());
	public static final RegistryObject<Block> SHADOW_BORON_BLOCK = REGISTRY.register("shadow_boron_block", () -> new ShadowBoronBlockBlock());
	public static final RegistryObject<Block> XENORITE_SMELTER = REGISTRY.register("xenorite_smelter", () -> new XenoriteSmelterBlock());
}
