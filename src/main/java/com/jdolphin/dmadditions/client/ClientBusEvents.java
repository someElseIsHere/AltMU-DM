package com.jdolphin.dmadditions.client;

import com.jdolphin.dmadditions.DmAdditions;
import com.jdolphin.dmadditions.client.render.tileentity.control.TardisControlRenderer;
import com.jdolphin.dmadditions.init.DMAEntities;
import com.jdolphin.dmadditions.util.Helper;
import com.swdteam.client.gui.GuiDMU;
import com.swdteam.main.DMConfig;
import com.swdteam.util.helpers.ReflectionHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(
	modid = DmAdditions.MODID,
	bus = Mod.EventBusSubscriber.Bus.FORGE,
	value = {Dist.CLIENT}
)
public class ClientBusEvents {

	@Mod.EventBusSubscriber(modid = DmAdditions.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModBusEvents {

		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) { //Im lazy and cba to write the whole line out each time - Jam
			Helper.registerControlRenderers(DMAEntities.CONTROL.get(), DMAEntities.FLIGHT_CONTROL.get(),
				DMAEntities.DOOR_CONTROL.get());

		}
	}

	@SubscribeEvent(
		priority = EventPriority.HIGHEST
	)
	public static void guiEvent(GuiScreenEvent.InitGuiEvent event) {
		if (event.getGui() instanceof MainMenuScreen && (Boolean) DMConfig.CLIENT.customTitleScreen.get()) {
			MainMenuScreen gui = (MainMenuScreen) event.getGui();
			ReflectionHelper.setValuePrivateDeclaredField("splash", MainMenuScreen.class, gui, (Object) null);
			ReflectionHelper.setValuePrivateDeclaredField("field_73975_c", MainMenuScreen.class, gui, (Object) null);

			for (int i = 0; i < gui.buttons.size(); ++i) {
				Widget w = (Widget) gui.buttons.get(i);
				if (w.getMessage() instanceof TranslationTextComponent && ((TranslationTextComponent) w.getMessage()).getKey().equalsIgnoreCase("menu.multiplayer")) {
					w.setWidth(98);
					Button b = new Button(gui.width / 2 + 2, gui.height / 4 + 72, 98, 20,
						new StringTextComponent("Dalek Mod Server"), (button) -> {
						Minecraft.getInstance().setScreen(new GuiDMU(gui));
					}, (p_238659_1_, p_238659_2_, p_238659_3_, p_238659_4_) -> {
						if (!p_238659_1_.active) {
							gui.renderTooltip(p_238659_2_, gui.getMinecraft().font.split(new StringTextComponent("Please remove Dalek Mod: Additions before joining DMU"),
								Math.max(gui.width / 2 - 43, 170)), p_238659_3_, p_238659_4_); }});
					b.active = false;
					gui.children.add(b);
					gui.buttons.add(b);
				}
			}
		}
	}
}
