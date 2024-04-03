package factory;

import bouncable.Circle;
import bouncable.Square;

public interface ShapeFactory {
    /**
     * Create a square object
     */
    Square createSquare();

    /**
     * Create a Circle object
     */
    Circle createCircle();
}
