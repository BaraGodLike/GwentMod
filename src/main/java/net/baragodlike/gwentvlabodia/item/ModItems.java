package net.baragodlike.gwentvlabodia.item;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Gwent.MOD_ID);
    public static final RegistryObject<Item> CLEAR_GWENT_CARD = ITEMS.register("clear_card", () -> new GwentCardItem(new Item.Properties()));
    public static final RegistryObject<Item> UNCLE_BOGDAN_CARD = ITEMS.register("uncle_bogdan_card", () ->
            new GwentCardItem(new Item.Properties(), 15, (byte) 1, (byte) 0, true,
                    "Никакие мысли не стоят того, чтобы их думать", 0, 1));
    public static final RegistryObject<Item> UNCLE_VLAD_CARD = ITEMS.register("uncle_vlad_card", () ->
            new GwentCardItem(new Item.Properties(), 15, (byte) 2, (byte) 0, true,
                    "Дядя, зачем мы это делаем?", 1, 1));
    public static final RegistryObject<Item> DED_CARD = ITEMS.register("ded_card", () ->
            new GwentHealerCardItem(new Item.Properties(), 7, (byte) 2, (byte) 0, true,
                    "Хайль Гитлер", 2, 1));
    public static final RegistryObject<Item> KARINA_CARD = ITEMS.register("karina_card", () ->
            new GwentCardItem(new Item.Properties(), 7, (byte) 2, (byte) 0, true,
                    "МяумяумМфмфрмяу", 3, 1));
    public static final RegistryObject<Item> JEWS_SOUL_CARD = ITEMS.register("jews_soul_card", () ->
            new GwentDecoyCardItem(new Item.Properties(), -1, (byte) -1, (byte) 0, false,
                    "Я возмездие...", 4, 3));
    public static final RegistryObject<Item> POSEIDON_CARD = ITEMS.register("poseidon_card", () ->
            new GwentWeatherCardItem(new Item.Properties(), -1, (byte) -2, (byte) 0, false,
                    "Ой дядя посейдон", 5, 2));
    public static final RegistryObject<Item> RASKUMAR_CARD = ITEMS.register("raskumar_card", () ->
            new GwentWeatherCardItem(new Item.Properties(), -1, (byte) -2, (byte) 0, false,
                    "Под раскумаром не то что меч, хуй тяжело держать", 6, 2));
    public static final RegistryObject<Item> MICKAEL_FART_CARD = ITEMS.register("mickael_fart_card", () ->
            new GwentWeatherCardItem(new Item.Properties(), -1, (byte) -2, (byte) 0, false,
                    "В таком едком пердеже нихуя не видно", 7, 2));
    public static final RegistryObject<Item> TURI_IP_IP_CARD = ITEMS.register("turi_ip_ip_card", () ->
            new GwentHornCardItem(new Item.Properties(), -1, (byte) -3, (byte) 0, false,
                    "Срать охота...", 8, 2));
    public static final RegistryObject<Item> DIARRHEA_CARD = ITEMS.register("diarrhea_card", () ->
            new GwentDiarrheaCardItem(new Item.Properties(), -1, (byte) -4, (byte) 0, false,
                    "Сыла тюри ипи ип нескинченна", 9, 3));
    public static final RegistryObject<Item> HORSE_LAUGH_CARD = ITEMS.register("horse_laugh_card", () ->
            new GwentWeatherCardItem(new Item.Properties(), -1, (byte) -2, (byte) 0, false,
                    "На все воля Конья", 10, 2));
    public static final RegistryObject<Item> BARSUK_EVGEN_CARD = ITEMS.register("barsuk_evgen_card", () ->
            new GwentCardItem(new Item.Properties(), 10, (byte) 1, (byte) 1, true,
                    "Первое творение Коня", 11, 1));
    public static final RegistryObject<Item> IGOGOSHA_CARD = ITEMS.register("igogosha_card", () ->
            new GwentCardItem(new Item.Properties(), 10, (byte) 3, (byte) 1, true,
                    "Игогогого", 12, 1));
    public static final RegistryObject<Item> BOBER_ILYA_CARD = ITEMS.register("bober_ilya_card", () ->
            new GwentSpyCardItem(new Item.Properties(), 6, (byte) 1, (byte) 1, false,
                    "Второе творение Коня, вышедшее из под контроля", 13, 1));
    public static final RegistryObject<Item> PONY_CARD = ITEMS.register("pony_card", () ->
            new GwentMusterCardItem(new Item.Properties(), 3, (byte) 3, (byte) 1, false,
                    "Прекрасные полубоги", 0, 14, 3));
    public static final RegistryObject<Item> ISHAK_CARD = ITEMS.register("ishak_card", () ->
            new GwentCardItem(new Item.Properties(), 5, (byte) 3, (byte) 1, false,
                    "Какой-то странный конь...", 15, 2));
    public static final RegistryObject<Item> GRANDMA_NARKO_CARD = ITEMS.register("grandma_narko_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 4, (byte) 2, (byte) 1, false,
                    "Внучок, хочешь гашиша?", 16, 1));
    public static final RegistryObject<Item> GRANDPA_WITHOUT_BRAINS_CARD = ITEMS.register("grandpa_without_brains_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 4, (byte) 1, (byte) 1, false,
                    "Эээээ, а где моя челюсть?", 17, 1));
    public static final RegistryObject<Item> DOG_BORIS_CARD = ITEMS.register("dog_boris_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 5, (byte) 1, (byte) 1, false,
                    "Третье творение Коня, мудрейшее существо", 18, 1));
    public static final RegistryObject<Item> ALLAH_CARD = ITEMS.register("allah_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 2, (byte) 1, false,
                    "Альтер-эго Богдана Малахова", 19, 1));
    public static final RegistryObject<Item> ARMEN_CARD = ITEMS.register("armen_card",
            () -> new GwentSpyCardItem(new Item.Properties(), 7, (byte) 3, (byte) 1, false,
                    "Дядя Кирилла", 20, 1));
    public static final RegistryObject<Item> IBRAGIM_CARD = ITEMS.register("ibragim_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 2, (byte) 1, false,
                    "Альтер-эго Владислава Тужикова", 21, 1));
    public static final RegistryObject<Item> ZUZU_CARD = ITEMS.register("zuzu_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 4, (byte) 2, (byte) 1, false,
                    "Дядя Боря", 22, 3));
    public static final RegistryObject<Item> BARSUCHONOK_ZHENKA_CARD = ITEMS.register("barsuchonok_zhenka_card",
            () -> new GwentCardItem(new Item.Properties(), 5, (byte) 1, (byte) 1, false,
                    "Сын Барсука Евгена", 23, 2));
    public static final RegistryObject<Item> SLUT_KATE_CARD = ITEMS.register("slut_kate_card",
            () -> new GwentHealerCardItem(new Item.Properties(), 4, (byte) 2, (byte) 1, false,
                    "3 булочки с маком в час", 24, 1));
    public static final RegistryObject<Item> GOPNIK_FROM_ZHIVOT_CARD = ITEMS.register("gopnik_from_zhivot_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 6, (byte) 3, (byte) 1, false,
                    "Семечки в животике", 2, 25, 1));
    public static final RegistryObject<Item> IRON_SOSALO_CARD = ITEMS.register("iron_sosalo_card",
            () -> new GwentCardItem(new Item.Properties(), 6, (byte) 1, (byte) 1, false,
                    "Проткнул шею Богдану", 26, 1));
    public static final RegistryObject<Item> WATERMELON_CARD = ITEMS.register("watermelon_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 8, (byte) 3, (byte) 1, false,
                    "Кавун", 3, 27, 1));
    public static final RegistryObject<Item> UNCLE_BORYA_CARD = ITEMS.register("uncle_borya_card",
            () -> new GwentCardItem(new Item.Properties(), 7, (byte) 1, (byte) 1, false,
                    "Ой, дядя Боря пришел", 28, 1));
    public static final RegistryObject<Item> TWELVE_TWENTY_SEVEN_CARD = ITEMS.register("twelve_twenty_seven_card",
            () -> new GwentCardItem(new Item.Properties(), 9, (byte) 3, (byte) 1, false,
                    "Легендарное время", 29, 2));
    public static final RegistryObject<Item> MONKEYY_CARD = ITEMS.register("monkeyy_card",
            () -> new GwentHealerCardItem(new Item.Properties(), 4, (byte) 1, (byte) 1, false,
                    "Чухает спинку", 30, 1));
    public static final RegistryObject<Item> UKRAINIAN_BOY_CARD = ITEMS.register("ukrainian_boy_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 2, (byte) 1, false,
                    "В украиньському сели народився хлопець", 31, 1));
    public static final RegistryObject<Item> BREVNO_CARD = ITEMS.register("brevno_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 3, (byte) 3, (byte) 1, false,
                    "Бревно спиздить треба", 4, 32, 5));
    public static final RegistryObject<Item> MINON_CARD = ITEMS.register("minon_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 1, (byte) 2, true,
                    "Сын Владоса и долбоеб", 11, 1));
    public static final RegistryObject<Item> BODYA_SUMOIST_CARD = ITEMS.register("bodya_sumoist_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 3, (byte) 2, true,
                    "На курс сел парни", 12, 1));
    public static final RegistryObject<Item> BOGDAN_SON_CARD = ITEMS.register("bogdan_son_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 2, (byte) 2, true,
                    "Сынок Владоса", 13, 1));
    public static final RegistryObject<Item> KYRILLO_CARD = ITEMS.register("kyrillo_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 1, (byte) 2, true,
                    "Брат из Грузии", 14, 1));
    public static final RegistryObject<Item> BALD_DICK_CARD = ITEMS.register("bald_dick_card",
            () -> new GwentSpyCardItem(new Item.Properties(), 7, (byte) 1, (byte) 2, false,
                    "Я че банкомат?", 15, 1));
    public static final RegistryObject<Item> GORYUK_CARD = ITEMS.register("goryuk_card",
            () -> new GwentCardItem(new Item.Properties(), 6, (byte) 3, (byte) 2, false,
                    "Умом умом", 16, 1));
    public static final RegistryObject<Item> BARBELL_CARD = ITEMS.register("barbell_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 1, (byte) 3, (byte) 2, false,
                    "Возлюбленная всех качков", 17, 3));
    public static final RegistryObject<Item> DUMBBELLS_1_KG_CARD = ITEMS.register("dumbbells_1_kg_card",
            () -> new GwentSpyCardItem(new Item.Properties(), 10, (byte) 1, (byte) 2, false,
                    "Рот ее ебал", 18, 2));
    public static final RegistryObject<Item> CREATINE_CARD = ITEMS.register("creatine_card",
            () -> new GwentHealerCardItem(new Item.Properties(), 0, (byte) 2, (byte) 2, false,
                    "Белый порошок...", 19, 2));
    public static final RegistryObject<Item> PODSNEZHNIK_CARD = ITEMS.register("podsnezhnik_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 3, (byte) 2, (byte) 2, false,
                    "Только близится лето вот и они", 1, 20, 5));
    public static final RegistryObject<Item> FITONYASHKA_CARD = ITEMS.register("fitonyashka_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 4, (byte) 2, (byte) 2, false,
                    "Лосины и поза раком", 21, 2));
    public static final RegistryObject<Item> GYM_MAN_CARD = ITEMS.register("gym_man_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 1, (byte) 2, false,
                    "Рама 8*8", 22, 2));
    public static final RegistryObject<Item> SPARTAK_CARD = ITEMS.register("spartak_card",
            () -> new GwentCardItem(new Item.Properties(), 5, (byte) 3, (byte) 2, false,
                    "7-8 раз ", 23, 1));
    public static final RegistryObject<Item> SEREGA_PIRAT_CARD = ITEMS.register("serega_pirat_card",
            () -> new GwentHornHeroCardItem(new Item.Properties(), 3, (byte) 2, (byte) 2, false,
                    "Потные мужчины тягают железо", 24, 1));
    public static final RegistryObject<Item> SPASOKUKOTSKY_CARD = ITEMS.register("spasokukotsky_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 6, (byte) 1, (byte) 2, false,
                    "Читинг - сила!", 2, 25, 1));
    public static final RegistryObject<Item> SON_OF_SPASOKUKOTSKY_CARD = ITEMS.register("son_of_spasokukotsky_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 4, (byte) 1, (byte) 2, false,
                    "Я долбоеб!", 3, 26, 1));
    public static final RegistryObject<Item> ZYZZ_CARD = ITEMS.register("zyzz_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 7, (byte) 2, (byte) 2, false,
                    "Мотивация", 27, 1));
    public static final RegistryObject<Item> BILLY_HERRINGTON_CARD = ITEMS.register("billy_herrington_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 1, (byte) 2, false,
                    "Фистинг ин май Эс", 28, 1));
    public static final RegistryObject<Item> MINI_PEKKA_CARD = ITEMS.register("mini_pekka_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 3, (byte) 2, false,
                    "Маленький да удаленький", 29, 1));
    public static final RegistryObject<Item> RONNY_COULMAN_CARD = ITEMS.register("ronny_coulman_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 3, (byte) 2, false,
                    "Легенда", 30, 1));
    public static final RegistryObject<Item> FAT_MAN_CARD = ITEMS.register("fat_man_card",
            () -> new GwentCardItem(new Item.Properties(), 3, (byte) 3, (byte) 2, false,
                    "Огромный шар", 31, 3));
    public static final RegistryObject<Item> CROSSFITER_CARD = ITEMS.register("crossfiter_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 2, (byte) 2, (byte) 2, false,
                    "Кроссфит - сила!", 32, 2));
    public static final RegistryObject<Item> BOBER_CARD = ITEMS.register("bober_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 3, (byte) 2, true,
                    "Бобэр курва", 11, 1));
    public static final RegistryObject<Item> HOMIK_UNCLE_CARD = ITEMS.register("homik_uncle_card",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 1, (byte) 2, true,
                    "Пипирапарибитютю", 12, 1));
    public static final RegistryObject<Item> VOZMEZDIE_CARD = ITEMS.register("vozmezdie_card",
            () -> new GwentCardItem(new Item.Properties(), 7, (byte) 2, (byte) 2, false,
                    "Я возмездие", 13, 2));
    public static final RegistryObject<Item> SUSLIK_CARD = ITEMS.register("suslik_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 3, (byte) 2, (byte) 2, false,
                    "Втыкает", 1, 14, 4));
    public static final RegistryObject<Item> RASKUMAR_TOY_CARD = ITEMS.register("raskumar_toy_card",
            () -> new GwentCardItem(new Item.Properties(), 4, (byte) 1, (byte) 2, false,
                    "Забор", 15, 1));
    public static final RegistryObject<Item> VLADOS_TOLCHOK_CARD = ITEMS.register("vlados_tolchok_card",
            () -> new GwentHealerCardItem(new Item.Properties(), 6, (byte) 3, (byte) 2, false,
                    "Святое место", 16, 1));
    public static final RegistryObject<Item> ANDREY_BUBUBURSHVILY_CARD = ITEMS.register("andrey_bububurshvily_card",
            () -> new GwentSpyCardItem(new Item.Properties(), 5, (byte) 2, (byte) 2, false,
                    "Он существует", 17, 1));
    public static final RegistryObject<Item> ROCKET_WITH_UNCLE_CARD = ITEMS.register("rocket_with_uncle_card",
            () -> new GwentHealerCardItem(new Item.Properties(), 5, (byte) 3, (byte) 2, false,
                    "ДЯДЯ ДЯДЯЯ ДЯДЯЯЯЯ", 18, 1));
    public static final RegistryObject<Item> GALOSHI_CARD = ITEMS.register("galoshi_card",
            () -> new GwentMusterCardItem(new Item.Properties(), 2, (byte) 1, (byte) 2, false,
                    "Чоботы", 2, 19, 4));
    public static final RegistryObject<Item> SQUIRREL_WITH_KOSAK_CARD = ITEMS.register("squirrel_with_kosak_card",
            () -> new GwentCardItem(new Item.Properties(), 6, (byte) 2, (byte) 2, false,
                    "Втыкает", 20, 2));
    public static final RegistryObject<Item> UGABUGA_CARD = ITEMS.register("ugabuga_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 9, (byte) 1, (byte) 2, true,
                    "Легенда раскумара", 21, 1));
    public static final RegistryObject<Item> MILLION_OF_VOLTAGE_CARD = ITEMS.register("million_of_voltage_card",
            () -> new GwentMillionVoltageCardItem(new Item.Properties(), 0, (byte) 3, (byte) 2, false,
                    "Чуть сам не погиб во сне", 22, 1));
    public static final RegistryObject<Item> OGUZOK = ITEMS.register("oguzok",
            () -> new GwentCardItem(new Item.Properties(), 4, (byte) 3, (byte) 2, false,
                    "Мемы с кухней", 23, 1));
    public static final RegistryObject<Item> MAZHORIK_CARD = ITEMS.register("mazhorik_card",
            () -> new GwentSpyCardItem(new Item.Properties(), 9, (byte) 1, (byte) 2, false,
                    "Проникновение в ноздри", 24, 1));
    public static final RegistryObject<Item> BADYA_CARD = ITEMS.register("badya_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 6, (byte) 2, (byte) 2, false,
                    "Один.", 25, 1));
    public static final RegistryObject<Item> VLODIK_CARD = ITEMS.register("vlodik_card",
            () -> new GwentTightBoundCardItem(new Item.Properties(), 6, (byte) 2, (byte) 2, false,
                    "Два.", 26, 1));
    public static final RegistryObject<Item> ABRIKOSIK_CARD = ITEMS.register("abrikosik_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 1, (byte) 3, (byte) 2, false,
                    "Абрикооосик", 27, 2));
    public static final RegistryObject<Item> HUI_TATARKI_CARD = ITEMS.register("hui_tatarki_card",
            () -> new GwentCardItem(new Item.Properties(), 8, (byte) 1, (byte) 2, false,
                    "У татарки хуй большой", 28, 1));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new GwentCardItem(new Item.Properties(), 6, (byte) 1, (byte) 2, false,
                    "Сын Жабы и Пельменя", 29, 2));
    public static final RegistryObject<Item> DROBITEL_CARD = ITEMS.register("drobitel_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 3, (byte) 3, (byte) 2, false,
                    "Смотришь - и не втыкаешь", 30, 3));
    public static final RegistryObject<Item> OSHKA_BOSHKA = ITEMS.register("oshka_boshka",
            () -> new GwentCardItem(new Item.Properties(), 10, (byte) 3, (byte) 2, false,
                    "Бабах", 31, 1));
    public static final RegistryObject<Item> LOPATA_CARD = ITEMS.register("lopata_card",
            () -> new GwentPlusCardItem(new Item.Properties(), 2, (byte) 3, (byte) 2, false,
                    "На день народження", 32, 1));
    public static final RegistryObject<Item> GWENT_BOOK = ITEMS.register("gwent_book", () -> new GwentBookItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
