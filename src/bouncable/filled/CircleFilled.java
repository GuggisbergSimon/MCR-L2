package bouncable.filled;

import bouncable.Circle;
import singleton.Display;

import java.awt.*;

public class CircleFilled extends Circle {
    public CircleFilled() {
        super(Color.BLUE);
    }

    @Override
    public void draw() {
        super.draw();
        Display.getInstance().getGraphics().fill(getShape());
    }
}
