package net.baragodlike.gwentvlabodia.item.custom;

public class GwentHealerCardItem extends GwentCardItem implements CardAbilityInterface{
    public GwentHealerCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int nameId, int count) {
        super(properties, value, type, deck, hero, description, nameId, count);
    }


    @Override
    public void useAbility() {

    }
}
