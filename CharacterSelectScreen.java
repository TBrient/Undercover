import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class CharacterSelectScreen extends JPanel {
    private BufferedImage ScoutImage;
    public void drawClasses(Graphics2D g2) {
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
    public void drawSelect(Graphics2D g2) {
        g2.setColor(new Color(65, 255, 230, 40));
        Begin main = new Begin();
        int Location = main.getLocation();
        switch(Location) {
            case (1) : {
                g2.fillRoundRect(125, 375, 250, 250, 25, 25);
                break;
            }
            case (2) : {
                g2.fillRoundRect(425, 375, 250, 250, 25, 25);
                break;
            }
            case (3) : {
                g2.fillRoundRect(725, 375, 250, 250, 25, 25);
                break;
            }
            case (4) : {
                g2.fillRoundRect(1025, 375, 250, 250, 25, 25);
            }
        }
        switch(Location) {
            case(1) : {
                g2.setColor(Color.RED);
                break;
            }
            case (2) : {
                g2.setColor(Color.GREEN);
                break;
            }
            case (3) : {
                g2.setColor(Color.BLUE);
                break;
            }
            case (4) : {
                g2.setColor(Color.YELLOW);
                break;
            }
        }
        g2.fillRoundRect(700, 100, 50, 50, 25, 25);
    }
}

