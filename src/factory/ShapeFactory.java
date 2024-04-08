package factory;

import bouncable.Circle;
import bouncable.Square;

/**
 * Interface for a shape factory.
 */
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
