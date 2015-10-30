import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener {

    private Timer timer;
    private Graphics2D g2;


    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        timer = new Timer(1000 / 60, this);
        timer.start();
        super.paintComponent(g);
        CharacterSelectScreen CharSelect = new CharacterSelectScreen();
        CharSelect.drawClasses(g2);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

}