package dev.lpsmods.barked;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Barked {

    public Barked() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
    }
}