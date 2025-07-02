package org.gava.graphics;

public class Color {
    public static final Color WHITE = new Color(1, 1, 1, 1);
    public static final Color BLACK = new Color(0, 0, 0, 1);

    public float r, g, b, a;

    public Color() {}

    public Color(float r, float g, float b, float a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public int toARGB() {
        int A = (int) (a * 255) & 0xFF;
        int R = (int) (r * 255) & 0xFF;
        int G = (int) (g * 255) & 0xFF;
        int B = (int) (b * 255) & 0xFF;
        return (A << 24) | (R << 16) | (G << 8) | B;
    }
}