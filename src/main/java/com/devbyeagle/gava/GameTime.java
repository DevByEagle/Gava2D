package com.devbyeagle.gava;

public final class GameTime {
    private long lastTime;
    private static float deltaTime;

    private int frames;
    private int fps;
    private long frameStart;

    protected GameTime() {
        lastTime = System.nanoTime();
        frameStart = lastTime;
    }

    protected void tick() {
        long now = System.nanoTime();

        deltaTime = (now - lastTime) / 1_000_000_000f;
        lastTime = now;

        frames++;
        if (now - frameStart >= 1_000_000_000L) {
            fps = frames;
            frames = 0;
            frameStart = now;
        }
    }
    
    public static float getDeltaTime() { return deltaTime; }

    public int getFramesPerSecond() { return fps; }
}