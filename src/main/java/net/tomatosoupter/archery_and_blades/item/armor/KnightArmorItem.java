package net.tomatosoupter.archery_and_blades.item.armor;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ExtendedArmorItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.tomatosoupter.archery_and_blades.entity.armor.KnightArmorModel;
import net.tomatosoupter.archery_and_blades.registries.ArmorMaterialRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KnightArmorItem extends ExtendedArmorItem {
    public KnightArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ArmorMaterialRegistry.KNIGHT_ARMOR, slot, settings,
                new AttributeContainer(Attributes.ATTACK_DAMAGE, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new KnightArmorModel());
    }
}
