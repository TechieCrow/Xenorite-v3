
package com.techiecrow.xenorite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.techiecrow.xenorite.itemgroup.XenoriteCreativeTabItemGroup;
import com.techiecrow.xenorite.XenoriteModElements;

@XenoriteModElements.ModElement.Tag
public class FinoriteShearsItem extends XenoriteModElements.ModElement {
	@ObjectHolder("xenorite:finorite_shears")
	public static final Item block = null;
	public FinoriteShearsItem(XenoriteModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(XenoriteCreativeTabItemGroup.tab).maxDamage(500)) {
			@Override
			public int getItemEnchantability() {
				return 22;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 7f;
			}
		}.setRegistryName("finorite_shears"));
	}
}
