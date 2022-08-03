package com.invilis.epicmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class AthelasTea extends Item {
    public AthelasTea(Properties properties) {
        super(properties.food(EpicFoods.ATHELAS_TEA));
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 0));
        entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 460, 0));
        entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 460, 1));
        entity.removeEffect(MobEffects.POISON);
        entity.removeEffect(MobEffects.WITHER);

        if (entity instanceof Player && !((Player)entity).isCreative()) {
            ((Player)entity).getInventory().add(new ItemStack(Items.GLASS_BOTTLE, 1));
        }
        
        return super.finishUsingItem(stack, level, entity);
    }
}
