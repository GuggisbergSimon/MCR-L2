package bouncable.stroke;

import bouncable.Square;
import display.Display;

import java.awt.*;

public class SquareStroke extends Square {
    public SquareStroke() {
        super(Color.RED);
    }

    @Override
    public void draw() {
        Display.getInstance().getStrokeRenderer().display(Display.getInstance().getGraphics(), this);
    }
}
