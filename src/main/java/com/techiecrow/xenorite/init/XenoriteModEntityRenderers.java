
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.techiecrow.xenorite.client.renderer.XenPigRenderer;
import com.techiecrow.xenorite.client.renderer.XenBeastRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class XenoriteModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(XenoriteModEntities.XEN_BEAST.get(), XenBeastRenderer::new);
		event.registerEntityRenderer(XenoriteModEntities.XEN_PIG.get(), XenPigRenderer::new);
	}
}
