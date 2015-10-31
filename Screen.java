import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener {
    private Timer timer;
    private Graphics2D g2;
    private static int i;


    public Screen(int i){
        this.i = i;
    }

    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        timer = new Timer(1000 / 60, this);
        timer.start();
        super.paintComponent(g);

        if (i == 1){
            MainScreen mainScreen = new MainScreen();
            mainScreen.drawTitle(g2);
        } else {

            CharacterSelectScreen CharSelect = new CharacterSelectScreen();
            CharSelect.drawClasses(g2);
        }
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

}