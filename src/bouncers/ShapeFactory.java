package bouncers;


public interface ShapeFactory {

    Square createSquare(int x, int y, int size);

    Circle createCircle(int x, int y, int speed);

}
