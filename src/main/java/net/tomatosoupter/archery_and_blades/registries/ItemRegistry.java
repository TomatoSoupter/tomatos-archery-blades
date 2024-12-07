package net.tomatosoupter.archery_and_blades.registries;

import io.redspace.ironsspellbooks.item.consumables.SimpleElixir;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.ExtendedElixir;
import net.tomatosoupter.archery_and_blades.item.armor.*;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryAndBlades.MODID);

    //Armors
        //Archer
    public static final DeferredItem<ArmorItem> ARCHER_HELMET = ITEMS.register("archer_helmet", () -> new ArcherArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<ArmorItem> ARCHER_CHESTPLATE = ITEMS.register("archer_chestplate", () -> new ArcherArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<ArmorItem> ARCHER_LEGGINGS = ITEMS.register("archer_leggings", () -> new ArcherArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<ArmorItem> ARCHER_BOOTS = ITEMS.register("archer_boots", () -> new ArcherArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(5))));
        //Knight
    public static final DeferredItem<ArmorItem> KNIGHT_HELMET = ITEMS.register("knight_helmet", () -> new KnightArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> KNIGHT_CHESTPLATE = ITEMS.register("knight_chestplate", () -> new KnightArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> KNIGHT_LEGGINGS = ITEMS.register("knight_leggings", () -> new KnightArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> KNIGHT_BOOTS = ITEMS.register("knight_boots", () -> new KnightArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(15))));
        //Paladin
    public static final DeferredItem<ArmorItem> PALADIN_HELMET = ITEMS.register("paladin_helmet", () -> new PaladinArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<ArmorItem> PALADIN_CHESTPLATE = ITEMS.register("paladin_chestplate", () -> new PaladinArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(33))));
    public static final DeferredItem<ArmorItem> PALADIN_LEGGINGS = ITEMS.register("paladin_leggings", () -> new PaladinArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(33))));
    public static final DeferredItem<ArmorItem> PALADIN_BOOTS = ITEMS.register("paladin_boots", () -> new PaladinArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(33))));
        //Reinforced
    public static final DeferredItem<ArmorItem> REINFORCED_HELMET = ITEMS.register("reinforced_helmet", () -> new ReinforcedLeatherArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(8))));
    public static final DeferredItem<ArmorItem> REINFORCED_CHESTPLATE = ITEMS.register("reinforced_chestplate", () -> new ReinforcedLeatherArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
    public static final DeferredItem<ArmorItem> REINFORCED_LEGGINGS = ITEMS.register("reinforced_leggings", () -> new ReinforcedLeatherArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
    public static final DeferredItem<ArmorItem> REINFORCED_BOOTS = ITEMS.register("reinforced_boots", () -> new ReinforcedLeatherArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(8))));
        //Thief
    public static final DeferredItem<ArmorItem> THIEF_HELMET = ITEMS.register("thief_helmet", () -> new ThiefArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<ArmorItem> THIEF_CHESTPLATE = ITEMS.register("thief_chestplate", () -> new ThiefArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(33))));
    public static final DeferredItem<ArmorItem> THIEF_LEGGINGS = ITEMS.register("thief_leggings", () -> new ThiefArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(33))));
    public static final DeferredItem<ArmorItem> THIEF_BOOTS = ITEMS.register("thief_boots", () -> new ThiefArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(33))));


    //Weapons
    public static final DeferredItem<SwordItem> BROADSWORD = ITEMS.register("broadsword", () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 9, -3f))));
    public static final DeferredItem<SwordItem> RAPIER = ITEMS.register("rapier", () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 3, -1.3f))));

    //Elixirs
    public static final DeferredItem<Item> EMPOWERMENT_ELIXIR = ITEMS.register("empowerment_elixir", () -> new ExtendedElixir(new Item.Properties(), () -> new MobEffectInstance(MobEffectRegistry.CHARGED, 1200, 1), () -> new MobEffectInstance(MobEffectRegistry.HASTENED, 1200, 4)));

    //Generic Items
    public static final DeferredItem<Item> BOUND_LEATHER = ITEMS.register("bound_leather", () -> new Item(ItemPropertiesHelper.material()));
    public static final DeferredItem<Item> TOUGHENED_LEATHER = ITEMS.register("toughened_leather", () -> new Item(ItemPropertiesHelper.material()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
