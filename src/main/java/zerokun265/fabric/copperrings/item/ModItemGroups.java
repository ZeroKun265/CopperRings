package zerokun265.fabric.copperrings.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import zerokun265.fabric.copperrings.CopperRings;

public class ModItemGroups {
    public static final ItemGroup COPPER_RINGS = FabricItemGroupBuilder.build(new Identifier(CopperRings.MODID, "copperrings"), () -> new ItemStack(ModItems.COPPER_SHANK));
}
