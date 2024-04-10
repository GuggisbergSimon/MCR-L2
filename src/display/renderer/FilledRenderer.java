package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

/**
 * FilledRenderer is a Singleton Renderer that draws a Bouncable filled with its color and shape.
 */
public class FilledRenderer extends AbstractRenderer {
    private static Renderer instance;

    /**
     * Returns the instance of FilledRenderer.
     *
     * @return the instance of FilledRenderer
     */
    public static Renderer getInstance() {
        if (instance == null)
            instance = new FilledRenderer();
        return instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g, b);
        g.fill(b.getShape());
    }
}
