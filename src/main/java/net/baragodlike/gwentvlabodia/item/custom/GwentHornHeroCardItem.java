package net.baragodlike.gwentvlabodia.item.custom;

public class GwentHornHeroCardItem extends GwentCardItem implements CardAbilityInterface{

    public GwentHornHeroCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int nameId, int count) {
        super(properties, value, type, deck, hero, description, nameId, count);
    }

    @Override
    public void useAbility() {

    }
}
