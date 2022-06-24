
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.techiecrow.xenorite.block.entity.XenoriteSmelterBlockEntity;
import com.techiecrow.xenorite.block.entity.SoulTableBlockEntity;
import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, XenoriteMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> XENORITE_SMELTER = register("xenorite_smelter", XenoriteModBlocks.XENORITE_SMELTER,
			XenoriteSmelterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOUL_TABLE = register("soul_table", XenoriteModBlocks.SOUL_TABLE,
			SoulTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
