package source.Screens;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Jack on 10/30/2015.
 * The base that all screens in the game should be modeled on.
 */
public abstract class Screen {
    public abstract void draw(Graphics2D g2, int width, int height);

    public abstract void keyPressed(KeyEvent e);
}
