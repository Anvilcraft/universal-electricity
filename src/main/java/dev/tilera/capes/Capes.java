package dev.tilera.capes;

import com.jadarstudios.developercapes.DevCapes;

import net.minecraftforge.common.MinecraftForge;

public class Capes {
    
    private static boolean capesInitialized = false;

    public static void initCapes() {
        if (!capesInitialized) {
            capesInitialized = true;
            try {
                DevCapes.getInstance().registerConfig(
                    "https://git.tilera.org/tilera/capes/raw/branch/master/devcapes.json"
                );
                MinecraftForge.EVENT_BUS.register(new RenderEventHandler());
            } catch (Exception e) {
                System.out.print("Cant load capes\n" + e);
            }
        }
    }

}
