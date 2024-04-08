package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

public class AbstractRenderer implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
