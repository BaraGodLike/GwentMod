package net.baragodlike.gwentvlabodia.datagen;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Gwent.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CLEAR_GWENT_CARD);
        simpleItem(ModItems.GWENT_BOOK);
        simpleItem(ModItems.UNCLE_VLAD_CARD);
        simpleItem(ModItems.UNCLE_BOGDAN_CARD);
        simpleItem(ModItems.DED_CARD);
        simpleItem(ModItems.KARINA_CARD);
        simpleItem(ModItems.JEWS_SOUL_CARD);
        simpleItem(ModItems.POSEIDON_CARD);
        simpleItem(ModItems.RASKUMAR_CARD);
        simpleItem(ModItems.MICKAEL_FART_CARD);
        simpleItem(ModItems.TURI_IP_IP_CARD);
        simpleItem(ModItems.DIARRHEA_CARD);
        simpleItem(ModItems.HORSE_LAUGH_CARD);
        simpleItem(ModItems.BARSUK_EVGEN_CARD);
        simpleItem(ModItems.IGOGOSHA_CARD);
        simpleItem(ModItems.BOBER_ILYA_CARD);
        simpleItem(ModItems.PONY_CARD);
        simpleItem(ModItems.ISHAK_CARD);
//        simpleItem(ModItems.GRANDMA_NARKO_CARD);
//        simpleItem(ModItems.GRANDPA_WITHOUT_BRAINS_CARD);
//        simpleItem(ModItems.DOG_BORIS_CARD);
//        simpleItem(ModItems.ALLAH_CARD);
//        simpleItem(ModItems.ARMEN_CARD);
//        simpleItem(ModItems.IBRAGIM_CARD);
//        simpleItem(ModItems.ZUZU_CARD);
//        simpleItem(ModItems.BARSUCHONOK_ZHENKA_CARD);
//        simpleItem(ModItems.SLUT_KATE_CARD);
//        simpleItem(ModItems.GOPNIK_FROM_ZHIVOT_CARD);
//        simpleItem(ModItems.IRON_SOSALO_CARD);
//        simpleItem(ModItems.WATERMELON_CARD);
//        simpleItem(ModItems.UNCLE_BORYA_CARD);
//        simpleItem(ModItems.TWELVE_TWENTY_SEVEN_CARD);
//        simpleItem(ModItems.MONKEYY_CARD);
//        simpleItem(ModItems.UKRAINIAN_BOY_CARD);
//        simpleItem(ModItems.BREVNO_CARD);
        simpleItem(ModItems.MINON_CARD);
        simpleItem(ModItems.BODYA_SUMOIST_CARD);
        simpleItem(ModItems.BOGDAN_SON_CARD);
        simpleItem(ModItems.KYRILLO_CARD);
        simpleItem(ModItems.BALD_DICK_CARD);
        simpleItem(ModItems.GORYUK_CARD);
        simpleItem(ModItems.BARBELL_CARD);
        simpleItem(ModItems.DUMBBELLS_1_KG_CARD);
        simpleItem(ModItems.CREATINE_CARD);
//        simpleItem(ModItems.PODSNEZHNIK_CARD);
//        simpleItem(ModItems.FITONYASHKA_CARD);
//        simpleItem(ModItems.GYM_MAN_CARD);
//        simpleItem(ModItems.SPARTAK_CARD);
//        simpleItem(ModItems.SEREGA_PIRAT_CARD);
//        simpleItem(ModItems.SPASOKUKOTSKY_CARD);
//        simpleItem(ModItems.SON_OF_SPASOKUKOTSKY_CARD);
//        simpleItem(ModItems.ZYZZ_CARD);
//        simpleItem(ModItems.BILLY_HERRINGTON_CARD);
//        simpleItem(ModItems.MINI_PEKKA_CARD);
//        simpleItem(ModItems.RONNY_COULMAN_CARD);
//        simpleItem(ModItems.FAT_MAN_CARD);
//        simpleItem(ModItems.CROSSFITER_CARD);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Gwent.MOD_ID, "item/" + item.getId().getPath()));
    }
}
