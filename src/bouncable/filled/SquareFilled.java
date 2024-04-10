package bouncable.filled;

import bouncable.Square;
import display.Display;
import display.renderer.FilledRenderer;

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
        FilledRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
