package net.tomatosoupter.archery_and_blades.item.armor;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ExtendedArmorItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.tomatosoupter.archery_and_blades.entity.armor.ArcherArmorModel;
import net.tomatosoupter.archery_and_blades.registries.ArmorMaterialRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArcherArmorItem extends ExtendedArmorItem {
    public ArcherArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ArmorMaterialRegistry.ARCHER_ARMOR, slot, settings,
                new AttributeContainer(ALObjects.Attributes.ARROW_DAMAGE, 0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ALObjects.Attributes.ARROW_VELOCITY, 0.15, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ALObjects.Attributes.DRAW_SPEED, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new ArcherArmorModel());
    }
}
