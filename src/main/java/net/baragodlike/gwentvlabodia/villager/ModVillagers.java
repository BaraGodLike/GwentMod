package net.baragodlike.gwentvlabodia.villager;

import com.google.common.collect.ImmutableSet;
import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Gwent.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Gwent.MOD_ID);

    public static final RegistryObject<PoiType> GWENT_POI = POI_TYPES.register("gwent_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.GWENT_ADDER.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> GWENT_COLLECTOR =
           VILLAGER_PROFESSIONS.register("gwentcollector", () -> new VillagerProfession("gwentcollector",
                   holder -> holder.get() == GWENT_POI.get(), holder -> holder.get() == GWENT_POI.get(),
                   ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
