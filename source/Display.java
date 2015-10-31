package source;

import source.Screens.CharacterSelectScreen;
import source.Screens.ScreenHandler;
import source.Screens.TitleScreen;

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
        window.add(new Canvas(screenHandler));
        window.addKeyListener(new Listener(screenHandler));
        window.setVisible(true);
    }
}
