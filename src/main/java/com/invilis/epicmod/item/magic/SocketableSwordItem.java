package com.invilis.epicmod.item.magic;

import java.util.HashSet;

import com.invilis.epicmod.EpicMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SocketableSwordItem extends SwordItem implements Socketable {
    public final int NUM_SOCKETS;
    private HashSet<String> socketItems;
    // Example item ID: item.epicmod.mithril_sword

    public SocketableSwordItem(Tier tier, int damage, float speed, Item.Properties properties) {
        super(tier, damage, speed, properties);
        socketItems = new HashSet<String>();

        NUM_SOCKETS = 1;
        socketItem(Items.AMETHYST_SHARD);
        for (String itemID : socketItems) {
            EpicMod.log(itemID);
        }
    }

    @Override
    public void socketItem(Item item) {
        socketItems.add(item.getDescriptionId());
    }

    /* @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity assailant) {
        float damageDealt = target.getHealth();
        boolean retVal = super.hurtEnemy(stack, target, assailant);

        for (String itemID : socketItems) {
            switch (itemID) {
                case "item.minecraft.amethyst_shard":
                damageDealt -= target.getHealth();
                EpicMod.log(String.format("%f", damageDealt));
                assailant.heal(damageDealt * 0.2F);
                break;
            }
        }

        return retVal;
    } */
}
