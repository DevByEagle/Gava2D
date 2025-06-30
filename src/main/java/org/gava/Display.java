package org.gava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

// TODO: Make this not public to everyone.
public class Display extends Canvas {
    private JFrame frame;

    protected Display(int width, int height, String title) {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
        frame.setVisible(true);
        setFocusable(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public Graphics getGraphics() {
        BufferStrategy bs = getBufferStrategy();
        return bs.getDrawGraphics();
    }

    public void createBuffer() {
        this.createBufferStrategy(2);
    }

    public void swapBuffers() {
        BufferStrategy bs = getBufferStrategy();
        bs.show();
    }
}