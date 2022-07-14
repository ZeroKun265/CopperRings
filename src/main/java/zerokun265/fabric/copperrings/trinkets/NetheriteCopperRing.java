package zerokun265.fabric.copperrings.trinkets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class NetheriteCopperRing extends TrinketItem {
    public NetheriteCopperRing(Settings settings) {
        super(settings);
    }

    // Method from the Trinkets Mod
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        // +50% knockback resistance
        modifiers.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "copperrings:knockback_resistance", 0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +75% attack knockback
        modifiers.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(uuid, "copperrings:knockback", 0.75, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }
}
