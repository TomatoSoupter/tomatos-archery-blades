package net.tomatosoupter.archery_and_blades.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ExtendedArmorItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.tomatosoupter.archery_and_blades.entity.armor.ArcherArmorModel;
import net.tomatosoupter.archery_and_blades.entity.armor.PaladinArmorModel;
import net.tomatosoupter.archery_and_blades.registries.ArmorMaterialRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PaladinArmorItem extends ExtendedArmorItem {
    public PaladinArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ArmorMaterialRegistry.PALADIN_ARMOR, slot, settings,
                new AttributeContainer(Attributes.ATTACK_DAMAGE, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.HOLY_SPELL_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA,25, AttributeModifier.Operation.ADD_VALUE));

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new PaladinArmorModel());
    }
}
