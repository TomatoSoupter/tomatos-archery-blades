package net.tomatosoupter.archery_and_blades.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;

public class TagRegistry {
    private static TagKey<Item> itemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "quiver_whitelist"));
    }
}
