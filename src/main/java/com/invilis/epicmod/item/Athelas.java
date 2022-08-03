package com.invilis.epicmod.item;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class Athelas extends Item {
    public Athelas(Properties p_41383_) {
        super(p_41383_);
    }
    
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (player.hasEffect(MobEffects.POISON) || player.hasEffect(MobEffects.WITHER)) {
            player.removeEffect(MobEffects.POISON);
            player.removeEffect(MobEffects.WITHER);
            ItemStack heldItem = player.getItemInHand(hand);
            heldItem.setCount(heldItem.getCount() - 1);
        }

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal(
                "When the Black Breath blows\nand death's shadow grows\nand all lights pass,\ncome athelas! Come athelas!\nLife to the dying\nIn the king's hand lying!"
                ).withStyle(ChatFormatting.GOLD));
            //components.add(Component.translatable("Hello").withStyle(ChatFormatting.GOLD));
        }
        else {
            //components.add(Component.literal("Press SHIFT for lore").withStyle(ChatFormatting.DARK_GREEN));
            components.add(Component.translatable("athelas_lore").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}
