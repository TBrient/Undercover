package source.Screens;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Jack on 10/30/2015.
 */
public class TitleScreen extends Screen {
    private Image titleScreenImage;
    private int alphaFilterLevel = 0;
    private boolean alphaIncreasing = true;

    public TitleScreen() {
        try {
            URL imageURL = getClass().getResource("screenAssets/Undercover-Start-Screen.png");
            titleScreenImage = ImageIO.read(new File(imageURL.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int width, int height) {
        g2.drawImage(titleScreenImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        g2.setColor(new Color(0,0,0,alphaFilterLevel));
        g2.fillRect(0, 0, width, height);
        if(alphaFilterLevel >= 200) {
            alphaIncreasing = false;
        }
        else if(alphaFilterLevel <= 0) {
            alphaIncreasing = true;
        }

        //Changing the alpha filter.
        if(alphaIncreasing) {alphaFilterLevel += 3;}
        else {alphaFilterLevel -= 3;}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ScreenHandler.setScreen(1);
    }
}
