package bouncers;

import singleton.Display;

import java.awt.*;

public class CircleStroke extends Circle {
    public CircleStroke(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setStroke(new BasicStroke(2));
        super.draw();
    }
}
