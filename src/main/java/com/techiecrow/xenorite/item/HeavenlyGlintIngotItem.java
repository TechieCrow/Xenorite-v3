
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class HeavenlyGlintIngotItem extends Item {
	public HeavenlyGlintIngotItem() {
		super(new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
