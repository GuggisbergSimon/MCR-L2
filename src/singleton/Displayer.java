package singleton;

import java.awt.*;
import java.awt.event.KeyAdapter;

public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String title);

    void addKeyListener(KeyAdapter ka);
}
