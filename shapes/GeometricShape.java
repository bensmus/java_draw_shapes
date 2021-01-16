package shapes;

import java.util.*;
import java.awt.Graphics2D;

public abstract class GeometricShape {
    protected int[] center;
    protected String type;

    public GeometricShape(int[] center, String type) {
        this.center = center;
        this.type = type;
    }

    public void moveTo(int[] new_center) {
        this.center = new_center;
    }

    public String toString() {
        return this.type + Arrays.toString(this.center);
    }

    // Graphics is a class from java.awt (Abstract Window Toolkit)
    abstract public void draw(Graphics2D g2d);
}