package net.tomatosoupter.archery_and_blades.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;

import java.util.function.Supplier;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArcheryAndBlades.MODID);

    public static final Supplier<CreativeModeTab> ARCHERY_AND_BLADES = CREATIVE_MODE_TAB.register("archery_and_blades",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.ARCHER_HELMET.get()))
                    .title(Component.translatable("tab.archery_and_blades.main"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ItemRegistry.ARCHER_HELMET.get());
                        output.accept(ItemRegistry.ARCHER_CHESTPLATE.get());
                        output.accept(ItemRegistry.ARCHER_LEGGINGS.get());
                        output.accept(ItemRegistry.ARCHER_BOOTS.get());

                        output.accept(ItemRegistry.REINFORCED_HELMET.get());
                        output.accept(ItemRegistry.REINFORCED_CHESTPLATE.get());
                        output.accept(ItemRegistry.REINFORCED_LEGGINGS.get());
                        output.accept(ItemRegistry.REINFORCED_BOOTS.get());

                        output.accept(ItemRegistry.KNIGHT_HELMET.get());
                        output.accept(ItemRegistry.KNIGHT_CHESTPLATE.get());
                        output.accept(ItemRegistry.KNIGHT_LEGGINGS.get());
                        output.accept(ItemRegistry.KNIGHT_BOOTS.get());

                        output.accept(ItemRegistry.PALADIN_HELMET.get());
                        output.accept(ItemRegistry.PALADIN_CHESTPLATE.get());
                        output.accept(ItemRegistry.PALADIN_LEGGINGS.get());
                        output.accept(ItemRegistry.PALADIN_BOOTS.get());

                        output.accept(ItemRegistry.THIEF_HELMET.get());
                        output.accept(ItemRegistry.THIEF_CHESTPLATE.get());
                        output.accept(ItemRegistry.THIEF_LEGGINGS.get());
                        output.accept(ItemRegistry.THIEF_BOOTS.get());

                        output.accept(ItemRegistry.BROADSWORD.get());
                        output.accept(ItemRegistry.RAPIER.get());

                        output.accept(ItemRegistry.BOUND_LEATHER.get());
                        output.accept(ItemRegistry.TOUGHENED_LEATHER.get());

                        output.accept(ItemRegistry.EMPOWERMENT_ELIXIR.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
