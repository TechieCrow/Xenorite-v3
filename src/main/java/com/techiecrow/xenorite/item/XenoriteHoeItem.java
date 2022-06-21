
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import com.techiecrow.xenorite.init.XenoriteModTabs;
import com.techiecrow.xenorite.init.XenoriteModItems;

public class XenoriteHoeItem extends HoeItem {
	public XenoriteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(XenoriteModItems.XENORITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
	}
}
