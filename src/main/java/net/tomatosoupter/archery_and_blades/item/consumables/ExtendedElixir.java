package net.tomatosoupter.archery_and_blades.item.consumables;

import io.redspace.ironsspellbooks.item.consumables.DrinkableItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;

import java.util.function.Supplier;

public class ExtendedElixir extends DrinkableItem {

    public ExtendedElixir(Properties properties, Supplier<MobEffectInstance>...effects) {
        super(properties, (stack, entity) -> {
        for(Supplier<MobEffectInstance> effect : effects) {
            entity.addEffect(effect.get());
        }}, Items.GLASS_BOTTLE, true);
}}
