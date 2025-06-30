package org.gava.math;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Vector2 implements Comparable<Vector2>, Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    public float x;
    public float y;

    public static final Vector2 Zero = new Vector2(0, 0);

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(float x, float y)      { this.x += x; this.y += y; return this; }
    public Vector2 add(Vector2 v)             { return add(v.x, v.y); }

    public Vector2 sub(float x, float y)      { this.x -= x; this.y -= y; return this; }
    public Vector2 sub(Vector2 v)             { return sub(v.x, v.y); }

    public Vector2 scl(float scalar)          { return scl(scalar, scalar); }
    public Vector2 scl(float x, float y)      { this.x *= x; this.y *= y; return this; }

    @Override public String toString() {
        return "Vector2(" + x + ", " + y + ')';
    }
}
