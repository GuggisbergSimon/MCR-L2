package display.renderer;

import java.awt.*;

import bouncable.Bouncable;

public interface Renderer {
    void display(Graphics2D g, Bouncable b);
}