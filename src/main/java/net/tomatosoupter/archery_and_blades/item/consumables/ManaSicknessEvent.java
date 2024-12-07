package net.tomatosoupter.archery_and_blades.item.consumables;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.registries.ABItemRegistry;
import net.tomatosoupter.archery_and_blades.registries.MobEffectRegistry;

import java.util.Set;

@EventBusSubscriber(modid = ArcheryAndBlades.MODID)
public class ManaSicknessEvent {
    @SubscribeEvent
    public static void onItemConsumed(LivingEntityUseItemEvent.Finish event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;

        Item consumedItem = event.getItem().getItem();

        if (DRINKABLE_ITEMS.contains(consumedItem) && !player.level().isClientSide) {
            MobEffect effect = MobEffectRegistry.MANA_SICKNESS.get();
            MobEffectInstance currentEffect = player.getEffect(MobEffectRegistry.MANA_SICKNESS);

            if (currentEffect != null) {
                int newAmplifier = Math.min(currentEffect.getAmplifier() + 1, 4);
                player.addEffect(new MobEffectInstance(MobEffectRegistry.MANA_SICKNESS, 1200, newAmplifier));
            } else {
                player.addEffect(new MobEffectInstance(MobEffectRegistry.MANA_SICKNESS, 1200, 0));
            }
        }
    }
    private static final Set<Item> DRINKABLE_ITEMS = Set.of(
            ABItemRegistry.EMPOWERMENT_ELIXIR.get(),
            ItemRegistry.EVASION_ELIXIR.get(),
            ItemRegistry.GREATER_EVASION_ELIXIR.get(),
            ItemRegistry.OAKSKIN_ELIXIR.get(),
            ItemRegistry.GREATER_OAKSKIN_ELIXIR.get(),
            ItemRegistry.INVISIBILITY_ELIXIR.get(),
            ItemRegistry.GREATER_INVISIBILITY_ELIXIR.get()
    );
}
