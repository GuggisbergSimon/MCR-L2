package bouncers;

import singleton.Display;

import java.awt.*;

public class SquareFilled extends Square {
    public SquareFilled(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fill(getShape());
    }
}
