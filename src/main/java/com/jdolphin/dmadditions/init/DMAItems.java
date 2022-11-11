package com.jdolphin.dmadditions.init;

import com.jdolphin.dmadditions.advent.AdventUnlock;
import com.jdolphin.dmadditions.item.CandyCaneItem;
import com.jdolphin.dmadditions.item.LaserScrewdriver;
import com.jdolphin.dmadditions.item.TardisRemoteKeyItem;
import com.jdolphin.dmadditions.item.UnitGun;
import com.swdteam.common.RegistryHandler;
import com.swdteam.common.init.DMItemTiers;
import com.swdteam.common.init.DMProjectiles;
import com.swdteam.common.init.DMSoundEvents;
import com.swdteam.common.init.DMTabs;
import com.swdteam.common.item.FoodItem;
import com.swdteam.common.item.LasergunItem;
import com.swdteam.common.item.SpawnerItem;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;

import static com.swdteam.common.init.DMItems.addSpawnItem;


public class DMAItems {

	public static RegistryObject<Item> DINO_NUGGETS;
	public static RegistryObject<Item> DINO_NUGGETS_CUSTARD;
	public static RegistryObject<Item> PISTOL;
	public static RegistryObject<Item> UNIT_GUN;
	public static RegistryObject<Item> LASER_SCREWDRIVER;
	public static RegistryObject<Item> TARDIS_GOLD_KEY;
	public static RegistryObject<Item> CANDY_CANE;

	public static RegistryObject<Item> STEEL_HELMET;
	public static RegistryObject<Item> STEEL_CHESTPLATE;
	public static RegistryObject<Item> STEEL_LEGGINGS;
	public static RegistryObject<Item> STEEL_BOOTS;

	public static RegistryObject<Item> DALEKANIUM_HELMET;
	public static RegistryObject<Item> DALEKANIUM_CHESTPLATE;
	public static RegistryObject<Item> DALEKANIUM_LEGGINGS;
	public static RegistryObject<Item> DALEKANIUM_BOOTS;

	public static RegistryObject<Item> REFINED_DALEKANIUM_HELMET;
	public static RegistryObject<Item> REFINED_DALEKANIUM_CHESTPLATE;
	public static RegistryObject<Item> REFINED_DALEKANIUM_LEGGINGS;
	public static RegistryObject<Item> REFINED_DALEKANIUM_BOOTS;

	public static RegistryObject<Item> PURE_DALEKANIUM_HELMET;
	public static RegistryObject<Item> PURE_DALEKANIUM_CHESTPLATE;
	public static RegistryObject<Item> PURE_DALEKANIUM_LEGGINGS;
	public static RegistryObject<Item> PURE_DALEKANIUM_BOOTS;

	public static RegistryObject<Item> METALERT_HELMET;
	public static RegistryObject<Item> METALERT_CHESTPLATE;
	public static RegistryObject<Item> METALERT_LEGGINGS;
	public static RegistryObject<Item> METALERT_BOOTS;
	public static RegistryObject<Item> WOODEN_CYBERMAN_SPAWNER;


	public static <T extends Entity> RegistryObject<Item> addSpawnItem(String key, List<String> types, String itemKey) {
		RegistryObject<Item> item = RegistryHandler.ITEMS.register(itemKey + "_spawner", () -> {
			return new SpawnerItem(key, types);
		});
		return item;
	}

	public static <T extends Entity> RegistryObject<Item> addSpawnItem(String key, List<String> types) {
		return addSpawnItem(key, types, (String)types.get(0));
	}

	public static <T extends Entity> RegistryObject<Item> addSpawnItem(String key, String type) {
		RegistryObject<Item> item = RegistryHandler.ITEMS.register(type + "_spawner", () -> {
			return new SpawnerItem(key, type);
		});
		return item;
	}

	public static <T extends Entity> RegistryObject<Item> addSpawnItem(String key) {
		return addSpawnItem(key, key);
	}


