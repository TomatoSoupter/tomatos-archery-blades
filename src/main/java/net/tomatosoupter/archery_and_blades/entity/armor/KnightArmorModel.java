package net.tomatosoupter.archery_and_blades.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.KnightArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class KnightArmorModel extends DefaultedItemGeoModel<KnightArmorItem> {

    public KnightArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(KnightArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "geo/knight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KnightArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "textures/models/armor/knight_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KnightArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
