
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;

public class DespicableShovelItem extends ShovelItem {
	public DespicableShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB).fireResistant());
	}
}
