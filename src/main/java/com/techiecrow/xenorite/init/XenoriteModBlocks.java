
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
import com.techiecrow.xenorite.block.FinoriteOreBlock;
import com.techiecrow.xenorite.block.FinoriteBlockBlock;
import com.techiecrow.xenorite.block.CoreoriteOreBlock;
import com.techiecrow.xenorite.block.CoreoriteBlockBlock;
import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, XenoriteMod.MODID);
	public static final RegistryObject<Block> XENORITE_SMELTER = REGISTRY.register("xenorite_smelter", () -> new XenoriteSmelterBlock());
	public static final RegistryObject<Block> XENORITE_ORE = REGISTRY.register("xenorite_ore", () -> new XenoriteOreBlock());
	public static final RegistryObject<Block> COREORITE_ORE = REGISTRY.register("coreorite_ore", () -> new CoreoriteOreBlock());
	public static final RegistryObject<Block> FINORITE_ORE = REGISTRY.register("finorite_ore", () -> new FinoriteOreBlock());
	public static final RegistryObject<Block> XENORITE_BLOCK = REGISTRY.register("xenorite_block", () -> new XenoriteBlockBlock());
	public static final RegistryObject<Block> COREORITE_BLOCK = REGISTRY.register("coreorite_block", () -> new CoreoriteBlockBlock());
	public static final RegistryObject<Block> FINORITE_BLOCK = REGISTRY.register("finorite_block", () -> new FinoriteBlockBlock());
}
