package zerokun265.fabric.copperrings.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import zerokun265.fabric.copperrings.CopperRings;
import zerokun265.fabric.copperrings.block.custom.JewelerStationBlock;
import zerokun265.fabric.copperrings.item.ModItemGroups;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block JEWELER_STATION= registerBlock("jeweler_station",
            new JewelerStationBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().strength(1f).requiresTool()),
            ItemGroup.MISC, "block.copperrings.tooltip.jewelerstation");


    public static void registerModBlocks(){
        CopperRings.LOGGER.info("Registering ModBlocks for mod: " + CopperRings.MODID);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(CopperRings.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(CopperRings.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(Text.translatable(tooltipKey));
                    }
                });
    }
    public static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CopperRings.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CopperRings.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
}
