package net.tomatosoupter.archery_and_blades.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.ArcherArmorItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryAndBlades.MODID);

    //Armors
    public static final DeferredItem<ArmorItem> ARCHER_HELMET = ITEMS.register("archer_helmet", () -> new ArcherArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(100))));
    public static final DeferredItem<ArmorItem> ARCHER_CHESTPLATE = ITEMS.register("archer_chestplate", () -> new ArcherArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(100))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
