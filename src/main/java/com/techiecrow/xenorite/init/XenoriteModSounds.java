
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XenoriteModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("xenorite", "xen_beast_idle"), new SoundEvent(new ResourceLocation("xenorite", "xen_beast_idle")));
		REGISTRY.put(new ResourceLocation("xenorite", "xen_beast_death"), new SoundEvent(new ResourceLocation("xenorite", "xen_beast_death")));
		REGISTRY.put(new ResourceLocation("xenorite", "xen_beast_hurt"), new SoundEvent(new ResourceLocation("xenorite", "xen_beast_hurt")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
