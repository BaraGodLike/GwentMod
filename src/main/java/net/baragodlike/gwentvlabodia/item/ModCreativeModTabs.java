package net.baragodlike.gwentvlabodia.item;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gwent.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GWENT_TAB = CREATIVE_MOD_TABS.register("gwent_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLEAR_GWENT_CARD.get()))
            .title(Component.translatable("creativetab.gwent_tab"))
            .displayItems(((pParameters, pOutput) -> {
                pOutput.accept(ModItems.CLEAR_GWENT_CARD.get());
                pOutput.accept(ModItems.GWENT_BOOK.get());
                pOutput.accept(ModBlocks.GWENT_BOARD.get());
                pOutput.accept(ModBlocks.GWENT_ADDER.get());
                pOutput.accept(ModItems.UNCLE_BOGDAN_CARD.get());
                pOutput.accept(ModItems.UNCLE_VLAD_CARD.get());
                pOutput.accept(ModItems.DED_CARD.get());
                pOutput.accept(ModItems.KARINA_CARD.get());
                pOutput.accept(ModItems.JEWS_SOUL_CARD.get());
                pOutput.accept(ModItems.POSEIDON_CARD.get());
                pOutput.accept(ModItems.RASKUMAR_CARD.get());
                pOutput.accept(ModItems.MICKAEL_FART_CARD.get());
                pOutput.accept(ModItems.TURI_IP_IP_CARD.get());
                pOutput.accept(ModItems.DIARRHEA_CARD.get());
                pOutput.accept(ModItems.HORSE_LAUGH_CARD.get());
                pOutput.accept(ModItems.BARSUK_EVGEN_CARD.get());
                pOutput.accept(ModItems.IGOGOSHA_CARD.get());
                pOutput.accept(ModItems.BOBER_ILYA_CARD.get());
                pOutput.accept(ModItems.PONY_CARD.get());
                pOutput.accept(ModItems.ISHAK_CARD.get());
                pOutput.accept(ModItems.GRANDMA_NARKO_CARD.get());
                pOutput.accept(ModItems.GRANDPA_WITHOUT_BRAINS_CARD.get());
                pOutput.accept(ModItems.DOG_BORIS_CARD.get());
                pOutput.accept(ModItems.ALLAH_CARD.get());
                pOutput.accept(ModItems.ARMEN_CARD.get());
                pOutput.accept(ModItems.IBRAGIM_CARD.get());
                pOutput.accept(ModItems.ZUZU_CARD.get());
                pOutput.accept(ModItems.BARSUCHONOK_ZHENKA_CARD.get());
                pOutput.accept(ModItems.SLUT_KATE_CARD.get());
                pOutput.accept(ModItems.GOPNIK_FROM_ZHIVOT_CARD.get());
                pOutput.accept(ModItems.IRON_SOSALO_CARD.get());
                pOutput.accept(ModItems.WATERMELON_CARD.get());
                pOutput.accept(ModItems.UNCLE_BORYA_CARD.get());
                pOutput.accept(ModItems.TWELVE_TWENTY_SEVEN_CARD.get());
                pOutput.accept(ModItems.MONKEYY_CARD.get());
                pOutput.accept(ModItems.UKRAINIAN_BOY_CARD.get());
                pOutput.accept(ModItems.BREVNO_CARD.get());
                pOutput.accept(ModItems.MINON_CARD.get());
                pOutput.accept(ModItems.BODYA_SUMOIST_CARD.get());
                pOutput.accept(ModItems.BOGDAN_SON_CARD.get());
                pOutput.accept(ModItems.KYRILLO_CARD.get());
                pOutput.accept(ModItems.BALD_DICK_CARD.get());
                pOutput.accept(ModItems.GORYUK_CARD.get());
                pOutput.accept(ModItems.BARBELL_CARD.get());
                pOutput.accept(ModItems.DUMBBELLS_1_KG_CARD.get());
                pOutput.accept(ModItems.CREATINE_CARD.get());
                pOutput.accept(ModItems.PODSNEZHNIK_CARD.get());
                pOutput.accept(ModItems.FITONYASHKA_CARD.get());
                pOutput.accept(ModItems.GYM_MAN_CARD.get());
                pOutput.accept(ModItems.SPARTAK_CARD.get());
                pOutput.accept(ModItems.SEREGA_PIRAT_CARD.get());
                pOutput.accept(ModItems.SPASOKUKOTSKY_CARD.get());
                pOutput.accept(ModItems.SON_OF_SPASOKUKOTSKY_CARD.get());
                pOutput.accept(ModItems.ZYZZ_CARD.get());
                pOutput.accept(ModItems.BILLY_HERRINGTON_CARD.get());
                pOutput.accept(ModItems.MINI_PEKKA_CARD.get());
                pOutput.accept(ModItems.RONNY_COULMAN_CARD.get());
                pOutput.accept(ModItems.FAT_MAN_CARD.get());
                pOutput.accept(ModItems.CROSSFITER_CARD.get());
            }))
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
