package bouncers;

public class StrokeFactory implements ShapeFactory {
    @Override
    public Square createSquare(int x, int y, int size) {
        return new SquareStroke(x, y, size);
    }

    @Override
    public Circle createCircle(int x, int y, int size) {
        return new CircleStroke(x, y, size);
    }
}
