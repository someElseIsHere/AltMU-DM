package com.jdolphin.dmadditions.block.christmas;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import org.jetbrains.annotations.NotNull;

public class SnowGlobeBlock extends HorizontalBlock {
	protected static final VoxelShape ONE_AABB = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);

	public SnowGlobeBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.@NotNull Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@NotNull
	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getShape(@NotNull BlockState blockState, @NotNull IBlockReader iBlockReader, @NotNull BlockPos blockPos, @NotNull ISelectionContext iSelectionContext) {
		return ONE_AABB;
	}

	@NotNull
	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getCollisionShape(@NotNull BlockState blockState, @NotNull IBlockReader iBlockReader, @NotNull BlockPos blockPos, @NotNull ISelectionContext iSelectionContext) {
		return getShape(blockState, iBlockReader, blockPos, iSelectionContext);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}
}
