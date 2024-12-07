package net.tomatosoupter.archery_and_blades.registries;


import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.effect.MagicMobEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import org.jetbrains.annotations.NotNull;

public class MobEffectRegistry {
    public static final DeferredRegister<MobEffect> MOB_EFFECT_DEFERRED_REGISTER = DeferredRegister.create(Registries.MOB_EFFECT, ArcheryAndBlades.MODID);

    public MobEffectRegistry() {
    }

    public static void register(IEventBus eventBus) {
        MOB_EFFECT_DEFERRED_REGISTER.register(eventBus);
    }

    public static final DeferredHolder<MobEffect, MobEffect> MANA_SICKNESS = MOB_EFFECT_DEFERRED_REGISTER.register("mana_sickness",
            () -> new MagicMobEffect(MobEffectCategory.HARMFUL, 8157083).addAttributeModifier(AttributeRegistry.MANA_REGEN, ArcheryAndBlades.id("mana_sickness"), -0.1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(AttributeRegistry.COOLDOWN_REDUCTION, ArcheryAndBlades.id("mana_sickness"), 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );
}


