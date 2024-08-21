package net.baragodlike.gwentvlabodia.item.custom;

public class GwentMusterCardItem extends GwentCardItem implements CardAbilityInterface{

    private int group;
    public GwentMusterCardItem(Properties properties) {
        super(properties);
    }

    public GwentMusterCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int group, int nameId, int count) {
        super(properties, value, type, deck, hero, description, nameId, count);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void useAbility() {

    }
}
