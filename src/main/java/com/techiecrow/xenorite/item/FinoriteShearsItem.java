
package com.techiecrow.xenorite.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class FinoriteShearsItem extends ShearsItem {
	public FinoriteShearsItem() {
		super(new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB).durability(500));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 7f;
	}
}
