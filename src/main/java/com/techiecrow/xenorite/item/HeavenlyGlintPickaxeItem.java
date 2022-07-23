
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;
import com.techiecrow.xenorite.init.XenoriteModItems;

public class HeavenlyGlintPickaxeItem extends PickaxeItem {
	public HeavenlyGlintPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 780;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 3f;
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
		}, 1, -2.8f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB_TOOLS).fireResistant());
	}
}
