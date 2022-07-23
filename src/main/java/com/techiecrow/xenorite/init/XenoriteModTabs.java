
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class XenoriteModTabs {
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB_BLOCKS;
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB_WEAPONS;
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB_TOOLS;
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB_ARMOR;
	public static CreativeModeTab TAB_XENORITE_CREATIVE_TAB_ITEMS;

	public static void load() {
		TAB_XENORITE_CREATIVE_TAB_BLOCKS = new CreativeModeTab("tabxenorite_creative_tab_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModBlocks.XENORITE_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_XENORITE_CREATIVE_TAB_WEAPONS = new CreativeModeTab("tabxenorite_creative_tab_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModItems.XENORITE_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_XENORITE_CREATIVE_TAB_TOOLS = new CreativeModeTab("tabxenorite_creative_tab_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModItems.XENORITE_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_XENORITE_CREATIVE_TAB_ARMOR = new CreativeModeTab("tabxenorite_creative_tab_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModItems.XENORITE_ARMOR_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_XENORITE_CREATIVE_TAB_ITEMS = new CreativeModeTab("tabxenorite_creative_tab_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(XenoriteModItems.UNIVERSE_SOUL_SPLIT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
