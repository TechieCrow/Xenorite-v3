
package com.techiecrow.xenorite.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.techiecrow.xenorite.entity.XenBeastEntity;
import com.techiecrow.xenorite.client.model.ModelXenBeastModel;

public class XenBeastRenderer extends MobRenderer<XenBeastEntity, ModelXenBeastModel<XenBeastEntity>> {
	public XenBeastRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelXenBeastModel(context.bakeLayer(ModelXenBeastModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XenBeastEntity entity) {
		return new ResourceLocation("xenorite:textures/entities/xenbeasttexture.png");
	}
}
