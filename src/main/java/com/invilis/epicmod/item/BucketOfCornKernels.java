package com.invilis.epicmod.item;

import com.invilis.epicmod.block.EpicBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class BucketOfCornKernels extends Item {
    public BucketOfCornKernels(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
        // Verify on server
        Level level = context.getLevel();
        if (!level.isClientSide()) {
            BlockPos pos = context.getClickedPos().offset(context.getClickedFace().getNormal());
            level.setBlock(pos, EpicBlocks.CORN_KERNEL_BLOCK.get().defaultBlockState(), 3);
            //level.playSound(context.getPlayer(), pos, EpicSounds.KERNELS_PLACED, SoundSource.NEUTRAL, 1.0F, 1.0F);
            if (!context.getPlayer().isCreative()) {
                stack.shrink(1);
                context.getPlayer().getInventory().add(new ItemStack(Items.BUCKET, 1));
            }
        }

        return super.onItemUseFirst(stack, context);
    }
}
