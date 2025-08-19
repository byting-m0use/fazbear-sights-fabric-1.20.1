package vermins.bytem0use.github.fs;

import net.fabricmc.api.ClientModInitializer;

public class FazbearSightsClient implements ClientModInitializer {
    public static final String MOD_ID = "fazbear-sights";

    @Override
    public void onInitializeClient() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        FazbearSights.LOGGER.info("Hello Fabric client world!");
    }

}
