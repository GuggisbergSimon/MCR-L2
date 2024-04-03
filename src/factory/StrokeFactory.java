package factory;

import bouncable.Circle;
import bouncable.Square;
import bouncable.stroke.*;

public class StrokeFactory implements ShapeFactory {
    @Override
    public Square createSquare() {
        return new SquareStroke();
    }

    @Override
    public Circle createCircle() {
        return new CircleStroke();
    }
}
