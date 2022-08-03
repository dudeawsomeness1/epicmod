package com.invilis.epicmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SeasonalArmor extends ArmorItem {
    public SeasonalArmor(EquipmentSlot slot, Properties properties) {
        super(EpicArmorMaterials.SEASONAL, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        super.onArmorTick(stack, level, player);

        switch (slot) {
            case HEAD: // helmet of Spring: if you have two hearts or less and your hunger is greater than 3 drums, you will heal by 4 hearts with a cooldown of 12 minutes.
            if (!player.getCooldowns().isOnCooldown(this) && player.getHealth() <= 4.0F && player.getFoodData().getFoodLevel() > 6) {
                if (player.getHealth() + 8.0f >= player.getMaxHealth()) {
                    player.setHealth(player.getMaxHealth());
                }
                else {
                    player.heal(8.0f);
                }
                player.getCooldowns().addCooldown(this, 14400);
            }
            break;
            case CHEST:
            // Fire dampening effect
            break;
            case LEGS: // leggings of Autumn: if your hunger is 3 drums or less it will restore 1.5 drums with a cooldown of 15 minutes.
            if (!player.getCooldowns().isOnCooldown(this) && player.getFoodData().getFoodLevel() <= 6) {
                player.getFoodData().eat(3, 1.0F);
                player.getCooldowns().addCooldown(this, 18000);
                /* player.getInventory().clearOrCountMatchingItems((ItemStack itemStack) -> {
                    boolean isEdible = itemStack.isEdible();
                    if (isEdible) {
                        player.getFoodData().eat(itemStack.getItem(), itemStack, player);
                    }
                    return isEdible;
                }, 1, player.getInventory()); */
            }
            break;
            case FEET:
            if (player.isCrouching()) {
                player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, -1, 0, true, false));
            }
            break;
        }
    }
}
