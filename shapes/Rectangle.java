package shapes;

import java.awt.Graphics2D;

public class Rectangle extends GeometricShape {
    private int width;
    private int height;

    public Rectangle(int width, int height, int[] center) {
        super(center, "rectangle");
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2d) {
        int left = this.center[0] - this.width / 2;
        int top = this.center[1] - this.height / 2;
        int right = left + this.width;
        int bot = top + this.height;

        // draw four lines
        // drawLine(x1, y1, x2, y2)

        // 1. Top line
        g2d.drawLine(left, top, right, top);

        // 2. Right line
        g2d.drawLine(right, top, right, bot);

        // 3. Bot line
        g2d.drawLine(right, bot, left, bot);

        // 4. Left line
        g2d.drawLine(left, bot, left, top);
    }
}
