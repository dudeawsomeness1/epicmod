package com.invilis.epicmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EpicCreativeModeTab {
    public static final CreativeModeTab EPIC_TAB = new CreativeModeTab("epictab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(EpicItems.ATHELAS_LEAF.get());
        }
    };
}
