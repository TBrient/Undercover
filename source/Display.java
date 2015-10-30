package source;

import javax.swing.*;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class Display {
    public static void main(String args[]) {
        JFrame window = new JFrame("Selection source.Screens.Screen");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 1400, 800);
        Canvas screen = new Canvas();
        window.add(screen);
        window.addKeyListener(new Listener());
        window.setVisible(true);
    }
}
