package bouncable;

import java.awt.*;
import java.awt.geom.*;

public abstract class Circle extends BouncableShape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }
}