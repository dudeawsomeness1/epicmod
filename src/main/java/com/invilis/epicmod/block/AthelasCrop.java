package com.invilis.epicmod.block;

import com.invilis.epicmod.item.EpicItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class AthelasCrop extends CropBlock {
    public AthelasCrop(Properties p_52247_) {
        super(p_52247_);
    }
    
    protected ItemLike getBaseSeedId() {
        return EpicItems.ATHELAS_PLANTLING.get();
    }
}
