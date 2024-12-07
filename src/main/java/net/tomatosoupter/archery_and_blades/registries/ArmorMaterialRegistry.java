package net.tomatosoupter.archery_and_blades.registries;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraft.Util;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.SoundType;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ArmorMaterialRegistry {

    //ARCHER ARMOR TIER
    public static final Holder<ArmorMaterial> ARCHER_ARMOR = register("archer_armor",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 0);
                attribute.put(ArmorItem.Type.BOOTS, 0);
            }), 15, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 0, () -> Items.LEATHER);

    //REINFORCED LEATHER ARMOR TIER
    public static final Holder<ArmorMaterial> REINFORCED_LEATHER_ARMOR = register("reinforced_leather",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.BOOTS, 1);
            }), 15, 0, SoundEvents.ARMOR_EQUIP_CHAIN, 0, () -> Items.LEATHER);

    //PALADIN ARMOR TIER
    public static final Holder<ArmorMaterial> PALADIN_ARMOR = register("paladin_armor",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 3);
            }), 10, 2, SoundEvents.ARMOR_EQUIP_NETHERITE, 0, () -> ItemRegistry.DIVINE_PEARL.get());

    //THIEF ARMOR TIER
    public static final Holder<ArmorMaterial> THIEF_ARMOR = register("thief_armor",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 3);
            }), 10, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 0, () -> Items.LEATHER);

    //KNIGHT ARMOR TIER
    public static final Holder<ArmorMaterial> KNIGHT_ARMOR = register("knight_armor",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 3);
            }), 9, 1, SoundEvents.ARMOR_EQUIP_IRON, 1, () -> Items.IRON_INGOT);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, Holder<SoundEvent> equipSound, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
