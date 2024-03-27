package bouncers;

import singleton.Display;

import java.awt.*;

public abstract class BouncableShape implements Bouncable {
    private Color color;
    protected int x;
    protected int y;
    protected int size;

    public BouncableShape(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setColor(color);
        Display.getInstance().getGraphics().draw(getShape());
    }

    @Override
    public void move() {

    }

    @Override
    public Color getColor() {
        return color;
    }
}
