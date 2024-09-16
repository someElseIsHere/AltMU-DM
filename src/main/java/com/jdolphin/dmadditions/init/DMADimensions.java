package com.jdolphin.dmadditions.init;

import com.jdolphin.dmadditions.util.Helper;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class DMADimensions {
	public static RegistryKey<World> MOON = RegistryKey.create(Registry.DIMENSION_REGISTRY, Helper.createAdditionsRL("moon"));
	public static RegistryKey<World> ANDROZANIMINOR = RegistryKey.create(Registry.DIMENSION_REGISTRY, Helper.createAdditionsRL("androzaniminor"));
	public static RegistryKey<World> MONDAS = RegistryKey.create(Registry.DIMENSION_REGISTRY, Helper.createAdditionsRL("mondas"));
	public static RegistryKey<World> GALLIFREY = RegistryKey.create(Registry.DIMENSION_REGISTRY, Helper.createAdditionsRL("gallifrey"));

}