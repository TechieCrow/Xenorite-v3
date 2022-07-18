
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import com.techiecrow.xenorite.world.inventory.XenoriteSmelterGUIMenu;
import com.techiecrow.xenorite.world.inventory.XenBookVol1GUIMenu;
import com.techiecrow.xenorite.world.inventory.SoulTableGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XenoriteModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<XenoriteSmelterGUIMenu> XENORITE_SMELTER_GUI = register("xenorite_smelter_gui",
			(id, inv, extraData) -> new XenoriteSmelterGUIMenu(id, inv, extraData));
	public static final MenuType<XenBookVol1GUIMenu> XEN_BOOK_VOL_1_GUI = register("xen_book_vol_1_gui",
			(id, inv, extraData) -> new XenBookVol1GUIMenu(id, inv, extraData));
	public static final MenuType<SoulTableGUIMenu> SOUL_TABLE_GUI = register("soul_table_gui",
			(id, inv, extraData) -> new SoulTableGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
