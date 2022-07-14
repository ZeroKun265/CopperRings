package zerokun265.fabric.copperrings.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import zerokun265.fabric.copperrings.block.ModBlocks;

public class CopperRingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JEWELER_STATION, RenderLayer.getCutout());
    }
}
