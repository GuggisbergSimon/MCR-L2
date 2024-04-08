package bouncable.stroke;

import bouncable.Circle;
import display.Display;

import java.awt.*;

public class CircleStroke extends Circle {
    public CircleStroke() {
        super(Color.GREEN);
    }

    @Override
    public void draw() {
        Display.getInstance().getStrokeRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
