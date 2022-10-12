package com.jdolphin.dmadditions.blocks;

import com.swdteam.common.init.DMDimensions;
import com.swdteam.common.init.DMSoundEvents;
import com.swdteam.common.init.DMTardis;
import com.swdteam.common.init.DMTranslationKeys;
import com.swdteam.common.tardis.TardisData;
import com.swdteam.common.tardis.data.TardisFlightPool;
import com.swdteam.util.ChatUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeverBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class BetterFastReturnLeverBlock extends LeverBlock {
    public BetterFastReturnLeverBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(POWERED, Boolean.FALSE).setValue(FACE, AttachFace.FLOOR));
    }

    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult p_225533_6_) {
        if (handIn == Hand.MAIN_HAND) {
            worldIn.setBlockAndUpdate(pos, (BlockState)state.setValue(POWERED, !(Boolean)state.getValue(POWERED)));
            worldIn.playSound((PlayerEntity)null, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (SoundEvent) DMSoundEvents.TARDIS_CONTROLS_LEVER.get(), SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (worldIn.dimension().equals(DMDimensions.TARDIS) && !worldIn.isClientSide) {
                TardisData data = DMTardis.getTardisFromInteriorPos(pos);
                if (data != null && data.getPreviousLocation() != null) {
                    TardisFlightPool.updateFlight(data, data.getPreviousLocation());
                }

                ChatUtil.sendCompletedMsg(player, DMTranslationKeys.TARDIS_FAST_RETURN_SET, ChatUtil.MessageType.STATUS_BAR);
            }
        }

        return ActionResultType.CONSUME;
    }
}
