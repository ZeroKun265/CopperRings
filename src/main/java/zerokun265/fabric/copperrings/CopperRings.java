package zerokun265.fabric.copperrings;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zerokun265.fabric.copperrings.item.ModItems;

public class CopperRings implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MODID = "copperrings";
	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
