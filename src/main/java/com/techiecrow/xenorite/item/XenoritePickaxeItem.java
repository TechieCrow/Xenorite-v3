
package com.techiecrow.xenorite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.techiecrow.xenorite.itemgroup.XenoriteCreativeTabItemGroup;
import com.techiecrow.xenorite.XenoriteModElements;

@XenoriteModElements.ModElement.Tag
public class XenoritePickaxeItem extends XenoriteModElements.ModElement {
	@ObjectHolder("xenorite:xenorite_pickaxe")
	public static final Item block = null;
	public XenoritePickaxeItem(XenoriteModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(XenoriteIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(XenoriteCreativeTabItemGroup.tab)) {
		}.setRegistryName("xenorite_pickaxe"));
	}
}
