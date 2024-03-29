package bouncers;

import singleton.Display;

import java.awt.*;
import java.util.Random;

public abstract class BouncableShape implements Bouncable {
    private static final Random random = new Random();
    private static final int maxSpeed = 5;
    private final Color color;
    protected int x;
    protected int y;
    private int dx;
    private int dy;
    protected int size;

    public BouncableShape(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        dx = random.nextInt(-maxSpeed, maxSpeed);
        dy = random.nextInt(-maxSpeed, maxSpeed);
    }

    @Override
    public void draw() {
        Display.getInstance().getGraphics().setColor(color);
        Display.getInstance().getGraphics().draw(getShape());
    }

    @Override
    public void move() {
        x += dx;
        y += dy;
        //TODO fix bouncing as it is inaccurate
        int halfSize = size / 2;
        if (x - halfSize < 0 || x + halfSize > Display.getInstance().getWidth()) {
            dx = -dx;
        }
        if (y - halfSize < 0 || y + halfSize > Display.getInstance().getHeight()) {
            dy = -dy;
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
