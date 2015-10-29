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
        g2.setColor(new Color(125, 94, 38));
        g2.fillRect(0, 0, 1400, 800);
        g2.setColor(Color.RED);
        g2.fillRoundRect(150, 400, 200, 200, 25, 25);
        g2.setColor(Color.GREEN);
        g2.fillRoundRect(450, 400, 200, 200, 25, 25);
        g2.setColor(Color.BLUE);
        g2.fillRoundRect(750, 400, 200, 200, 25, 25);
        g2.setColor(Color.YELLOW);
        g2.fillRoundRect(1050, 400, 200, 200, 25, 25);
        drawSelect(g2);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

    public void drawSelect(Graphics2D g2) {
        g2.setColor(new Color(65, 255, 230, 40));
        Main main = new Main();
        int Location = main.getLocation();
        if (Location == 1)     {
            g2.fillRoundRect(125, 375, 250, 250, 25, 25);
        } else if (Location == 2) {
            g2.fillRoundRect(425, 375, 250, 250, 25, 25);
        } else if (Location == 3) {
            g2.fillRoundRect(725, 375, 250, 250, 25, 25);
        } else if (Location == 4) {
            g2.fillRoundRect(1025, 375, 250, 250, 25, 25);
        } else{
            System.out.println("Oh Shit");
        }
    }
}