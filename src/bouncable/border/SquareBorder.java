package bouncable.border;

import bouncable.Square;
import display.Display;
import display.renderer.BorderRenderer;

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
        BorderRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
