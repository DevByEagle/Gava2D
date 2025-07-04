package com.devbyeagle.gava;

import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import com.devbyeagle.gava.utils.Disposable;

public class Game implements Disposable {
    private boolean running = true;

    private static final GameTime gameTime = new GameTime();

    private GameWindow gameWindow;

    public Game() {
        gameWindow = new GameWindow();
    }

    public void dispose() {
        running = false;
    }

    // exit func here

    public final void run() {
        while (running) {
            gameTime.tick();

            update();

            draw();
        }
        dispose();
    }

    public final GameTime time() { return gameTime; }

    public void update() {}

    public void draw() {
        render();
    }

    private void render() {
        BufferStrategy bs = gameWindow.getCanvas().getBufferStrategy();
        if (bs == null) return;
        Graphics2D g = (Graphics2D) bs.getDrawGraphics();
        g.clearRect(0, 0, gameWindow.getCanvas().getWidth(), gameWindow.getCanvas().getHeight());
        g.dispose();
        bs.show();
    }
}