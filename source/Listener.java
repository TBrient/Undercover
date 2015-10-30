package source;

import source.Screens.Screen;
import source.Screens.ScreenHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Jack on 10/30/2015.
 */
public class Listener implements KeyListener {

    private Screen screen;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        ScreenHandler.getScreen().keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
