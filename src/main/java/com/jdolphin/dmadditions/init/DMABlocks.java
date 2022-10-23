package com.jdolphin.dmadditions.init;

import com.jdolphin.dmadditions.block.BetterFastReturnLeverBlock;
import com.jdolphin.dmadditions.block.BetterFlightLeverBlock;
import com.jdolphin.dmadditions.block.RandomizerBlock;
import com.jdolphin.dmadditions.block.RoundelContainerBlock;
import com.swdteam.common.init.DMTabs;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.swdteam.common.init.DMBlocks.registerBlock;

public class DMABlocks {
	public static final Map<String, Supplier<Block>> MIXIN_BLOCKS;

	static {
		MIXIN_BLOCKS = new HashMap<>();

		MIXIN_BLOCKS.put("fast_return_lever",
			() -> new BetterFastReturnLeverBlock(
				AbstractBlock.Properties.of(Material.STONE).instabreak().noOcclusion().sound(SoundType.STONE)));

		MIXIN_BLOCKS.put("flight_lever",
			() -> new BetterFlightLeverBlock(
				AbstractBlock.Properties.of(Material.STONE).instabreak().noOcclusion().sound(SoundType.STONE)));
	}

	public static final RegistryObject<Block> CORAL_FLIGHT_LEVER = registerBlock(
		() -> new BetterFlightLeverBlock(net.minecraft.block.AbstractBlock.Properties.of(Material.STONE)
			.instabreak().noOcclusion().sound(SoundType.STONE)),
		"coral_flight_lever", DMTabs.DM_TARDIS);
	public static final RegistryObject<Block> COPPER_FLIGHT_LEVER = registerBlock(
		() -> new BetterFlightLeverBlock(net.minecraft.block.AbstractBlock.Properties.of(Material.STONE)
			.instabreak().noOcclusion().sound(SoundType.STONE)),
		"copper_flight_lever", DMTabs.DM_TARDIS);
	public static final RegistryObject<Block> RANDOMIZER = registerBlock(
		() -> new RandomizerBlock(net.minecraft.block.AbstractBlock.Properties.of(Material.STONE).instabreak()
			.noOcclusion().sound(SoundType.STONE)),
		"randomizer", DMTabs.DM_TARDIS);
	public static final RegistryObject<Block> TIMEKEEPER_CONSOLE = registerBlock(
		() -> new BetterFlightLeverBlock(net.minecraft.block.AbstractBlock.Properties.of(Material.STONE).instabreak().noOcclusion().sound(SoundType.STONE)),
		"timekeeper_console", DMTabs.DM_TARDIS);

	public static RegistryObject<Block> BLACK_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> YELLOW_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> WHITE_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> SCORCHED_BLACK_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> SCORCHED_YELLOW_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> SCORCHED_WHITE_QUARTZ_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> DALEKANIUM_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> REFINED_DALEKANIUM_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PURE_DALEKANIUM_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> METALERT_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> STEEL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLUE_STEEL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RED_STEEL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> FILLED_STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RUSTED_STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> FILLED_RUSTED_STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> STAINLESS_STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> FILLED_STAINLESS_STEEL_BEAMS_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RUSTED_STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> STAINLESS_STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> WHITE_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> MAGENTA_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> YELLOW_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIME_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PINK_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GRAY_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> CYAN_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PURPLE_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLUE_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BROWN_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GREEN_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RED_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLACK_TERRACOTTA_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> WHITE_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> CLAY_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> ORANGE_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> MAGENTA_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_BLUE_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> YELLOW_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIME_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PINK_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GRAY_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_GRAY_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> CYAN_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PURPLE_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLUE_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BROWN_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GREEN_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RED_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLACK_PLASTIC_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> WHITE_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> ORANGE_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> MAGENTA_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_BLUE_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> YELLOW_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIME_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PINK_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GRAY_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_GRAY_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> CYAN_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PURPLE_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLUE_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BROWN_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GREEN_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RED_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLACK_PLASTIC_BOWL_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> WHITE_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> ORANGE_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> MAGENTA_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_BLUE_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> YELLOW_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIME_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PINK_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GRAY_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> LIGHT_GRAY_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> CYAN_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> PURPLE_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLUE_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BROWN_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> GREEN_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> RED_PLASTIC_SHAPE_ROUNDEL_CONTAINER;
	public static RegistryObject<Block> BLACK_PLASTIC_SHAPE_ROUNDEL_CONTAINER;


