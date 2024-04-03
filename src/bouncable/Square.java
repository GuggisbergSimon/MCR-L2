package bouncable;

import bouncable.BouncableShape;

import java.awt.*;
import java.awt.geom.*;

public abstract class Square extends BouncableShape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(x, y, size, size);
    }
}
