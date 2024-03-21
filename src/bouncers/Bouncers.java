package bouncers;

import singleton.Display;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Bouncers {
    private static final Random random = new Random();
    private static final int width = 800;
    private static final int height = 600;
    private LinkedList<Bouncable> bouncers = new LinkedList<>();

    public Bouncers() {
        Display instance = Display.getInstance();
        instance.setWidth(width);
        instance.setHeight(height);

        //TODO factory
        //createShape(10, new Circle());
        //createShape(10, new Square());
    }

    private void createShape(int nb, Bouncable bouncable) {
        for (int i = 0; i < nb; i++) {
            int x = 0;
            int y = 0;
            int size = random.nextInt(50) + 20;
            int dx = random.nextInt(5) + 1;
            int dy = random.nextInt(5) + 1;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            try {
                bouncable = bouncable.getClass().getConstructor(int.class, int.class, int.class, int.class, int.class, Color.class).newInstance(x, y, size, dx, dy, color);
            } catch (Exception e) {
                e.printStackTrace();
            }
            bouncers.add(bouncable);
        }
    }

    public void run() {
    }

    public static void main(String... args) {
        new Bouncers().run();
    }
}