	static {

		BLACK_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.8F, 0.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "black_quartz_roundel_container", DMTabs.DM_TARDIS);
		YELLOW_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.8F, 0.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "yellow_quartz_roundel_container", DMTabs.DM_TARDIS);
		WHITE_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.8F, 0.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "white_quartz_roundel_container", DMTabs.DM_TARDIS);
		SCORCHED_BLACK_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.0F, 0.4F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "scorched_black_quartz_roundel_container", DMTabs.DM_TARDIS);
		SCORCHED_YELLOW_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.0F, 0.4F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "scorched_yellow_quartz_roundel_container", DMTabs.DM_TARDIS);
		SCORCHED_WHITE_QUARTZ_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.0F, 0.4F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "scorched_white_quartz_roundel_container", DMTabs.DM_TARDIS);
		DALEKANIUM_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "dalekanium_roundel_container", DMTabs.DM_TARDIS);
		REFINED_DALEKANIUM_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 5.5F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "refined_dalekanium_roundel_container", DMTabs.DM_TARDIS);
		PURE_DALEKANIUM_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(12.0F, 10.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "pure_dalekanium_roundel_container", DMTabs.DM_TARDIS);
		METALERT_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(40.0F, 50.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "metalert_roundel_container", DMTabs.DM_TARDIS);
		STEEL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "steel_roundel_container", DMTabs.DM_TARDIS);
		BLUE_STEEL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "blue_steel_roundel_container", DMTabs.DM_TARDIS);
		RED_STEEL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "red_steel_roundel_container", DMTabs.DM_TARDIS);

		//TODO: make waterloggable/rustable roundel containers exist?

//		STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RustableRoundelContainerBlock.WaterLoggableTransparent(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "steel_beams_roundel_container", DMTabs.DM_TARDIS);
//		FILLED_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RustableRoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "filled_steel_beams_roundel_container", DMTabs.DM_TARDIS);
//		RUSTED_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock.WaterLoggable(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "rusted_steel_beams_roundel_container", DMTabs.DM_TARDIS);
		STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "steel_beams_roundel_container", DMTabs.DM_TARDIS);
		FILLED_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "filled_steel_beams_roundel_container", DMTabs.DM_TARDIS);
		RUSTED_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "rusted_steel_beams_roundel_container", DMTabs.DM_TARDIS);

		FILLED_RUSTED_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "filled_rusted_steel_beams_roundel_container", DMTabs.DM_TARDIS);
//		STAINLESS_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock.WaterLoggable(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "stainless_steel_beams_roundel_container", DMTabs.DM_TARDIS);
		STAINLESS_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).noOcclusion()), "stainless_steel_beams_roundel_container", DMTabs.DM_TARDIS);
		FILLED_STAINLESS_STEEL_BEAMS_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL).strength(6.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "filled_stainless_steel_beams_roundel_container", DMTabs.DM_TARDIS);

		// TODO: fix steel reinforced walling models & blockstates, they're missing for some reason
