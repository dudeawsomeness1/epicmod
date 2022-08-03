package com.invilis.epicmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicalityTable extends CraftingTableBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.socket_upgrade");

    public MagicalityTable(Properties properties) {
        super(properties);
    }
    
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        /*return new SimpleMenuProvider((p_56424_, p_56425_, p_56426_) -> {
            return new TempClass(p_56424_, p_56425_, ContainerLevelAccess.create(level, pos));
            }, CONTAINER_TITLE);*/
        return super.getMenuProvider(state, level, pos);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }
}
