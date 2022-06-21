
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class XenoriteModTabs {
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB;

	public static void load() {
		TAB_XENORITE_CREATIVE_TAB = new CreativeModeTab("tabxenorite_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModBlocks.XENORITE_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
