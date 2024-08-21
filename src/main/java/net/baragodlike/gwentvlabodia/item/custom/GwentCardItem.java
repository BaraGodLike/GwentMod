package net.baragodlike.gwentvlabodia.item.custom;

import net.minecraft.client.gui.components.events.ContainerEventHandler;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GwentCardItem extends Item {

    protected int nameId = -1;
    protected int value = -1;

    /**
     * 0 - ближний бой
     * 1 - дальний бой
     * 2 - осадный бой
     * 3 - погодная
     * 4 - чучело
     * 5 - казнь
     * 6 - рог
     */
    protected byte type = -1;

    /**
     * 0 - общая
     * 1 - мифология
     * 2 - качалка
     * 3 - раскумар
     */
    protected byte deck = -1;
    protected String description = "Это пустая карта для Гвинта";
    protected int count = 1;
    protected boolean hero = false;
    public GwentCardItem(Properties properties) {
        super(properties);
    }

    /**
     *
     * @param value сила карты
     * @param type 1 - ближний бой; 2 - дальний бой; 3 - осадный бой
     * @param deck 0 - общая; 1 - мифология; 2 - качалка; 3 - раскумар
     * @param hero карта героя или нет
     * @param description описание карты
     * @param nameId айдишник карты в колоде
     */
    public GwentCardItem(Properties properties, int value, byte type, byte deck, boolean hero, String description, int nameId, int count) {
        super(properties);
        this.value = value;
        this.type = type;
        this.deck = deck;
        this.description = description;
        this.hero = hero;
        this.nameId = nameId;
        this.count = count;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal(description));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public int getValue() {
        return value;
    }

    public byte getType() {
        return type;
    }
    public int getCount() {return count;}

    /**
     * 0 - общая
     * 1 - мифология
     * 2 - качалка
     * 3 - раскумар
     */
    public byte getDeck() {
        return deck;
    }

    public String getDescriptionCard() {
        return description;
    }

    public boolean isHero() {
        return hero;
    }

    public int getNameId() {
        return nameId;
    }
}
