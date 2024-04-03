package bouncable.filled;

import bouncable.Square;
import singleton.Display;

import java.awt.*;

public class SquareFilled extends Square {
    public SquareFilled(int x, int y, int size) {
        super(x, y, size,  Color.ORANGE);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fill(getShape());
    }
}
