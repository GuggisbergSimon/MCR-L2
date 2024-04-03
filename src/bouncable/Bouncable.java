package bouncable;

import java.awt.*;

/**
 * Interface for the Bouncable class.
 */
public interface Bouncable {
    /**
     * Draw the object.
     */
    void draw();

    /**
     * Move the object.
     */
    void move();

    /**
     * Get the color of the object.
     *
     * @return the color
     */
    Color getColor();

    /**
     * Get the shape of the object.
     *
     * @return the shape
     */
    Shape getShape();
}