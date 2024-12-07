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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ABItemRegistry.ARCHER_HELMET.get()))
                    .title(Component.translatable("tab.archery_and_blades.main"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ABItemRegistry.ARCHER_HELMET.get());
                        output.accept(ABItemRegistry.ARCHER_CHESTPLATE.get());
                        output.accept(ABItemRegistry.ARCHER_LEGGINGS.get());
                        output.accept(ABItemRegistry.ARCHER_BOOTS.get());

                        output.accept(ABItemRegistry.REINFORCED_HELMET.get());
                        output.accept(ABItemRegistry.REINFORCED_CHESTPLATE.get());
                        output.accept(ABItemRegistry.REINFORCED_LEGGINGS.get());
                        output.accept(ABItemRegistry.REINFORCED_BOOTS.get());

                        output.accept(ABItemRegistry.KNIGHT_HELMET.get());
                        output.accept(ABItemRegistry.KNIGHT_CHESTPLATE.get());
                        output.accept(ABItemRegistry.KNIGHT_LEGGINGS.get());
                        output.accept(ABItemRegistry.KNIGHT_BOOTS.get());

                        output.accept(ABItemRegistry.PALADIN_HELMET.get());
                        output.accept(ABItemRegistry.PALADIN_CHESTPLATE.get());
                        output.accept(ABItemRegistry.PALADIN_LEGGINGS.get());
                        output.accept(ABItemRegistry.PALADIN_BOOTS.get());

                        output.accept(ABItemRegistry.THIEF_HELMET.get());
                        output.accept(ABItemRegistry.THIEF_CHESTPLATE.get());
                        output.accept(ABItemRegistry.THIEF_LEGGINGS.get());
                        output.accept(ABItemRegistry.THIEF_BOOTS.get());

                        output.accept(ABItemRegistry.BROADSWORD.get());
                        output.accept(ABItemRegistry.RAPIER.get());

                        output.accept(ABItemRegistry.BOUND_LEATHER.get());
                        output.accept(ABItemRegistry.TOUGHENED_LEATHER.get());

                        output.accept(ABItemRegistry.EMPOWERMENT_ELIXIR.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
