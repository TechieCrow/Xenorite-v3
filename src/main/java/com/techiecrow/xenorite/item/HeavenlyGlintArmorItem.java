
package com.techiecrow.xenorite.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.techiecrow.xenorite.init.XenoriteModTabs;
import com.techiecrow.xenorite.init.XenoriteModItems;

public abstract class HeavenlyGlintArmorItem extends ArmorItem {
	public HeavenlyGlintArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 33;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(XenoriteModItems.HEAVENLY_GLINT_INGOT.get()));
			}

			@Override
			public String getName() {
				return "heavenly_glint_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends HeavenlyGlintArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "xenorite:textures/models/armor/heavenlyglint__layer_1.png";
		}
	}

	public static class Chestplate extends HeavenlyGlintArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "xenorite:textures/models/armor/heavenlyglint__layer_1.png";
		}
	}

	public static class Leggings extends HeavenlyGlintArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "xenorite:textures/models/armor/heavenlyglint__layer_2.png";
		}
	}

	public static class Boots extends HeavenlyGlintArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(XenoriteModTabs.TAB_XENORITE_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "xenorite:textures/models/armor/heavenlyglint__layer_1.png";
		}
	}
}
