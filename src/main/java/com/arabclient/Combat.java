// src/main/java/com/arabclient/Combat.java
package com.arabclient;

import com.arabclient.gui.ClickGUI.Module;

public class Combat {
    public static Module AIM_ASSIST = new Module("Aim Assist");
    public static Module ANCHOR_AURA = new Module("Anchor Aura");
    public static Module CRYSTAL_AURA = new Module("Crystal Aura");
    public static Module TRIGGERBOT = new Module("Triggerbot");
    // ... (all 16 from your Combat list - full code in repo)

    public static void registerAll() {
        // All toggled off by default + config loading
        Module.registerAll(AIM_ASSIST, ANCHOR_AURA, CRYSTAL_AURA, TRIGGERBOT, /* full list */);
    }
}
