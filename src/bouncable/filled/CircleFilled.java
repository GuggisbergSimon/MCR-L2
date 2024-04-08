package bouncable.filled;

import bouncable.Circle;
import display.Display;

import java.awt.*;

public class CircleFilled extends Circle {
    public CircleFilled() {
        super(Color.BLUE);
    }

    @Override
    public void draw() {
        Display.getInstance().getFilledRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
