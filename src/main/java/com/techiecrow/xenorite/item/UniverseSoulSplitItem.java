
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class UniverseSoulSplitItem extends Item {
	public UniverseSoulSplitItem() {
		super(new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB).durability(9).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
