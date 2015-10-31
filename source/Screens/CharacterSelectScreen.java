package source.Screens;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class CharacterSelectScreen extends Screen {

    private int location = 1;
<<<<<<< HEAD
=======
    private static int characterChosen = 0;
    private BufferedImage ScoutImage;
>>>>>>> refs/remotes/origin/master

    public void draw(Graphics2D g2, int width, int height) {
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
        drawCubes(g2);
    }

    public void drawCubes(Graphics2D g2) {
        g2.setColor(new Color(65, 255, 230, 40));
        switch(location) {
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
        switch(location) {
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
                        System.out.println("You Selected Rifleman");
                        break;
                    }
                    case (2): {
                        System.out.println("You selected Sniper");
                        break;
                    }
                    case (3): {
                        System.out.println("You selected Machine Gunner");
                        break;
                    }
                    case (4): {
                        System.out.println("You selected Scout");
                        break;
                    }
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }


            }
            ScreenHandler.setScreen(2);
        }


    }
}

