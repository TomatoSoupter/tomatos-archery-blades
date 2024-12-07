package net.tomatosoupter.archery_and_blades.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.tomatosoupter.archery_and_blades.ArcheryAndBlades;
import net.tomatosoupter.archery_and_blades.item.armor.ThiefArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class ThiefArmorModel extends DefaultedItemGeoModel<ThiefArmorItem> {

    public ThiefArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(ThiefArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "geo/thief_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ThiefArmorItem object) {
        return ResourceLocation.fromNamespaceAndPath(ArcheryAndBlades.MODID, "textures/models/armor/thief_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ThiefArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
