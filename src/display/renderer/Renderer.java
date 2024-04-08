package display.renderer;

import java.awt.*;

import bouncable.Bouncable;

/**
 * Renderer is an interface that defines how to display a bouncable object on the screen
 */
public interface Renderer {
    /**
     * Display the bouncable object on the screen
     *
     * @param g the graphics object
     * @param b the bouncable object
     */
    void display(Graphics2D g, Bouncable b);
}