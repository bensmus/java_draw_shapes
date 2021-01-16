// This is based on
// https://zetcode.com/gfx/java2d/introduction/

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

import shapes.GeometricShape;
import shapes.Rectangle;

class Surface extends JPanel {

    private GeometricShape myShape;

    public Surface(GeometricShape myShape) {
        this.myShape = myShape;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.myShape.draw((Graphics2D) g);
    }
}

public class DrawShapes extends JFrame {

    public DrawShapes() {
        int[] center = { 100, 100 };
        Rectangle myRectangle = new Rectangle(10, 10, center);
        this.add(new Surface(myRectangle));

        this.setTitle("Drawing Shapes");
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                DrawShapes t = new DrawShapes();
                t.setVisible(true);
            }
        });
    }
}
