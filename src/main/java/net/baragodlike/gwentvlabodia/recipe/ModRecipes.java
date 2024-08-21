package net.baragodlike.gwentvlabodia.recipe;

import net.baragodlike.gwentvlabodia.Gwent;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZES =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Gwent.MOD_ID);

    public static final RegistryObject<RecipeSerializer<GwentAdderRecipe>> GWENT_ADDER_SERIALIZER =
            SERIALIZES.register("gwent_adder", () -> GwentAdderRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZES.register(eventBus);
    }
}
