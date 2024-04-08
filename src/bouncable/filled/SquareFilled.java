package bouncable.filled;

import bouncable.Square;
import display.Display;

import java.awt.*;


/**
 * SquareFilled is a Square that is drawn filled with orange.

 */
public class SquareFilled extends Square {
    public SquareFilled() {
        super( Color.ORANGE);
    }

    @Override
    public void draw() {
        Display.getInstance().getFilledRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
