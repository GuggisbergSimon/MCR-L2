package factory;

import bouncable.Circle;
import bouncable.Square;
import bouncable.border.*;

/**
 * BorderFactory is a ShapeFactory that creates shapes with their border only.
 */
public class BorderFactory implements ShapeFactory {
    @Override
    public Square createSquare() {
        return new SquareBorder();
    }

    @Override
    public Circle createCircle() {
        return new CircleBorder();
    }
}
