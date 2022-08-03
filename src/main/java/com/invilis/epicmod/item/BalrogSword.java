package com.invilis.epicmod.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class BalrogSword extends SwordItem {
    public BalrogSword(int damage, float speed, Properties properties) {
        super(EpicTiers.SHADOW_FLAME, damage, speed, properties.fireResistant());
    }
    
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity assailant) {
        target.setSecondsOnFire(2);

        return super.hurtEnemy(stack, target, assailant);
    }
}
