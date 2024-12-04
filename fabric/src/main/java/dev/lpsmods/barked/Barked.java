package dev.lpsmods.barked;

import net.fabricmc.api.ModInitializer;

public class Barked implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
