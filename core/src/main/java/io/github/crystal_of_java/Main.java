package io.github.crystal_of_java;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    private Texture backgroundTexture;
    private SpriteBatch batch;
    private Texture image;
    private TextureRegion startButton;

    private float buttonWidth = 200;  // Adjust the button width
    private float buttonHeight = 60;  // Adjust the button height
    private float buttonX;
    private float buttonY;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("background-1.png");
        Texture texture = new Texture(Gdx.files.internal("Menu_Buttons_Colored.png"));

        backgroundTexture = new Texture("background.jpg");
        startButton = new TextureRegion(texture, 0, 0, 600, 200);

        // Calculate button's position to center it
        buttonX = (Gdx.graphics.getWidth() - buttonWidth) / 2;
        buttonY = (Gdx.graphics.getHeight() - buttonHeight) / 2;
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        batch.begin();
        // Draw background image
        batch.draw(image, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        // Draw start button in the center
        batch.draw(startButton, buttonX, buttonY, buttonWidth, buttonHeight);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
        backgroundTexture.dispose();
    }
}
