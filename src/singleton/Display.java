package singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

public class Display implements Displayer {
    private static Display instance;
    private final JFrame frame;
    private final JPanel panel;
    private final ArrayList<Shape> shapes = new ArrayList<>();
    private int width = 800;
    private int height = 600;
    private final Image image;
    private Graphics2D g2d;

    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }

    private Display() {
        super();
        frame = new JFrame();
        panel = new JPanel();

        frame.add(panel);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                width = frame.getContentPane().getWidth();
                height = frame.getContentPane().getHeight();
                g2d = (Graphics2D) panel.getGraphics();
            }
        });

        panel.setLayout(new BorderLayout());
        image = panel.createImage(width, height);
        g2d = (Graphics2D) panel.getGraphics();
    }

    public void setWidth(int width) {
        this.width = width;
        frame.setSize(width, height);
        panel.setPreferredSize(new Dimension(width, height));
        g2d = (Graphics2D) panel.getGraphics();
    }

    public void setHeight(int height) {
        this.height = height;
        frame.setSize(width, height);
        panel.setPreferredSize(new Dimension(width, height));
        g2d = (Graphics2D) panel.getGraphics();
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
        return g2d;
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(image, 0, 0, null);
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
