package com.invilis.epicmod.item.magic;

import net.minecraft.world.item.Item;

public interface Socketable {
    public final static String SOCKETABLE_ITEMS[] = {
        "item.minecraft.amethyst_shard",
        "item.minecraft.diamond",
        "item.minecraft.echo_shard",
        "item.epic.alexandrite",
        "item.epic.aquamarine",
        "item.epic.garnet",
        "item.epic.opal",
        "item.epic.pearl",
        "item.epic.peridot",
        "item.epic.ruby",
        "item.epic.sapphire",
        "item.epic.tanzanite",
        "item.epic.topaz"
    };
    public void socketItem(Item item);
}
