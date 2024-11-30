package net.tomatosoupter.archery_and_blades.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.PaladinArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class PaladinArmorModel extends DefaultedItemGeoModel<PaladinArmorItem> {

    public PaladinArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(PaladinArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "geo/paladin_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PaladinArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "textures/models/armor/paladin_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PaladinArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "animations/wizard_armor_animation.json");
    }
}
