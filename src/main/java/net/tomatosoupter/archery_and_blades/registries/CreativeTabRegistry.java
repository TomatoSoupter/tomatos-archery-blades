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
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
