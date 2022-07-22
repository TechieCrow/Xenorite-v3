package com.techiecrow.xenorite.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import com.techiecrow.xenorite.init.XenoriteModParticleTypes;

public class XenoriteSmelterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		XenoriteSmelterAlloriteRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterCelestialIngotRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterDespicableIngotRecipeProcedure.execute(world, x, y, z);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (XenoriteModParticleTypes.XEENORITE_SMELTER_PARTICLES.get()), x, y, z, 20, 2, 2, 2, 0.5);
	}
}
