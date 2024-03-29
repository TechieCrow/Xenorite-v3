
package com.techiecrow.xenorite.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import com.techiecrow.xenorite.entity.XenPigEntity;

public class XenPigRenderer extends MobRenderer<XenPigEntity, PigModel<XenPigEntity>> {
	public XenPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XenPigEntity entity) {
		return new ResourceLocation("xenorite:textures/entities/xenpig.png");
	}
}
