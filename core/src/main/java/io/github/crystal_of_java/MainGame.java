package io.github.crystal_of_java;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {
    public SpriteBatch batch;  // Shared SpriteBatch

    @Override
    public void create() {
        batch = new SpriteBatch();
        // Set the initial screen to the menu screen
        setScreen(new MenuScreen(this));
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
