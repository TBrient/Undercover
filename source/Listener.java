package source;

import source.Screens.ScreenHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Jack on 10/30/2015.
 */
public class Listener implements KeyListener {

    private ScreenHandler screenHandler;

    public Listener(ScreenHandler screenHandler) {
        this.screenHandler = screenHandler;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        screenHandler.getCurrentScreen().keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
