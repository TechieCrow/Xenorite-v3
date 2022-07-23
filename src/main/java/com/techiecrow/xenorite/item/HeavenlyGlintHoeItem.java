
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import com.techiecrow.xenorite.init.XenoriteModTabs;
import com.techiecrow.xenorite.init.XenoriteModItems;

public class HeavenlyGlintHoeItem extends HoeItem {
	public HeavenlyGlintHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 780;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(XenoriteModItems.HEAVENLY_GLINT_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB_TOOLS).fireResistant());
	}
}
