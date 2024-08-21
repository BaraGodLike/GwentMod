package net.baragodlike.gwentvlabodia.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.item.custom.GwentBookItem;
import net.baragodlike.gwentvlabodia.item.custom.GwentCardItem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GwentAdderScreen extends AbstractContainerScreen<GwentAdderMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Gwent.MOD_ID, "textures/gui/gwent_adder_gui.png");

    public GwentAdderScreen(GwentAdderMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        this.inventoryLabelY = 10000;
        this.titleLabelY = 10000;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressCard(guiGraphics, x, y);
        renderCards(guiGraphics, x, y);
        renderHoverText(guiGraphics, x, y, pMouseX, pMouseY);
    }

    private void renderProgressCard(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 98, y + 116, 180, 0, 18, menu.getScaledProgress());
        }
    }
    private void renderHoverText(GuiGraphics guiGraphics, int x, int y, int mouseX, int mouseY) {
        if (menu.hasBook()) {
            ArrayList<Integer> listCards = new ArrayList<>(Arrays.stream(menu.getCardsTag()).boxed().toList());
            int deck = menu.getDeckTag();
            for (int j = 0; j < GwentBookItem.CARDS.get(deck).size(); j++) {
                ItemStack itemStack = new ItemStack(GwentBookItem.CARDS.get(deck).get(j));
                int col = j % 12;
                int row = j / 12;
                int page = col < 6 ? 17 : 30;
                if (listCards.contains(GwentBookItem.CARDS.get(deck).get(j).getNameId()) && (mouseX > x + page + (8 + 3) * col && mouseX < x + page + (8 + 3) * col + 8 && mouseY > y + 13 + row * (16 + 7) && mouseY < y + 13 + row * (16 + 7) + 16)) {
                    if (Screen.hasShiftDown()) {
                        GwentCardItem card = (GwentCardItem) itemStack.getItem();
                        List<Component> component = this.getTooltipFromContainerItem(itemStack);
                        if (card.getCount() > 1) {
                            int cnt = 0;
                            for (int k = 0; k < listCards.size(); k++)
                                if (listCards.get(k) == card.getNameId()) cnt++;
                            component.add(1, Component.literal("Количество: " + cnt + "/" + card.getCount()));
                        }
                        component.add(1, Component.literal("Тип: " + (card.getType() == 1 ? "ближний" : card.getType() == 2 ? "дальний" : card.getType() == 3 ? "осадный" : card.getType() == -1 ? "чучело" : card.getType() == -2 ? "погодная" : card.getType() == -3 ? "рог" : "казнь")));
                        component.add(1, Component.literal("Герой: " + (card.isHero() ? "да" : "нет")));
                        if (card.getValue() >= 0)
                            component.add(1, Component.literal("Сила: " + card.getValue()));
                        guiGraphics.renderTooltip(this.font, component, itemStack.getTooltipImage(), mouseX, mouseY);
                    }
                    else guiGraphics.renderTooltip(this.font, this.getTooltipFromContainerItem(itemStack), itemStack.getTooltipImage(), mouseX, mouseY);
                }
            }
        }
    }

    private void renderCards(GuiGraphics guiGraphics, int x, int y) {
        if (menu.hasBook()) {
            int[] cards = menu.getCardsTag();
            for (int i = 0; i < cards.length; i++) {
                if (cards[i] < 0) continue;
                int col = cards[i] % 12;
                int row = cards[i] / 12;
                int page = col < 6 ? 17 : 30;
                int deck = menu.getDeckTag();
                guiGraphics.blit(TEXTURE, x + page + (8 + 3)*col, y + 13 + row * (16 + 7), cards[i] * 8, 168 + deck * 16, 8, 16);
            }
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
