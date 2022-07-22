package zerokun265.fabric.copperrings.trinkets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class GoldCopperRing extends TrinketItem {
    private int absorption_timer = 0;
    public GoldCopperRing(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 10, 1));
        if(absorption_timer == 0) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 150, 0));
            absorption_timer = 1;

        } else {
            absorption_timer += 1;
        }
        if (absorption_timer == 100) {
            absorption_timer = 0;
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.copperrings.gold_copper_ring.tooltip"));
        tooltip.add(Text.translatable("item.copperrings.rings.tooltip.equip"));

    }
}
