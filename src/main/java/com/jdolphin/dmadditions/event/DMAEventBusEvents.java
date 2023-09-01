package com.jdolphin.dmadditions.event;

import com.jdolphin.dmadditions.DmAdditions;
import com.jdolphin.dmadditions.loot.modifiers.AddItemLootModifier;
import com.swdteam.common.init.DMTardis;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;
import java.util.List;

@Mod.EventBusSubscriber(modid = DmAdditions.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DMAEventBusEvents {
	@SubscribeEvent
	public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event){
		event.getRegistry().registerAll(
			new AddItemLootModifier.Serializer().setRegistryName(new ResourceLocation(DmAdditions.MODID, "add_item"))
		);
	}
}
