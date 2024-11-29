package net.tomatosoupter.archery_and_blades.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.ArcherArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class ArcherArmorModel extends DefaultedItemGeoModel<ArcherArmorItem> {

    public ArcherArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(ArcherArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "geo/archer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArcherArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "textures/models/armor/archer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArcherArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "animations/wizard_armor_animation.json");
    }
}