package bouncable.border;

import bouncable.Circle;
import display.Display;
import display.renderer.BorderRenderer;

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
        BorderRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
