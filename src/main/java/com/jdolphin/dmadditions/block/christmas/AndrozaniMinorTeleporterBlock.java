package com.jdolphin.dmadditions.block.christmas;

import com.jdolphin.dmadditions.init.DMABlocks;
import com.jdolphin.dmadditions.init.DMADimensions;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

public class AndrozaniMinorTeleporterBlock extends Block {

	public AndrozaniMinorTeleporterBlock(AbstractBlock.Properties properties) {
		super(properties);
	}

	@NotNull
	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader world, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return Block.box(-8, 0, -8, 24, 32, 24);
    }

	@NotNull
	@Override
	@SuppressWarnings("deprecation")
	public ActionResultType use(@NotNull BlockState state, World worldIn, @NotNull BlockPos originalPos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
		if (!worldIn.isClientSide()) {
			ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
			RegistryKey<World> key = worldIn.dimension() == DMADimensions.ANDROZANIMINOR ? World.OVERWORLD : DMADimensions.ANDROZANIMINOR;

			if (worldIn.getServer() == null) return ActionResultType.FAIL;
			ServerWorld destinationWorld = worldIn.getServer().getLevel(key);

			if (destinationWorld != null) {
				int y = destinationWorld.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, originalPos.getX(), originalPos.getZ());
				if (y == 0) y = getWorldHeight(destinationWorld, originalPos.getX(), originalPos.getZ());

				BlockPos pos = new BlockPos(originalPos.getX(), y, originalPos.getZ());

				serverPlayer.teleportTo(destinationWorld, player.getX(), getWorldHeight(destinationWorld, originalPos.getX(), originalPos.getZ()), player.getZ(), serverPlayer.getYHeadRot(), player.xRot);
				if (!destinationWorld.getBlockState(pos.below()).is(DMABlocks.CHRISTMAS_PRESENT.get()))
					destinationWorld.setBlockAndUpdate(pos, DMABlocks.CHRISTMAS_PRESENT.get().defaultBlockState());
			}
		}
		return ActionResultType.SUCCESS;
	}

	public int getWorldHeight(World world, int x, int z) {
		for (int y = world.getHeight(); y > 0; y--) {
			if (!(world.getBlockState(new BlockPos(x, y, z)).getBlock() instanceof AirBlock)) {
				return y + 1;
			}
		}

		return world.getHeight() + 1;
	}
}
