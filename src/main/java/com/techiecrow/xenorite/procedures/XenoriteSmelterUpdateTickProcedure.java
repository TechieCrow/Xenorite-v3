package com.techiecrow.xenorite.procedures;

import net.minecraft.world.level.LevelAccessor;

public class XenoriteSmelterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		XenoriteSmelterAlloriteRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterCelestialIngotRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterDespicableIngotRecipeProcedure.execute(world, x, y, z);
	}
}
