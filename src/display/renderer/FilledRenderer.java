package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

/**
 * FilledRenderer is a Renderer that draws a Bouncable filled with its color and shape.
 */
public class FilledRenderer extends AbstractRenderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g, b);
        g.fill(b.getShape());
    }
}
