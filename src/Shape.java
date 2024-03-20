import java.awt.*;

public class Shape {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    private int dx;
    private int dy;
    private final Color color;

    public Shape() {
        this(0, 0, 0, 0, 0, 0, Color.BLACK);
    }

    public Shape(int x, int y, int width, int height, int dx, int dy, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dx = dx;
        this.dy = dy;
        this.color = color;
    }

    public void move(int maxWidth, int maxHeight) {
        x += dx;
        y += dy;

        if (x <= 0 || x >= maxWidth - width) {
            dx = -dx;
        }
        if (y <= 0 || y >= maxHeight - height) {
            dy = -dy;
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);}
}
