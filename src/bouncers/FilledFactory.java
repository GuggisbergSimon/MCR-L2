package bouncers;

public class FilledFactory implements ShapeFactory {
    @Override
    public Square  createSquare(int x, int y, int size) {
       return new SquareFilled(x,y, size);

    }

    @Override
    public Circle createCircle(int x, int y, int size) {
        return new CircleFilled(x, y, size);
    }
}
