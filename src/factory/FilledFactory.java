package factory;

import bouncable.Circle;
import bouncable.Square;
import bouncable.filled.*;

/**
 * FilledFactory is a ShapeFactory that creates filled shapes.
 */
public class FilledFactory implements ShapeFactory {
    @Override
    public Square createSquare() {
        return new SquareFilled();
    }

    @Override
    public Circle createCircle() {
        return new CircleFilled();
    }
}
