package bouncable.stroke;

import bouncable.Circle;
import singleton.Display;

import java.awt.*;

public class CircleStroke extends Circle {
    public CircleStroke() {
        super(Color.GREEN);
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setStroke(new BasicStroke(2));
        super.draw();
    }
}
