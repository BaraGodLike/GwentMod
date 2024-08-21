package net.baragodlike.gwentvlabodia;

import com.mojang.logging.LogUtils;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.baragodlike.gwentvlabodia.block.entity.ModBlockEntities;
import net.baragodlike.gwentvlabodia.item.ModCreativeModTabs;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.baragodlike.gwentvlabodia.recipe.ModRecipes;
import net.baragodlike.gwentvlabodia.screen.GwentAdderScreen;
import net.baragodlike.gwentvlabodia.screen.ModMenuTypes;
import net.baragodlike.gwentvlabodia.villager.ModVillagers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(Gwent.MOD_ID)
public class Gwent {
    public static final String MOD_ID = "gwentvlabodia";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Gwent() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModTabs.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModVillagers.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.GWENT_ADDER_MENU.get(), GwentAdderScreen::new);
        }
    }
}
