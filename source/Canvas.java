package source;

import source.Screens.CharacterSelectScreen;
import source.Screens.ScreenHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 10/30/2015.
 */
public class Canvas extends JPanel implements ActionListener{

    private CharacterSelectScreen CharSelect = new CharacterSelectScreen();

    public Canvas() {
        Timer timer = new Timer(1000 / 60, this);
        timer.start();
        ScreenHandler.setScreen(CharSelect);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        //All drawing done here.
        CharSelect.drawClasses(g2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
