package singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;

/**
 * Singleton class for the Display.
 */
public class Display implements Displayer {
    private static Display instance;
    private final JFrame frame;
    private final JPanel panel;
    private static final int init_width = 800;
    private static final int init_height = 600;
    private int width;
    private int height;
    private Image image;
    private Graphics2D g2d;

    /**
     * Get the instance of the Display
     *
     * @return the instance
     */
    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }

    /**
     * Creates a new Display object.
     */
    private Display() {
        this(init_width, init_height);
    }

    /**
     * Creates a new Display object.
     *
     * @param width  the width
     * @param height the height
     */
    private Display(int width, int height) {
        super();
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setSize(frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
            }
        });

        panel.setLayout(new BorderLayout());
        frame.setSize(width, height);
        setSize(width, height);
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
    public void addKeyListener(KeyAdapter keyAdapter) {
        frame.addKeyListener(keyAdapter);
    }

    /**
     * Close the display
     */
    public void close() {
        frame.dispose();
    }

    /**
     * Set the size of the display
     *
     * @param width  the width
     * @param height the height
     */
    private void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        panel.setSize(width, height);
        if (image != null) {
            image.flush();
        }
        image = panel.createImage(width, height);
        g2d = (Graphics2D) image.getGraphics();
    }

    @Override
    public Graphics2D getGraphics() {
        return g2d;
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(image, 0, 0, null);
        image.getGraphics().clearRect(0, 0, width, height);
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
