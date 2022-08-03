package com.invilis.epicmod;

import org.slf4j.Logger;

import com.invilis.epicmod.block.EpicBlocks;
import com.invilis.epicmod.item.EpicItems;
import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicMod.MOD_ID)
public class EpicMod {
    public static final String MOD_ID = "epicmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void log(String message) {
        LOGGER.info(message);
    }

    public EpicMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EpicItems.register(modEventBus);
        EpicBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
