package source.Screens;

import source.Threads.localThreadPool;

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
    private Image titleScreenImage, pressSpaceImage;
    private int titleAlphaFilterLevel = 0;
    private boolean titleAlphaIncreasing = true;

    public TitleScreen() {
        try {
            /*
            Loading on the main thread is a bad idea and therefore this should be deprecated
            */
            URL imageURL = getClass().getResource("screenAssets/Undercover-Start-Screen.png");
            titleScreenImage = ImageIO.read(new File(imageURL.getPath()));
            URL spaceImageUrl = getClass().getResource("screenAssets/TitlePressSpace.png");
            pressSpaceImage = ImageIO.read(new File(spaceImageUrl.getPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int width, int height) {
        g2.drawImage(titleScreenImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        g2.setColor(new Color(0,0,0, titleAlphaFilterLevel));
        g2.fillRect(0, 0, width, height);
        g2.drawImage(pressSpaceImage, (width / 2) - pressSpaceImage.getWidth(null) / 2, (height / 3) * 2, null);

        if(titleAlphaFilterLevel >= 200) {
            titleAlphaIncreasing = false;
        }
        else if(titleAlphaFilterLevel <= 0) {
            titleAlphaIncreasing = true;
        }

        //Changing the alpha filter.
        if(titleAlphaIncreasing) {
            titleAlphaFilterLevel += 5;}
        else {
            titleAlphaFilterLevel -= 5;}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            ScreenHandler.setScreen(1);
        }
    }

}

