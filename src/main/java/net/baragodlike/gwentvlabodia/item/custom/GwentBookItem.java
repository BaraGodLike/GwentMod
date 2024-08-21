package net.baragodlike.gwentvlabodia.item.custom;

import net.baragodlike.gwentvlabodia.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GwentBookItem extends Item {
    public GwentBookItem(Item.Properties properties) {
        super(properties);
    }

    public static final ArrayList<ArrayList<GwentCardItem>> CARDS = createCARDS();

    private static ArrayList<ArrayList<GwentCardItem>> createCARDS() {
        ArrayList<ArrayList<GwentCardItem>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            list.get(i).add((GwentCardItem) ModItems.UNCLE_BOGDAN_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.UNCLE_VLAD_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.DED_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.KARINA_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.JEWS_SOUL_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.POSEIDON_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.RASKUMAR_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.MICKAEL_FART_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.TURI_IP_IP_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.DIARRHEA_CARD.get());
            list.get(i).add((GwentCardItem) ModItems.HORSE_LAUGH_CARD.get());
        }
        list.get(((GwentCardItem) ModItems.BARSUK_EVGEN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BARSUK_EVGEN_CARD.get());
        list.get(((GwentCardItem) ModItems.IGOGOSHA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.IGOGOSHA_CARD.get());
        list.get(((GwentCardItem) ModItems.BOBER_ILYA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BOBER_ILYA_CARD.get());
        list.get(((GwentCardItem) ModItems.PONY_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.PONY_CARD.get());
        list.get(((GwentCardItem) ModItems.ISHAK_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.ISHAK_CARD.get());
        list.get(((GwentCardItem) ModItems.GRANDMA_NARKO_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.GRANDMA_NARKO_CARD.get());
        list.get(((GwentCardItem) ModItems.GRANDPA_WITHOUT_BRAINS_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.GRANDPA_WITHOUT_BRAINS_CARD.get());
        list.get(((GwentCardItem) ModItems.DOG_BORIS_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.DOG_BORIS_CARD.get());
        list.get(((GwentCardItem) ModItems.ALLAH_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.ALLAH_CARD.get());
        list.get(((GwentCardItem) ModItems.ARMEN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.ARMEN_CARD.get());
        list.get(((GwentCardItem) ModItems.IBRAGIM_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.IBRAGIM_CARD.get());
        list.get(((GwentCardItem) ModItems.ZUZU_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.ZUZU_CARD.get());
        list.get(((GwentCardItem) ModItems.BARSUCHONOK_ZHENKA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BARSUCHONOK_ZHENKA_CARD.get());
        list.get(((GwentCardItem) ModItems.SLUT_KATE_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.SLUT_KATE_CARD.get());
        list.get(((GwentCardItem) ModItems.GOPNIK_FROM_ZHIVOT_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.GOPNIK_FROM_ZHIVOT_CARD.get());
        list.get(((GwentCardItem) ModItems.IRON_SOSALO_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.IRON_SOSALO_CARD.get());
        list.get(((GwentCardItem) ModItems.WATERMELON_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.WATERMELON_CARD.get());
        list.get(((GwentCardItem) ModItems.UNCLE_BORYA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.UNCLE_BORYA_CARD.get());
        list.get(((GwentCardItem) ModItems.TWELVE_TWENTY_SEVEN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.TWELVE_TWENTY_SEVEN_CARD.get());
        list.get(((GwentCardItem) ModItems.MONKEYY_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.MONKEYY_CARD.get());
        list.get(((GwentCardItem) ModItems.UKRAINIAN_BOY_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.UKRAINIAN_BOY_CARD.get());
        list.get(((GwentCardItem) ModItems.BREVNO_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BREVNO_CARD.get());
        list.get(((GwentCardItem) ModItems.MINON_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.MINON_CARD.get());
        list.get(((GwentCardItem) ModItems.BODYA_SUMOIST_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BODYA_SUMOIST_CARD.get());
        list.get(((GwentCardItem) ModItems.BOGDAN_SON_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BOGDAN_SON_CARD.get());
        list.get(((GwentCardItem) ModItems.KYRILLO_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.KYRILLO_CARD.get());
        list.get(((GwentCardItem) ModItems.BALD_DICK_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BALD_DICK_CARD.get());
        list.get(((GwentCardItem) ModItems.GORYUK_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.GORYUK_CARD.get());
        list.get(((GwentCardItem) ModItems.BARBELL_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BARBELL_CARD.get());
        list.get(((GwentCardItem) ModItems.DUMBBELLS_1_KG_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.DUMBBELLS_1_KG_CARD.get());
        list.get(((GwentCardItem) ModItems.CREATINE_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.CREATINE_CARD.get());
        list.get(((GwentCardItem) ModItems.PODSNEZHNIK_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.PODSNEZHNIK_CARD.get());
        list.get(((GwentCardItem) ModItems.FITONYASHKA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.FITONYASHKA_CARD.get());
        list.get(((GwentCardItem) ModItems.GYM_MAN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.GYM_MAN_CARD.get());
        list.get(((GwentCardItem) ModItems.SPARTAK_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.SPARTAK_CARD.get());
        list.get(((GwentCardItem) ModItems.SEREGA_PIRAT_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.SEREGA_PIRAT_CARD.get());
        list.get(((GwentCardItem) ModItems.SPASOKUKOTSKY_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.SPASOKUKOTSKY_CARD.get());
        list.get(((GwentCardItem) ModItems.SON_OF_SPASOKUKOTSKY_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.SON_OF_SPASOKUKOTSKY_CARD.get());
        list.get(((GwentCardItem) ModItems.ZYZZ_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.ZYZZ_CARD.get());
        list.get(((GwentCardItem) ModItems.BILLY_HERRINGTON_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.BILLY_HERRINGTON_CARD.get());
        list.get(((GwentCardItem) ModItems.MINI_PEKKA_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.MINI_PEKKA_CARD.get());
        list.get(((GwentCardItem) ModItems.RONNY_COULMAN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.RONNY_COULMAN_CARD.get());
        list.get(((GwentCardItem) ModItems.FAT_MAN_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.FAT_MAN_CARD.get());
        list.get(((GwentCardItem) ModItems.CROSSFITER_CARD.get()).getDeck() - 1).add((GwentCardItem) ModItems.CROSSFITER_CARD.get());
        return list;
    }

    public static boolean canAddCard(ItemStack itemstack, GwentCardItem card) {
        if (itemstack.hasTag()) {
            CompoundTag tag = itemstack.getTag();
            if (tag.contains("gwentvlabodia.hasCard")) {
                ArrayList<Integer> listCards = new ArrayList<>(Arrays.stream(tag.getIntArray("gwentvlabodia.hasCard")).boxed().toList());
                if (card.getDeck() == 0 || !tag.contains("gwentvlabodia.currentDeck") || (tag.getInt("gwentvlabodia.currentDeck") == card.getDeck())) {
                    int cnt = 0;
                    for (Integer i : listCards) if (i == card.getNameId()) cnt++;
                    return (cnt < card.getCount());
                }
                return false;
            }
        }
        return true;
    }

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
//        if(pLevel.isClientSide()) {
//            outputTMP(pPlayer);
//        }
//        return super.use(pLevel, pPlayer, pUsedHand);
//    }
//
//    private void outputTMP(Player player) {
//        player.sendSystemMessage(Component.literal("Сори, я не доделал"));
//    }

    public void addNbtToDataTablet(GwentCardItem card, ItemStack thisBook) {
        CompoundTag nbtData = new CompoundTag();
        byte deckInt = card.getDeck();
        if (deckInt > 0) {
            nbtData.putInt("gwentvlabodia.currentDeck", deckInt);
        }
        List<Integer> listCards = new ArrayList<>();
        if (thisBook.hasTag())
            if (thisBook.getTag().contains("gwentvlabodia.hasCard")) {
                listCards = new ArrayList<>(Arrays.stream(thisBook.getTag().getIntArray("gwentvlabodia.hasCard")).boxed().toList());
            }
        listCards.add(card.getNameId());
        nbtData.putIntArray("gwentvlabodia.hasCard", listCards);
        if (thisBook.hasTag())
            thisBook.getTag().merge(nbtData);
        else thisBook.setTag(nbtData);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.hasTag();
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (pStack.hasTag() && pStack.getTag().contains("gwentvlabodia.currentDeck")) {
            int deck = pStack.getTag().getInt("gwentvlabodia.currentDeck");
            pTooltipComponents.add(Component.literal("Колода: " + (deck == 1 ? "Mythology" : deck == 2 ? "Gym" : "Raskumar")));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }

}
