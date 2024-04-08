package bouncable.border;

import bouncable.Circle;
import display.Display;

import java.awt.*;

/**
 * CircleBorder is a Circle that is drawn with a green border only.
 */
public class CircleBorder extends Circle {
    public CircleBorder() {
        super(Color.GREEN);
    }

    @Override
    public void draw() {
        Display.getInstance().getBorderRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
