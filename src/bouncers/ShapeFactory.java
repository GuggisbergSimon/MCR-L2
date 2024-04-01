package bouncers;


public interface ShapeFactory {

    /**
     * Create a square object
     */
    Square createSquare(int x, int y, int size);

    /**
     * Create a Circle object
     */
    Circle createCircle(int x, int y, int speed);

}
