package bouncable.filled;

import bouncable.Circle;
import display.Display;
import display.renderer.FilledRenderer;

import java.awt.*;

/**
 * CircleFilled is a Circle that is drawn filled with blue.
 */
public class CircleFilled extends Circle {
    public CircleFilled() {
        super(Color.BLUE);
    }

    @Override
    public void draw() {
        FilledRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
