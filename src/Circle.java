import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        this(0, 0, 0, 0, 0, Color.BLACK);
    }

    public Circle(int x, int y, int radius, int dx, int dy, Color color) {
        super(x, y, radius * 2, radius * 2, dx, dy, color);
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        g2d.fillOval(x, y, width, height);
    }
}