
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class CelestialAxeItem extends AxeItem {
	public CelestialAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
	}
}
