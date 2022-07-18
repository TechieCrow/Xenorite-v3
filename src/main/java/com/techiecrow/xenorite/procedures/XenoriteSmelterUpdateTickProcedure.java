package com.techiecrow.xenorite.procedures;

import net.minecraft.world.level.LevelAccessor;

public class XenoriteSmelterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		XenoriteSmelterXCFIngotRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterPeacefulGlintingIngotRecipeProcedure.execute(world, x, y, z);
		XenoriteSmelterWorldlyIngotRecipeProcedure.execute(world, x, y, z);
	}
}
