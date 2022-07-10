package zerokun265.fabric.copperrings;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperRings implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MODID = "copperrings";
	@Override
	public void onInitialize() {
		LOGGER.info("["+MODID+"] Initialized");
	}
}
