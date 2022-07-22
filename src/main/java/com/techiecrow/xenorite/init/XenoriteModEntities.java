
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.techiecrow.xenorite.entity.XenPigEntity;
import com.techiecrow.xenorite.entity.XenBeastEntity;
import com.techiecrow.xenorite.XenoriteMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XenoriteModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, XenoriteMod.MODID);
	public static final RegistryObject<EntityType<XenBeastEntity>> XEN_BEAST = register("xen_beast",
			EntityType.Builder.<XenBeastEntity>of(XenBeastEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(50)
					.setUpdateInterval(3).setCustomClientFactory(XenBeastEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XenPigEntity>> XEN_PIG = register("xen_pig",
			EntityType.Builder.<XenPigEntity>of(XenPigEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(XenPigEntity::new)

					.sized(0.9f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			XenBeastEntity.init();
			XenPigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(XEN_BEAST.get(), XenBeastEntity.createAttributes().build());
		event.put(XEN_PIG.get(), XenPigEntity.createAttributes().build());
	}
}
