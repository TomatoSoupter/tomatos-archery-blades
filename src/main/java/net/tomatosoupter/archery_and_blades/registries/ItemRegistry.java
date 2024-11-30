package net.tomatosoupter.archery_and_blades.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.ArcherArmorItem;
import net.tomatosoupter.archery_and_blades.item.armor.PaladinArmorItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryAndBlades.MODID);

    //Armors
    public static final DeferredItem<ArmorItem> ARCHER_HELMET = ITEMS.register("archer_helmet", () -> new ArcherArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(100))));
    public static final DeferredItem<ArmorItem> ARCHER_CHESTPLATE = ITEMS.register("archer_chestplate", () -> new ArcherArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(100))));

    public static final DeferredItem<ArmorItem> PALADIN_HELMET = ITEMS.register("paladin_helmet", () -> new PaladinArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(100))));
    public static final DeferredItem<ArmorItem> PALADIN_CHESTPLATE = ITEMS.register("paladin_chestplate", () -> new PaladinArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(100))));
    public static final DeferredItem<ArmorItem> PALADIN_LEGGINGS = ITEMS.register("paladin_leggings", () -> new PaladinArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> PALADIN_BOOTS = ITEMS.register("paladin_boots", () -> new PaladinArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(100))));

    //Weapons
    public static final DeferredItem<SwordItem> BROADSWORD = ITEMS.register("broadsword", () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 6, -3.2f))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
