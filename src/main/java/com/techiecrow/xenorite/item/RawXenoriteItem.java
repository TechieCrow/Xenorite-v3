
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class RawXenoriteItem extends Item {
	public RawXenoriteItem() {
		super(new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
