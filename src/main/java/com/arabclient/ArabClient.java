package com.arabclient;

import com.arabclient.gui.ClickGUI;
import net.fabricmc.api.ModInitializer;

public class ArabClient implements ModInitializer {
    public static final String MOD_ID = "arabclient";

    @Override
    public void onInitialize() {
        System.out.println("[Arab Client] Loaded - Minecraft 1.21.11");
        
        // Register all modules (Combat + all categories)
        Combat.registerAll();
        Misc.registerAll();
        Donut.registerAll();
        Render.registerAll();
        ArabClient.registerAll();
        Movement.registerAll();
        BaseRaid.registerAll();
        Visuals.registerAll();

        // Discord RPC
        hud.DiscordPresence.init();
    }
}
