package bouncers;

import singleton.Display;

import java.awt.*;

public class CircleFilled extends Circle {
    public CircleFilled(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fill(getShape());
    }
}
