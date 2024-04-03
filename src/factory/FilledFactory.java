package factory;

import bouncable.Circle;
import bouncable.Square;
import bouncable.filled.*;

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
