package com.devbyeagle.pong;

import com.devbyeagle.gava.*;

public class PongGame extends Game {
    @Override public void update() {
        System.out.println(time().getFramesPerSecond());
    }

    @Override public void draw() {

    }

    public static void main(String[] args) {
        PongGame game = new PongGame();
        game.run();
        game.dispose();
    }
}