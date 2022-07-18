package com.techiecrow.xenorite.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.techiecrow.xenorite.init.XenoriteModItems;

public class LootBagRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double counter = 0;
		double randomNum = 0;
		randomNum = Math.random();
		if (randomNum >= 0.5) {
			randomNum = Math.random();
			if (randomNum >= 0 && randomNum <= 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(XenoriteModItems.LOOTING_BAG_ITEM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (randomNum > 0.25 && randomNum <= 0.5) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(XenoriteModItems.XEN_BOOK_VOL_1.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (randomNum > 0.5 && randomNum <= 0.75) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(XenoriteModItems.WORLDLY_INGOT.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (randomNum > 0.75 && randomNum <= 1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(XenoriteModItems.COREORITE_ARMOR_HELMET.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
