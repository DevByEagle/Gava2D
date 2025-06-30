package org.gava;

import java.awt.Graphics;

import org.gava.utils.Disposable;

public class Game implements Disposable {
    private final Display display;

    private String title = "Gava2D";
    private boolean running = false;

    private final int fps = 60;

    public Game() {
        display = new Display(800, 600, title);
    }

    public void dispose() {
    }

    public final void run() {
        long lastTime = System.nanoTime();
        double nsPerTick = 1_000_000_000.0 / fps;
        // double delta = 0;

        display.createBuffer();

        while (running) {
            long now = System.nanoTime();
            if ((now - lastTime) >= nsPerTick) {
                update();
                draw(display.getGraphics());
                lastTime = now;
            }
        }
    }

    protected void draw(Graphics g) {
        display.swapBuffers();
    }

    protected void update() {}

    public void setTitle(String title) {
        this.title = title;
        if (display.getFrame() != null) {
            display.getFrame().setTitle(title);
        }
    }
}