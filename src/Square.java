import java.awt.*;

public class Square extends Shape {

    public Square() {
        this(0, 0, 0, 0, 0, Color.BLACK);
    }
    public Square(int x, int y, int length, int dx, int dy, Color color) {
        super(x, y, length, length, dx, dy, color);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fillRect(x, y, width, height);
    }
}
