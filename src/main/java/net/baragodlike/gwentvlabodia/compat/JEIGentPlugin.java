package net.baragodlike.gwentvlabodia.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.recipe.GwentAdderRecipe;
import net.baragodlike.gwentvlabodia.screen.GwentAdderScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIGentPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Gwent.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new GwentAdderCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<GwentAdderRecipe> gwentadderRecipes = recipeManager.getAllRecipesFor(GwentAdderRecipe.Type.INSTANCE);
        registration.addRecipes(GwentAdderCategory.GWENT_ADDER_TYPE, gwentadderRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(GwentAdderScreen.class, 0, 0, 20, 20,
                GwentAdderCategory.GWENT_ADDER_TYPE);
    }
}
