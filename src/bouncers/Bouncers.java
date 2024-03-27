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
    private static final int width = 800;
    private static final int height = 600;
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();

    public Bouncers() {
        Display instance = Display.getInstance();
        instance.setWidth(width);
        instance.setHeight(height);

        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyChar()) {
                    case 'e' : {
                        // TODO effacer l'affichage
                    }
                    case 'b' : {
                        // TODO générer 10 cercles et 10 carrés avec bordure
                    }
                    case 'f' : {
                        // TODO  générer 10 cercles et 10 carrés pleins
                    }
                    case 'q' : {
                        // TODO quitter le programme
                    }
                }
            }
        };

        //TODO factory
        for (int i = 0; i < 10; i++) {
            bouncers.add(new CircleFilled(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.RED));
            bouncers.add(new CircleStroke(random.nextInt(width), random.nextInt(height), random.nextInt(50), Color.BLUE));
        }
    }

    public void run() {
        Timer timer = new Timer(30, e -> {
            for (Bouncable b : bouncers) {
                b.move();
            }
            Display.getInstance().repaint();
        });
        timer.start();
    }

    public static void main(String... args) {
        new Bouncers().run();
    }
}