package net.baragodlike.gwentvlabodia.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.baragodlike.gwentvlabodia.item.custom.GwentBookItem;
import net.baragodlike.gwentvlabodia.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Gwent.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.GWENT_COLLECTOR.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


//            Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    10, 3, 0.05f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.PAPER, 19),
                    new ItemStack(Items.EMERALD, 1),
                    15, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.GOLD_NUGGET, 10),
                    40, 1, 0.05f));
//            Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 7),
                    new ItemStack(ModItems.GWENT_BOOK.get(), 1),
                    3, 15, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 14),
                    new ItemStack(ModBlocks.GWENT_ADDER.get(), 1),
                    10, 15, 0.02f));
//            Level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(ModItems.DIARRHEA_CARD.get(), 1),
                    4, 10, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(ModItems.POSEIDON_CARD.get(), 1),
                    4, 10, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(ModItems.RASKUMAR_CARD.get(), 1),
                    4, 10, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(ModItems.HORSE_LAUGH_CARD.get(), 1),
                    4, 10, 0.02f));
//            Level 4
            Random random = new Random();
            int deck = random.nextInt(3);
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(GwentBookItem.CARDS.get(deck).get(random.nextInt(21 - deck == 0 ? 2 : 4) + 11 + deck == 0 ? 2 : 4), 1),
                    2, 20, 0.02f));


//            Level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 45),
                    new ItemStack(ModItems.CLEAR_GWENT_CARD.get(), 1),
                    new ItemStack(GwentBookItem.CARDS.get(deck).get(random.nextBoolean() ? random.nextInt(4) : (random.nextInt(deck == 0 ? 2 : 4) + 11)), 1),
                    1, 20, 0.00f));

        }


    }
}
