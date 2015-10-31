package source.Threads;

import source.Canvas;
import source.Screens.ScreenHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 10/31/2015.
 */
public class GraphicsThread extends Thread {

    private ScreenHandler screenHandler;
    private Canvas canvas;

    public GraphicsThread(ScreenHandler screenHandler) {
        this.screenHandler = screenHandler;
        canvas = new Canvas(screenHandler);
    }

    public void run() {
        Timer timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.repaint();
            }
        });
        timer.start();
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
