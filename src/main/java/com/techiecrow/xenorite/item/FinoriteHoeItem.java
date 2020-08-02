
package com.techiecrow.xenorite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.techiecrow.xenorite.itemgroup.XenoriteCreativeTabItemGroup;
import com.techiecrow.xenorite.XenoriteModElements;

@XenoriteModElements.ModElement.Tag
public class FinoriteHoeItem extends XenoriteModElements.ModElement {
	@ObjectHolder("xenorite:finorite_hoe")
	public static final Item block = null;
	public FinoriteHoeItem(XenoriteModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FinoriteIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(XenoriteCreativeTabItemGroup.tab)) {
		}.setRegistryName("finorite_hoe"));
	}
}
