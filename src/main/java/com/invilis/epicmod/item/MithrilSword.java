package com.invilis.epicmod.item;

import com.invilis.epicmod.item.magic.SocketableSwordItem;

import net.minecraft.world.item.Item;

public class MithrilSword extends SocketableSwordItem {
    public MithrilSword(int damage, float speed, Item.Properties properties) {
        super(EpicTiers.MITHRIL, damage, speed, properties.fireResistant());
    }
}
