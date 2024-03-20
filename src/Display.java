import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Display implements Displayer {
    private static final Random random = new Random();
    private static Display instance;
    private final JFrame frame;
    private final JPanel panel;
    private final ArrayList<Shape> shapes = new ArrayList<>();
    private int width = 800;
    private int height = 600;

    private Display() {
        frame = new JFrame();
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                for (Shape shape : shapes) {
                    shape.draw(g2d);
                }
            }
        };

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bouncers");
        frame.pack();
        frame.setVisible(true);
    }

    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }

    public void createShape(int nb, Shape shape) {
        for (int i = 0; i < nb; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int size = random.nextInt(50) + 20;
            int dx = random.nextInt(5) + 1;
            int dy = random.nextInt(5) + 1;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            try {
                shape = shape.getClass().getConstructor(int.class, int.class, int.class, int.class, int.class, Color.class).newInstance(x, y, size, dx, dy, color);
            } catch (Exception e) {
                e.printStackTrace();
            }
            shapes.add(shape);
        }
    }

    public void moveShapes() {
        Timer timer = new Timer(30, e -> {
            for (Shape shape : shapes) {
                shape.move(width, height);
            }
            panel.repaint();
        });
        timer.start();
    }

    public void setWidth(int width) {
        this.width = width;
        frame.setSize(width, height);
    }

    public void setHeight(int height) {
        this.height = height;
        frame.setSize(width, height);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
