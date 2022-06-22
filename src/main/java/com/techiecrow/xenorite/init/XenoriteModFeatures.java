
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import com.techiecrow.xenorite.world.features.ores.XenoriteOreFeature;
import com.techiecrow.xenorite.world.features.ores.ShadowBoronOreFeature;
import com.techiecrow.xenorite.world.features.ores.HeavenlyGlintOreFeature;
import com.techiecrow.xenorite.world.features.ores.FinoriteOreFeature;
import com.techiecrow.xenorite.world.features.ores.CoreoriteOreFeature;
import com.techiecrow.xenorite.XenoriteMod;

@Mod.EventBusSubscriber
public class XenoriteModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, XenoriteMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> XENORITE_ORE = register("xenorite_ore", XenoriteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, XenoriteOreFeature.GENERATE_BIOMES, XenoriteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COREORITE_ORE = register("coreorite_ore", CoreoriteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CoreoriteOreFeature.GENERATE_BIOMES, CoreoriteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FINORITE_ORE = register("finorite_ore", FinoriteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, FinoriteOreFeature.GENERATE_BIOMES, FinoriteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HEAVENLY_GLINT_ORE = register("heavenly_glint_ore", HeavenlyGlintOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, HeavenlyGlintOreFeature.GENERATE_BIOMES,
					HeavenlyGlintOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHADOW_BORON_ORE = register("shadow_boron_ore", ShadowBoronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ShadowBoronOreFeature.GENERATE_BIOMES,
					ShadowBoronOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
