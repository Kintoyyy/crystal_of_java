package io.github.crystal_of_java;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class MenuScreen implements Screen {
    private MainGame game;
    private TextureRegion startButton;
    private Texture background;
    private Texture logo;

    public MenuScreen(MainGame game) {
        this.game = game;  // Store reference to MainGame for switching screens
        background = new Texture("background-1.png");
        logo = new Texture("Game_Logo.png");
        Texture texture = new Texture(Gdx.files.internal("Menu_Buttons_Colored.png"));
        startButton = new TextureRegion(texture, 0, 0, 600, 200); // Your button texture
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);  // Clear the screen with black

        game.batch.begin();
        game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        game.batch.draw(logo, (Gdx.graphics.getWidth() - 500) / 2,260, 500, 260);

        game.batch.draw(startButton, (Gdx.graphics.getWidth() - 200) / 2,
            (Gdx.graphics.getHeight() - 60) / 3, 200, 60);
        game.batch.end();

        // Check if the user clicks the start button
        if (Gdx.input.justTouched()) {
            // Switch to the GameScreen when the button is clicked
            game.setScreen(new GameScreen(game));
            dispose();  // Release resources of the menu screen
        }
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
//        game.batch.dispose();
    }
}
