
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.techiecrow.xenorite.XenoriteMod;

public class XenoriteModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, XenoriteMod.MODID);
	public static final RegistryObject<ParticleType<?>> XEENORITE_SMELTER_PARTICLES = REGISTRY.register("xeenorite_smelter_particles",
			() -> new SimpleParticleType(false));
}
