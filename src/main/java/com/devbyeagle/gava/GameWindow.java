package com.devbyeagle.gava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public final class GameWindow {
    private final JFrame frame;
    private final Canvas canvas;

    GameWindow() {
        frame = new JFrame();
        canvas = new Canvas();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas.createBufferStrategy(3);
    }

    protected Canvas getCanvas() { return canvas; }
    protected JFrame getFrame() { return frame; }
}