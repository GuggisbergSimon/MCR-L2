package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

/**
 * BorderRenderer is a Singleton Renderer that draws a Bouncable with its color and shape but only its border.
 */
public class BorderRenderer extends AbstractRenderer {
    private static Renderer instance;
    final static int STROKE_WIDTH = 2;

    /**
     * Returns the instance of BorderRenderer.
     *
     * @return the instance of BorderRenderer
     */
    public static Renderer getInstance() {
        if (instance == null)
            instance = new BorderRenderer();
        return instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setStroke(new BasicStroke(STROKE_WIDTH));
        super.display(g, b);
    }
}
