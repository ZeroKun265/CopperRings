package zerokun265.fabric.copperrings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import zerokun265.fabric.copperrings.CopperRings;
import zerokun265.fabric.copperrings.trinkets.*;

public class ModItems {

    public static final Item COPPER_SHANK = registerItem("copper_shank", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COPPER_RING = registerItem("copper_ring", new CopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DIAMOND_COPPER_RING = registerItem("diamond_copper_ring", new DiamondCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item EMERALD_COPPER_RING = registerItem("emerald_copper_ring", new EmeraldCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item GOLD_COPPER_RING = registerItem("gold_copper_ring", new GoldCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item IRON_COPPER_RING = registerItem("iron_copper_ring", new IronCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item LAPIS_COPPER_RING = registerItem("lapis_copper_ring", new LapisCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item NETHERITE_COPPER_RING = registerItem("netherite_copper_ring", new NetheriteCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item REDSTONE_COPPER_RING = registerItem("redstone_copper_ring", new RedstoneCopperRing(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CopperRings.MODID, name), item);
    }

    public static void registerModItems() {
       CopperRings.LOGGER.info("Initializing ModItems for mod: " + CopperRings.MODID);
    }
}
