package net.baragodlike.gwentvlabodia.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.baragodlike.gwentvlabodia.Gwent;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GwentAdderRecipe implements Recipe<SimpleContainer> {
    final Ingredient book;
    final Ingredient card;
    private final ResourceLocation id;

    public GwentAdderRecipe(Ingredient book, Ingredient card, ResourceLocation id) {
        this.book = book;
        this.card = card;
        this.id = id;
    }


    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if (pLevel.isClientSide()) return false;
        return this.book.test(pContainer.getItem(0)) && this.card.test(pContainer.getItem(1));
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonNullList = NonNullList.withSize(2, Ingredient.EMPTY);
        nonNullList.set(0, this.book);
        nonNullList.set(1, this.card);
        return nonNullList;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return null;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<GwentAdderRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "gwent_adder";
    }

    public static class Serializer implements RecipeSerializer<GwentAdderRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(Gwent.MOD_ID, "gwent_adder");

        @Override
        public GwentAdderRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            Ingredient ingredient = Ingredient.fromJson(GsonHelper.getNonNull(pSerializedRecipe, "book"));
            Ingredient ingredient1 = Ingredient.fromJson(GsonHelper.getNonNull(pSerializedRecipe, "card"));
            return new GwentAdderRecipe(ingredient, ingredient1, pRecipeId);

        }

        @Override
        public @Nullable GwentAdderRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
            Ingredient ingredient1 = Ingredient.fromNetwork(pBuffer);
            return new GwentAdderRecipe(ingredient, ingredient1, pRecipeId);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, GwentAdderRecipe pRecipe) {
            pRecipe.book.toNetwork(pBuffer);
            pRecipe.card.toNetwork(pBuffer);
        }
    }
}
