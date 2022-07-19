package com.techiecrow.xenorite.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class SoulTableInventoryWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(10)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		AlloriteSwordRecipeProcedure.execute(entity);
		AlloritePickaxeRecipeProcedure.execute(entity);
		AlloriteShovelRecipeProcedure.execute(entity);
		AlloriteAxeRecipeProcedure.execute(entity);
		AlloriteHoeRecipeProcedure.execute(entity);
		AlloriteHelmetRecipeProcedure.execute(entity);
		AlloriteChestplateRecipeProcedure.execute(entity);
		AlloriteLeggingsRecipeProcedure.execute(entity);
		AlloriteBootsRecipeProcedure.execute(entity);
		CelestialSwordRecipeProcedure.execute(entity);
		CelestialPickaxeRecipeProcedure.execute(entity);
		CelestialShovelRecipeProcedure.execute(entity);
		CelestialAxeRecipeProcedure.execute(entity);
		CelestialHoeRecipeProcedure.execute(entity);
		CelestialHelmetRecipeProcedure.execute(entity);
		CelestialChestplateRecipeProcedure.execute(entity);
		CelestialLeggingsRecipeProcedure.execute(entity);
		CelestialBootsRecipeProcedure.execute(entity);
		DespicableSwordRecipeProcedure.execute(entity);
		DespicablePickaxeRecipeProcedure.execute(entity);
		DespicableShovelRecipeProcedure.execute(entity);
		DespicableAxeRecipeProcedure.execute(entity);
		DespicableHoeRecipeProcedure.execute(entity);
		DespicableHelmetRecipeProcedure.execute(entity);
		DespicableChestplateRecipeProcedure.execute(entity);
		DespicableLeggingsRecipeProcedure.execute(entity);
		DespicableBootsRecipeProcedure.execute(entity);
	}
}
