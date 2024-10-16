package io.github.crystal_of_java.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import io.github.crystal_of_java.MainGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("LibGDX Game");
        config.setWindowedMode(960, 540);  // Set window size
        config.setResizable(false);
        new Lwjgl3Application(new MainGame(), config);
    }
}
