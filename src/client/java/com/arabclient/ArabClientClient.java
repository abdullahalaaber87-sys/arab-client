package com.arabclient;

import com.arabclient.gui.ClickGUI;
import com.arabclient.gui.HUDSettingsPanel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class ArabClientClient implements ClientModInitializer {

    public static KeyBinding GUI_KEYBIND;

    @Override
    public void onInitializeClient() {
        GUI_KEYBIND = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.arabclient.gui", org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT, "category.arabclient"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (GUI_KEYBIND.wasPressed()) {
                client.setScreen(new ClickGUI());
            }
        });
    }
}
