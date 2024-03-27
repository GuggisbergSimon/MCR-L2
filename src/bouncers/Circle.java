package bouncers;

import java.awt.*;
import java.awt.geom.*;

public abstract class Circle extends BouncableShape {

    public Circle(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }
}