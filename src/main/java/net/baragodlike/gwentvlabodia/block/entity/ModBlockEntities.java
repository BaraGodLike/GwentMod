package net.baragodlike.gwentvlabodia.block.entity;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Gwent.MOD_ID);

    public static final RegistryObject<BlockEntityType<GwentAdderBlockEntity>> GWENT_ADDER_BE =
            BLOCK_ENTITIES.register("gwent_adder_be", () ->
                    BlockEntityType.Builder.of(GwentAdderBlockEntity::new,
                            ModBlocks.GWENT_ADDER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
