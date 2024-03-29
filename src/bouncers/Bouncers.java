package bouncers;

import singleton.Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

public class Bouncers {
    private static final Random random = new Random();
    private static final String title = "Bouncers";
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();
    private Timer timer;

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
                        break;
                    }
                    case 'b': {
                        // TODO générer 10 cercles et 10 carrés avec bordure
                        break;
                    }
                    case 'f': {
                        // TODO  générer 10 cercles et 10 carrés pleins
                        break;
                    }
                    case 'q': {
                        timer.stop();
                        instance.close();
                        break;
                    }
                }
            }
        };
        instance.addKeyListener(keyAdapter);

        //TODO in Square/Circle/Filled/Stroke override getColor with defined ones as seen below
        //TODO factory
        int width = 800;
        int height = 600;
        for (int i = 0; i < 10; i++) {
            bouncers.add(new SquareFilled(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.ORANGE));
            bouncers.add(new CircleFilled(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.BLUE));
            bouncers.add(new SquareStroke(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.RED));
            bouncers.add(new CircleStroke(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.GREEN));
        }
    }

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

    public static void main(String... args) {
        new Bouncers().run();
    }
}