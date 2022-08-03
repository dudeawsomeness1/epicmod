package com.invilis.epicmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.PlantType;

public class BlessedCorn extends SugarCaneBlock {
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 3);

    public BlessedCorn(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, Integer.valueOf(0)));
    }
    
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.isEmptyBlock(pos.above())) {
            int i;
            for(i = 1; level.getBlockState(pos.below(i)).is(this); ++i);
   
            if (i < 3) {
                int j = state.getValue(AGE);
                if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(level, pos, state, true)) {
                    if (j == 15) {
                        level.setBlockAndUpdate(pos.above(), this.defaultBlockState());
                        net.minecraftforge.common.ForgeHooks.onCropsGrowPost(level, pos.above(), this.defaultBlockState());
                        //level.setBlock(pos, state.setValue(AGE, Integer.valueOf(0)), 4);

                        // Grow the corn cobs
                        int stage = state.getValue(STAGE);
                        if (stage < 3) {
                            level.setBlock(pos, state.setValue(STAGE, Integer.valueOf(stage + 1)), 4);
                        }
                    } else {
                        level.setBlock(pos, state.setValue(AGE, Integer.valueOf(j + 1)), 4);
                    }
                }
            }
        }
        else {
            // If stalk can't grow taller, then grow the corn cobs
            int stage = state.getValue(STAGE);
            if (stage < 3) {
                level.setBlock(pos, state.setValue(STAGE, Integer.valueOf(stage + 1)), 4);
            }
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockState soil = levelReader.getBlockState(pos.below());
        if (soil.canSustainPlant(levelReader, pos.below(), Direction.UP, this)) return true;
        BlockState blockstate = levelReader.getBlockState(pos.below());
        if (blockstate.is(this)) {
            return true;
        } else {
            if (blockstate.is(Blocks.FARMLAND)) {
                BlockPos blockpos = pos.below();

                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    FluidState fluidstate = levelReader.getFluidState(blockpos.relative(direction));
                    if (state.canBeHydrated(levelReader, pos, fluidstate, blockpos.relative(direction))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(STAGE);
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return net.minecraftforge.common.PlantType.CROP;
    }
}
