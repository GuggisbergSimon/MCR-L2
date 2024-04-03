package bouncable.stroke;

import bouncable.Square;
import singleton.Display;

import java.awt.*;

public class SquareStroke extends Square {
    public SquareStroke(int x, int y, int size) {
        super(x, y, size, Color.RED);
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setStroke(new BasicStroke(2));
        super.draw();
    }
}
