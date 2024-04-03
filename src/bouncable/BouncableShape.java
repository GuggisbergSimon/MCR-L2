package bouncable;

import singleton.Display;

import java.awt.*;
import java.util.Random;

/**
 * Abstract class for a bouncable shape.
 */
public abstract class BouncableShape implements Bouncable {
    private static final Random RANDOM = new Random();
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 50;
    private static final int MIN_SPEED = 1;
    private static final int MAX_SPEED = 5;
    private final Color color;
    protected int size;
    protected int x;
    protected int y;
    private int dx;
    private int dy;

    /**
     * Creates a new BouncableShape object.
     *
     * @param color the color
     */
    public BouncableShape(Color color) {
        this.x = RANDOM.nextInt(Display.getInstance().getWidth());
        this.y = RANDOM.nextInt(Display.getInstance().getHeight());
        this.size = RANDOM.nextInt(MIN_SIZE, MAX_SIZE);
        this.color = color;
        dx = getRandomSpeed();
        dy = getRandomSpeed();
    }

    /**
     * Get a random speed in ]-maxSpeed, -1] U [1, maxSpeed[
     *
     * @return the random speed
     */
    private static int getRandomSpeed() {
        return RANDOM.nextInt(MIN_SPEED, MAX_SPEED) * (RANDOM.nextBoolean() ? 1 : -1);
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
        //TODO improve bounce as it isn't exactly on window border
        int halfSize = size / 2;
        if (x - halfSize < 0 || x + halfSize > Display.getInstance().getWidth()) {
            dx = -dx;
            x = x - halfSize < 0 ? halfSize : Display.getInstance().getWidth() - halfSize;
        }
        if (y - halfSize < 0 || y + halfSize > Display.getInstance().getHeight()) {
            dy = -dy;
            y = y - halfSize < 0 ? halfSize : Display.getInstance().getHeight() - halfSize;
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
