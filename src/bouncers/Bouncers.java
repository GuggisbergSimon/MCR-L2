/**
 * @author Simon Guggisberg
 * @author Patrick Furrer
 * @version 1.0
 * @since 2024-03-21
 */

package bouncers;

import singleton.Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

/**
 * Main class for the Bouncers program.
 */
public class Bouncers {
    private static final Random random = new Random();
    private static final String title = "Bouncers";
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();
    private Timer timer;

    /**
     * Creates a new Bouncers object.
     */
    public Bouncers() {
        Display instance = Display.getInstance();
        instance.setTitle(title);

        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyChar()) {
                    case 'e': {
                        bouncers.clear();
                    }
                    break;
                    case 'b': {
                        generateShapes(new StrokeFactory());
                    }
                    break;
                    case 'f': {
                        generateShapes(new FilledFactory());
                    }
                    break;
                    case 'q': {
                        timer.stop();
                        instance.close();
                        break;
                    }
                }
            }
        };
        instance.addKeyListener(keyAdapter);

    }

    private void generateShapes(ShapeFactory factory) {
        int width = 800;
        int height = 600;
        for(int i = 0; i < 10;++i) {
            bouncers.add(factory.createSquare(random.nextInt(width), random.nextInt(height), random.nextInt(50)));
            bouncers.add(factory.createCircle(random.nextInt(width), random.nextInt(height), random.nextInt(50)));
        }
    }

    /**
     * Creates a timer and starts it.
     */
    public void run() {
        timer = new Timer(10, e -> {
            for (Bouncable b : bouncers) {
                b.move();
                b.draw();
            }
            Display.getInstance().repaint();
        });
        timer.start();
    }

    /**
     * Main method.
     *
     * @param args command line arguments
     */
    public static void main(String... args) {
        new Bouncers().run();
    }
}