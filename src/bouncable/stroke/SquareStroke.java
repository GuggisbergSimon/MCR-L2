package bouncable.stroke;

import bouncable.Square;
import singleton.Display;

import java.awt.*;

public class SquareStroke extends Square {
    public SquareStroke() {
        super(Color.RED);
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setStroke(new BasicStroke(2));
        super.draw();
    }
}
