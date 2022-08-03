package com.invilis.epicmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class EpicFoods {
    public static final FoodProperties ATHELAS_TEA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.5F).alwaysEat().build();
    public static final FoodProperties CORN = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties JELLY_BEANS = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 80, 0), 0.3F).fast().build();
    public static final FoodProperties LEMBAS = (new FoodProperties.Builder()).nutrition(20).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.SATURATION, 3600, 0), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), 0.5F).build();
    public static final FoodProperties POPCORN = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).build();
}
