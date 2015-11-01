package source.Screens;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class CharacterSelectScreen extends Screen {

    private int location = 1;
    private static int characterChosen = 0;
    private Image scout, rifle, machine, sniper, bulletin;
    private ArrayList<Image> images;
    private int imageWidth, imageWidthGap;

    public CharacterSelectScreen() {
        images = new ArrayList<Image>();
        try {
            images.add(ImageIO.read(new File(getClass().getResource("screenAssets/CorkBoard.png").getPath())));
            images.add(ImageIO.read(new File(getClass().getResource("screenAssets/Scout.png").getPath())));
            images.add(ImageIO.read(new File(getClass().getResource("screenAssets/Rifleman.png").getPath())));
            images.add(ImageIO.read(new File(getClass().getResource("screenAssets/MachineGunner.png").getPath())));
            images.add(ImageIO.read(new File(getClass().getResource("screenAssets/Sniper.png").getPath())));
            imageWidth = images.get(1).getWidth(null);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2, int width, int height) {
        g2.drawImage(images.get(0).getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        g2.fillRect(images.get(location).getWidth(null) * (location - 1), 0, images.get(1).getWidth(null), images.get(1).getHeight(null) + 20);
        g2.drawImage(images.get(1), 0,0,null);
        g2.drawImage(images.get(2),imageWidth,0,null);
        g2.drawImage(images.get(3),imageWidth * 2, 0,null);
        g2.drawImage(images.get(4),imageWidth * 3, 0,null);
    }

//    public void drawCubes(Graphics2D g2) {
//        g2.setColor(new Color(65, 255, 230, 40));
//        switch(location) {
//            case (1) : {
//                g2.fillRoundRect(125, 375, 250, 250, 25, 25);
//                break;
//            }
//            case (2) : {
//                g2.fillRoundRect(425, 375, 250, 250, 25, 25);
//                break;
//            }
//            case (3) : {
//                g2.fillRoundRect(725, 375, 250, 250, 25, 25);
//                break;
//            }
//            case (4) : {
//                g2.fillRoundRect(1025, 375, 250, 250, 25, 25);
//            }
//        }
//        switch(location) {
//            case(1) : {
//                g2.setColor(Color.RED);
//                break;
//            }
//            case (2) : {
//                g2.setColor(Color.GREEN);
//                break;
//            }
//            case (3) : {
//                g2.setColor(Color.BLUE);
//                break;
//            }
//            case (4) : {
//                g2.setColor(Color.YELLOW);
//                break;
//            }
//        }
//        g2.fillRoundRect(700, 100, 50, 50, 25, 25);
//    }

    public void keyPressed(KeyEvent e) {

        if (characterChosen == 0){
            if (e.getKeyCode() == 37) {
                if (location == 1) {
                    location = 4;
                } else {
                    location -= 1;
                }
            } else if (e.getKeyCode() == 39) {
                if (location == 4) {
                    location = 1;
                } else {
                    location += 1;
                }
            } else if (e.getKeyCode() == e.VK_ENTER) {

                characterChosen = 1;

                switch (location) {
                    case (1): {
                        System.out.println("You Selected Scout");
                        break;
                    }
                    case (2): {
                        System.out.println("You selected Rifleman");
                        break;
                    }
                    case (3): {
                        System.out.println("You selected Machine Gunner");
                        break;
                    }
                    case (4): {
                        System.out.println("You selected Sniper");
                        break;
                    }
                }
                ScreenHandler.setScreen(2);
            }
        }


    }
}

