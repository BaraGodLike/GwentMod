package net.baragodlike.gwentvlabodia.util;

import net.baragodlike.gwentvlabodia.Gwent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Gwent.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> GWENT_CARDS = tag("gwent_cards");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Gwent.MOD_ID, name));
        }
    }
}
