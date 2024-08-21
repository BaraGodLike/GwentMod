package net.baragodlike.gwentvlabodia.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.baragodlike.gwentvlabodia.recipe.GwentAdderRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class GwentAdderCategory implements IRecipeCategory<GwentAdderRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Gwent.MOD_ID, "gwent_adder");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Gwent.MOD_ID,
            "textures/gui/gwent_adder_gui.png");
    public static final RecipeType<GwentAdderRecipe> GWENT_ADDER_TYPE =
            new RecipeType<>(UID, GwentAdderRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public GwentAdderCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 140);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.GWENT_ADDER.get()));
    }


    @Override
    public RecipeType<GwentAdderRecipe> getRecipeType() {
        return GWENT_ADDER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.gwentvlabodia:gwent_adder");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, GwentAdderRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 62, 116).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 98, 116).addIngredients(recipe.getIngredients().get(1));
    }
}
