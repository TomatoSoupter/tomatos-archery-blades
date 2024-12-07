package net.tomatosoupter.archery_and_blades.item.armor;

import io.redspace.ironsspellbooks.item.armor.ExtendedArmorItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.tomatosoupter.archery_and_blades.registries.ArmorMaterialRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ReinforcedLeatherArmorItem extends ExtendedArmorItem {
    public ReinforcedLeatherArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ArmorMaterialRegistry.REINFORCED_LEATHER_ARMOR, slot, settings,
                //Primary Buffs
                new AttributeContainer(Attributes.ATTACK_DAMAGE, 0.025, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
    }

    @Override
    public GeoArmorRenderer<?> supplyRenderer() {
        return null;
    }
}
