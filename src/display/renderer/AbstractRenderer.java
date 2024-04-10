package display.renderer;

import bouncable.Bouncable;
import display.Display;

import java.awt.*;

/**
 * AbstractRenderer is a Renderer that draws a Bouncable with its color and shape.
 */
public abstract class AbstractRenderer implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
