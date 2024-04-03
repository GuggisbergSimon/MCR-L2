package bouncable;

import bouncable.BouncableShape;

import java.awt.*;
import java.awt.geom.*;

public abstract class Square extends BouncableShape {

    public Square(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(x, y, size, size);
    }
}
