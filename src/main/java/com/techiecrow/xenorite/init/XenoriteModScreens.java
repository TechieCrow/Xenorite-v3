
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.techiecrow.xenorite.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.techiecrow.xenorite.client.gui.XenoriteSmelterGUIScreen;
import com.techiecrow.xenorite.client.gui.XenBookVol1GUIScreen;
import com.techiecrow.xenorite.client.gui.SoulTableGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class XenoriteModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(XenoriteModMenus.XENORITE_SMELTER_GUI, XenoriteSmelterGUIScreen::new);
			MenuScreens.register(XenoriteModMenus.XEN_BOOK_VOL_1_GUI, XenBookVol1GUIScreen::new);
			MenuScreens.register(XenoriteModMenus.SOUL_TABLE_GUI, SoulTableGUIScreen::new);
		});
	}
}