	static {
		if (AdventUnlock.canAdventBeUnlocked(1)) {
			CANDY_CANE = RegistryHandler.ITEMS.register("candy_cane_blue",
				() -> new FoodItem((new Item.Properties()).food(DMAFoods.CANDY_CANE).tab(ItemGroup.TAB_FOOD)));
			CANDY_CANE = RegistryHandler.ITEMS.register("candy_cane_red",
				() -> new FoodItem((new Item.Properties()).food(DMAFoods.CANDY_CANE).tab(ItemGroup.TAB_FOOD)));
			CANDY_CANE = RegistryHandler.ITEMS.register("candy_cane_green",
				() -> new FoodItem((new Item.Properties()).food(DMAFoods.CANDY_CANE).tab(ItemGroup.TAB_FOOD)));
			CANDY_CANE = RegistryHandler.ITEMS.register("candy_cane_orange",
				() -> new FoodItem((new Item.Properties()).food(DMAFoods.CANDY_CANE).tab(ItemGroup.TAB_FOOD)));
		}
		if (AdventUnlock.canAdventBeUnlocked(17)) {
			WOODEN_CYBERMAN_SPAWNER = addSpawnItem("wooden_cyberman");
		}
		if (AdventUnlock.canAdventBeUnlocked(5)) {
			UNIT_GUN = RegistryHandler.ITEMS.register("unit_gun",
				() -> new LasergunItem(DMItemTiers.DALEK_GUNSTICK, 0.15F, DMAProjectiles.BULLET, DMSoundEvents.ENTITY_DALEK_GUNSTICK_CHARGE,
					DMASoundEvents.PISTOL_SHOOT, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
		}

		PISTOL = RegistryHandler.ITEMS.register("pistol",
			() -> new UnitGun(DMItemTiers.STEEL, 100, DMAProjectiles.BULLET, DMASoundEvents.PISTOL_SHOOT, (new Item.Properties().tab(ItemGroup.TAB_COMBAT))));

		TARDIS_GOLD_KEY = RegistryHandler.ITEMS.register("tardis_gold_key",
			() -> new TardisRemoteKeyItem((new Item.Properties()).durability(32).tab(DMTabs.DM_TARDIS), ""));

		DINO_NUGGETS = RegistryHandler.ITEMS.register("dino_nuggets",
			() -> new FoodItem((new Item.Properties()).food(DMAFoods.DINO_NUGGETS).tab(ItemGroup.TAB_FOOD)));

		DINO_NUGGETS_CUSTARD = RegistryHandler.ITEMS.register("dino_nuggets_custard",
			() -> new FoodItem((new Item.Properties()).food(DMAFoods.DINO_NUGGETS_CUSTARD).tab(ItemGroup.TAB_FOOD)));

		if (AdventUnlock.canAdventBeUnlocked(9)) {
			LASER_SCREWDRIVER = RegistryHandler.ITEMS.register("laser_screwdriver",
				() -> new LaserScrewdriver(ItemGroup.TAB_TOOLS, 100, DMAProjectiles.METALLIC_GOLD_LASER));
		}


		STEEL_HELMET = RegistryHandler.ITEMS.register("steel_helmet",
			() -> new ArmorItem(DMAArmorMaterial.STEEL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		STEEL_CHESTPLATE = RegistryHandler.ITEMS.register("steel_chestplate",
			() -> new ArmorItem(DMAArmorMaterial.STEEL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		STEEL_LEGGINGS = RegistryHandler.ITEMS.register("steel_leggings",
			() -> new ArmorItem(DMAArmorMaterial.STEEL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		STEEL_BOOTS = RegistryHandler.ITEMS.register("steel_boots",
			() -> new ArmorItem(DMAArmorMaterial.STEEL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		DALEKANIUM_HELMET = RegistryHandler.ITEMS.register("dalekanium_helmet",
			() -> new ArmorItem(DMAArmorMaterial.DALEKANIUM, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		DALEKANIUM_CHESTPLATE = RegistryHandler.ITEMS.register("dalekanium_chestplate",
			() -> new ArmorItem(DMAArmorMaterial.DALEKANIUM, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		DALEKANIUM_LEGGINGS = RegistryHandler.ITEMS.register("dalekanium_leggings",
			() -> new ArmorItem(DMAArmorMaterial.DALEKANIUM, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		DALEKANIUM_BOOTS = RegistryHandler.ITEMS.register("dalekanium_boots",
			() -> new ArmorItem(DMAArmorMaterial.DALEKANIUM, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		REFINED_DALEKANIUM_HELMET = RegistryHandler.ITEMS.register("refined_dalekanium_helmet",
			() -> new ArmorItem(DMAArmorMaterial.REFINED_DALEKANIUM, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		REFINED_DALEKANIUM_CHESTPLATE = RegistryHandler.ITEMS.register("refined_dalekanium_chestplate",
			() -> new ArmorItem(DMAArmorMaterial.REFINED_DALEKANIUM, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		REFINED_DALEKANIUM_LEGGINGS = RegistryHandler.ITEMS.register("refined_dalekanium_leggings",
			() -> new ArmorItem(DMAArmorMaterial.REFINED_DALEKANIUM, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		REFINED_DALEKANIUM_BOOTS = RegistryHandler.ITEMS.register("refined_dalekanium_boots",
			() -> new ArmorItem(DMAArmorMaterial.REFINED_DALEKANIUM, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		PURE_DALEKANIUM_HELMET = RegistryHandler.ITEMS.register("pure_dalekanium_helmet",
			() -> new ArmorItem(DMAArmorMaterial.PURE_DALEKANIUM, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		PURE_DALEKANIUM_CHESTPLATE = RegistryHandler.ITEMS.register("pure_dalekanium_chestplate",
			() -> new ArmorItem(DMAArmorMaterial.PURE_DALEKANIUM, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		PURE_DALEKANIUM_LEGGINGS = RegistryHandler.ITEMS.register("pure_dalekanium_leggings",
			() -> new ArmorItem(DMAArmorMaterial.PURE_DALEKANIUM, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		PURE_DALEKANIUM_BOOTS = RegistryHandler.ITEMS.register("pure_dalekanium_boots",
			() -> new ArmorItem(DMAArmorMaterial.PURE_DALEKANIUM, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		METALERT_HELMET = RegistryHandler.ITEMS.register("metalert_helmet",
			() -> new ArmorItem(DMAArmorMaterial.METALERT, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		METALERT_CHESTPLATE = RegistryHandler.ITEMS.register("metalert_chestplate",
			() -> new ArmorItem(DMAArmorMaterial.METALERT, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		METALERT_LEGGINGS = RegistryHandler.ITEMS.register("metalert_leggings",
			() -> new ArmorItem(DMAArmorMaterial.METALERT, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

		METALERT_BOOTS = RegistryHandler.ITEMS.register("metalert_boots",
			() -> new ArmorItem(DMAArmorMaterial.METALERT, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
	}
}
