package net.baragodlike.gwentvlabodia.item.custom;

public class GwentSpyCardItem extends GwentCardItem implements CardAbilityInterface{


    public GwentSpyCardItem(Properties properties) {
        super(properties);
    }

    public GwentSpyCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int nameId, int count) {
        super(properties, value, type, deck, hero, description, nameId, count);
    }

    @Override
    public void useAbility() {

    }
}
