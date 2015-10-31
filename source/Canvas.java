package source;

import source.Screens.ScreenHandler;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jack on 10/30/2015.
 */
public class Canvas extends JPanel {

    private ScreenHandler screenHandler;

    public Canvas(ScreenHandler screenHandler) {
        this.screenHandler = screenHandler;
        screenHandler.setScreen(0);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        //All drawing done here.
        screenHandler.getCurrentScreen().draw(g2, getWidth(), getHeight());
    }
}
