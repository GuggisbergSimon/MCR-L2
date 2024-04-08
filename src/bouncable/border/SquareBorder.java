package bouncable.border;

import bouncable.Square;
import display.Display;

import java.awt.*;

/**
 * SquareBorder is a Square that is drawn with a red border only.
 */
public class SquareBorder extends Square {
    public SquareBorder() {
        super(Color.RED);
    }

    @Override
    public void draw() {
        Display.getInstance().getBorderRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
