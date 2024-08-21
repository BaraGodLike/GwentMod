package net.baragodlike.gwentvlabodia.datagen;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.baragodlike.gwentvlabodia.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Gwent.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.GWENT_CARDS)
                .add(ModItems.UNCLE_BOGDAN_CARD.get(),
                        ModItems.UNCLE_VLAD_CARD.get(),
                        ModItems.DED_CARD.get(),
                        ModItems.KARINA_CARD.get(),
                        ModItems.JEWS_SOUL_CARD.get(),
                        ModItems.POSEIDON_CARD.get(),
                        ModItems.RASKUMAR_CARD.get(),
                        ModItems.MICKAEL_FART_CARD.get(),
                        ModItems.TURI_IP_IP_CARD.get(),
                        ModItems.DIARRHEA_CARD.get(),
                        ModItems.HORSE_LAUGH_CARD.get(),
                        ModItems.BARSUK_EVGEN_CARD.get(),
                        ModItems.IGOGOSHA_CARD.get(),
                        ModItems.BOBER_ILYA_CARD.get(),
                        ModItems.PONY_CARD.get(),
                        ModItems.ISHAK_CARD.get(),
                        ModItems.GRANDMA_NARKO_CARD.get(),
                        ModItems.GRANDPA_WITHOUT_BRAINS_CARD.get(),
                        ModItems.DOG_BORIS_CARD.get(),
                        ModItems.ALLAH_CARD.get(),
                        ModItems.ARMEN_CARD.get(),
                        ModItems.IBRAGIM_CARD.get(),
                        ModItems.ZUZU_CARD.get(),
                        ModItems.BARSUCHONOK_ZHENKA_CARD.get(),
                        ModItems.SLUT_KATE_CARD.get(),
                        ModItems.GOPNIK_FROM_ZHIVOT_CARD.get(),
                        ModItems.IRON_SOSALO_CARD.get(),
                        ModItems.WATERMELON_CARD.get(),
                        ModItems.UNCLE_BORYA_CARD.get(),
                        ModItems.TWELVE_TWENTY_SEVEN_CARD.get(),
                        ModItems.MONKEYY_CARD.get(),
                        ModItems.UKRAINIAN_BOY_CARD.get(),
                        ModItems.BREVNO_CARD.get(),
                        ModItems.MINON_CARD.get(),
                        ModItems.BODYA_SUMOIST_CARD.get(),
                        ModItems.BOGDAN_SON_CARD.get(),
                        ModItems.KYRILLO_CARD.get(),
                        ModItems.BALD_DICK_CARD.get(),
                        ModItems.GORYUK_CARD.get(),
                        ModItems.BARBELL_CARD.get(),
                        ModItems.DUMBBELLS_1_KG_CARD.get(),
                        ModItems.CREATINE_CARD.get(),
                        ModItems.PODSNEZHNIK_CARD.get(),
                        ModItems.FITONYASHKA_CARD.get(),
                        ModItems.GYM_MAN_CARD.get(),
                        ModItems.SPARTAK_CARD.get(),
                        ModItems.SEREGA_PIRAT_CARD.get(),
                        ModItems.SPASOKUKOTSKY_CARD.get(),
                        ModItems.SON_OF_SPASOKUKOTSKY_CARD.get(),
                        ModItems.ZYZZ_CARD.get(),
                        ModItems.BILLY_HERRINGTON_CARD.get(),
                        ModItems.MINI_PEKKA_CARD.get(),
                        ModItems.RONNY_COULMAN_CARD.get(),
                        ModItems.FAT_MAN_CARD.get(),
                        ModItems.CROSSFITER_CARD.get()
                        );
    }


}
