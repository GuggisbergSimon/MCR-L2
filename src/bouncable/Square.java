package bouncable;

import java.awt.*;
import java.awt.geom.*;

/**
 * Square is a BouncableShape that is drawn as a square.
 */
public abstract class Square extends BouncableShape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(x, y, size, size);
    }
}
