package io.github.crystal_of_java;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen {
    private MainGame game;
    private Texture background;

    public GameScreen(MainGame game) {
        this.game = game;  // Store reference to MainGame
        background = new Texture("background-2.png");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);  // Clear the screen with dark gray

        game.batch.begin();
        game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        game.batch.end();

//        game.batch.draw(startButton, (Gdx.graphics.getWidth() - 200) / 2,
//            (Gdx.graphics.getHeight() - 60) / 3, 200, 60);
//        game.batch.end();
//
//        // Check if the user clicks the start button
//        if (Gdx.input.justTouched()) {
//            // Switch to the GameScreen when the button is clicked
//            game.setScreen(new GameScreen(game));
//            dispose();  // Release resources of the menu screen
//        }
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
        background.dispose();
    }
}
