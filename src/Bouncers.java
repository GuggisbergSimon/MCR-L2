/**
 * @author Simon Guggisberg
 * @author Patrick Furrer
 * @version 1.0
 * @description Application that creates a window and draws shapes that bounce around in it.
 * @since 2024-03-21
 */

//TODO do uml

import bouncable.Bouncable;
import factory.*;
import display.Display;
import factory.BorderFactory;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Main class for the Bouncers program.
 */
public class Bouncers {
    private static final String TITLE = "Bouncers";
    private static final int NB_SPAWN = 10;
    private static final int REFRESH_MS = 10;
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();
    private Timer timer;

    /**
     * Creates a new Bouncers object.
     */
    public Bouncers() {
        Display instance = Display.getInstance();
        instance.setTitle(TITLE);

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
                        generateShapes(new BorderFactory());
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

    /**
     * Generates circles and squares and adds them to the list of bouncers.
     *
     * @param factory the factory to use
     */
    private void generateShapes(ShapeFactory factory) {
        for (int i = 0; i < NB_SPAWN; ++i) {
            bouncers.add(factory.createSquare());
            bouncers.add(factory.createCircle());
        }
    }

    /**
     * Creates a timer and starts it.
     */
    public void run() {
        timer = new Timer(REFRESH_MS, e -> {
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