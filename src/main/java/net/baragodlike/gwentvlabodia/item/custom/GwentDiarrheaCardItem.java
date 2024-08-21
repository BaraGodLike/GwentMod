package net.baragodlike.gwentvlabodia.item.custom;

public class GwentDiarrheaCardItem extends GwentCardItem implements CardAbilityInterface{

    public GwentDiarrheaCardItem(Properties properties) {
        super(properties);
    }

    public GwentDiarrheaCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int nameId, int count) {
        super(properties, value, type, deck, hero, description, nameId, count);
    }

    @Override
    public void useAbility() {

    }
}
