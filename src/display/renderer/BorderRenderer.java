package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

/**
 * BorderRenderer is a Renderer that draws a Bouncable with its color and shape but only its border.
 */
public class BorderRenderer extends AbstractRenderer {
    final static int STROKE_WIDTH = 2;
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setStroke(new BasicStroke(STROKE_WIDTH));
        super.display(g, b);
    }
}
