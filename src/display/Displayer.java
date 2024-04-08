package display;

import java.awt.*;
import java.awt.event.KeyAdapter;


/**
 * Displayer is the interface for interacting with a display.
 */
public interface Displayer {
    /**
     * Get the width
     * @return the width
     */
    int getWidth();

    /**
     * Get the height
     * @return the height
     */
    int getHeight();

    /**
     * Get the graphics
     * @return the graphics2D
     */
    Graphics2D getGraphics();

    /**
     * Repaint the display
     */
    void repaint();

    /**
     * Set the title of the display
     * @param title the title
     */
    void setTitle(String title);

    /**
     * Add a key listener
     * @param ka the key adapter
     */
    void addKeyListener(KeyAdapter ka);
}
