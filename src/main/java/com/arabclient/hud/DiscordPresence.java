// src/main/java/com/arabclient/hud/DiscordPresence.java
package com.arabclient.hud;

import net.arikia.dev.drpc.Discord;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.DrawContext;

public class DiscordPresence {
    public static void init() {
        Discord.connect();
    }

    public static void render(DrawContext context) {
        if (MinecraftClient.getInstance().player == null) return;
        DiscordRichPresence.Builder builder = new DiscordRichPresence.Builder("Arab Client");
        builder.setDetails("Minecraft 1.21.11");
        builder.setState("Playing - Arab Client");
        builder.setBigImage("default", "Arab Client");
        Discord.updatePresence(builder.build());
    }
}
