package bouncable.filled;

import bouncable.Square;
import singleton.Display;

import java.awt.*;

public class SquareFilled extends Square {
    public SquareFilled() {
        super( Color.ORANGE);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fill(getShape());
    }
}
