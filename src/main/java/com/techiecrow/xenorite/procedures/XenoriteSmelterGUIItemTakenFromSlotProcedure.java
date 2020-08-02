package com.techiecrow.xenorite.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.techiecrow.xenorite.XenoriteModElements;

@XenoriteModElements.ModElement.Tag
public class XenoriteSmelterGUIItemTakenFromSlotProcedure extends XenoriteModElements.ModElement {
	public XenoriteSmelterGUIItemTakenFromSlotProcedure(XenoriteModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XenoriteSmelterGUIItemTakenFromSlot!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 5);
	}
}