//		STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER = registerBlock(() -> new RustableRoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(8.0F, 7.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "steel_reinforced_walling_roundel_container", DMTabs.DM_TARDIS);
		STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(8.0F, 7.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "steel_reinforced_walling_roundel_container", DMTabs.DM_TARDIS);
		RUSTED_STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).strength(6.5F, 6.5F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "rusted_steel_reinforced_walling_roundel_container", DMTabs.DM_TARDIS);
		STAINLESS_STEEL_REINFORCED_WALLING_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).strength(8.5F, 8.5F).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1)), "stainless_steel_reinforced_walling_roundel_container", DMTabs.DM_TARDIS);
		TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "terracotta_roundel_container", DMTabs.DM_TARDIS);
		WHITE_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "white_terracotta_roundel_container", DMTabs.DM_TARDIS);
		ORANGE_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "orange_terracotta_roundel_container", DMTabs.DM_TARDIS);
		MAGENTA_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "magenta_terracotta_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_BLUE_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "light_blue_terracotta_roundel_container", DMTabs.DM_TARDIS);
		YELLOW_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "yellow_terracotta_roundel_container", DMTabs.DM_TARDIS);
		LIME_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "lime_terracotta_roundel_container", DMTabs.DM_TARDIS);
		PINK_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "pink_terracotta_roundel_container", DMTabs.DM_TARDIS);
		GRAY_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "gray_terracotta_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_GRAY_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "light_gray_terracotta_roundel_container", DMTabs.DM_TARDIS);
		CYAN_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "cyan_terracotta_roundel_container", DMTabs.DM_TARDIS);
		PURPLE_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "purple_terracotta_roundel_container", DMTabs.DM_TARDIS);
		BLUE_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "blue_terracotta_roundel_container", DMTabs.DM_TARDIS);
		BROWN_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "brown_terracotta_roundel_container", DMTabs.DM_TARDIS);
		GREEN_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "green_terracotta_roundel_container", DMTabs.DM_TARDIS);
		RED_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "red_terracotta_roundel_container", DMTabs.DM_TARDIS);
		BLACK_TERRACOTTA_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 4.2F).sound(SoundType.STONE).requiresCorrectToolForDrops()), "black_terracotta_roundel_container", DMTabs.DM_TARDIS);
		WHITE_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD).requiresCorrectToolForDrops()), "white_plastic_roundel_container", DMTabs.DM_TARDIS);
		CLAY_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F, 0.6F).sound(SoundType.GRAVEL)), "clay_roundel_container", DMTabs.DM_TARDIS);
		ORANGE_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "orange_plastic_roundel_container", DMTabs.DM_TARDIS);
		MAGENTA_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "magenta_plastic_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_BLUE_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_blue_plastic_roundel_container", DMTabs.DM_TARDIS);
		YELLOW_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "yellow_plastic_roundel_container", DMTabs.DM_TARDIS);
		LIME_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "lime_plastic_roundel_container", DMTabs.DM_TARDIS);
		PINK_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "pink_plastic_roundel_container", DMTabs.DM_TARDIS);
		GRAY_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "gray_plastic_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_GRAY_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_gray_plastic_roundel_container", DMTabs.DM_TARDIS);
		CYAN_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "cyan_plastic_roundel_container", DMTabs.DM_TARDIS);
		PURPLE_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "purple_plastic_roundel_container", DMTabs.DM_TARDIS);
		BLUE_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "blue_plastic_roundel_container", DMTabs.DM_TARDIS);
		BROWN_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "brown_plastic_roundel_container", DMTabs.DM_TARDIS);
		GREEN_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "green_plastic_roundel_container", DMTabs.DM_TARDIS);
		RED_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "red_plastic_roundel_container", DMTabs.DM_TARDIS);
		BLACK_PLASTIC_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "black_plastic_roundel_container", DMTabs.DM_TARDIS);
		WHITE_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "white_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		ORANGE_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "orange_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		MAGENTA_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "magenta_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_BLUE_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_blue_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		YELLOW_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "yellow_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		LIME_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "lime_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		PINK_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "pink_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		GRAY_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "gray_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_GRAY_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_gray_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		CYAN_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "cyan_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		PURPLE_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "purple_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		BLUE_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "blue_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		BROWN_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "brown_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		GREEN_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "green_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		RED_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "red_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		BLACK_PLASTIC_BOWL_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "black_plastic_bowl_roundel_container", DMTabs.DM_TARDIS);
		WHITE_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "white_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		ORANGE_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "orange_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		MAGENTA_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "magenta_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_BLUE_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_blue_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		YELLOW_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "yellow_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		LIME_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "lime_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		PINK_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "pink_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		GRAY_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "gray_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		LIGHT_GRAY_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "light_gray_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		CYAN_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "cyan_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		PURPLE_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "purple_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		BLUE_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "blue_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		BROWN_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "brown_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		GREEN_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "green_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		RED_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "red_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
		BLACK_PLASTIC_SHAPE_ROUNDEL_CONTAINER = registerBlock(() -> new RoundelContainerBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 2.5F).sound(SoundType.WOOD)), "black_plastic_shape_roundel_container", DMTabs.DM_TARDIS);
	}
}

