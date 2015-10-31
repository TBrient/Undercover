package source;

import source.Screens.CharacterSelectScreen;
import source.Screens.ScreenHandler;
import source.Screens.TitleScreen;
import source.Threads.AudioThread;
import source.Threads.GraphicsThread;

import javax.swing.*;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class Display {
    public static void main(String args[]) {
        JFrame window = new JFrame("Undercover");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 1400, 800);

        ScreenHandler screenHandler = new ScreenHandler();
        screenHandler.addScreen(new TitleScreen());
        screenHandler.addScreen(new CharacterSelectScreen());

        GraphicsThread graphicsThread = new GraphicsThread(screenHandler);
        AudioThread audioThread = new AudioThread();

        window.add(graphicsThread.getCanvas());
        window.addKeyListener(new Listener(screenHandler));
        window.setVisible(true);

        graphicsThread.run();
        audioThread.run();
    }
}
