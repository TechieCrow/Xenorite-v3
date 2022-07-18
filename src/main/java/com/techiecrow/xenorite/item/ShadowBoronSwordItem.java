
package com.techiecrow.xenorite.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.techiecrow.xenorite.init.XenoriteModTabs;
import com.techiecrow.xenorite.init.XenoriteModItems;

public class ShadowBoronSwordItem extends SwordItem {
	public ShadowBoronSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 780;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(XenoriteModItems.SHADOW_BORON_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
	}
}
