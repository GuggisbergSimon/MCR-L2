package display.renderer;

import bouncable.Bouncable;

import java.awt.*;

public class StrokeRenderer extends AbstractRenderer {
    final static int STROKE_WIDTH = 2;
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setStroke(new BasicStroke(STROKE_WIDTH));
        super.display(g, b);
    }
}
