import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.*;
import java.lang.reflect.Array;

/**
 * Created by tyler_brient on 10/29/15.
 */
public class Begin {
    private static int Location = 1;
    private static Character character;
    private static int enter;
    private static int characterChosen = 0;
    public static void Start() {


        JFrame window = new JFrame("Selection Screen");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 1400, 800);



        Screen screen = new Screen(1);
        window.add(screen);
        window.setVisible(true);


        window.addKeyListener(new KeyAdapter() {
            @Override

            public void keyPressed(KeyEvent keyEvent) {



                if (keyEvent.getKeyCode() == 37) {
                    if (characterChosen == 0) {
                        if (Location == 1) {
                            Location = 4;
                        } else {
                            Location -= 1;
                        }
                    }
                } else if (keyEvent.getKeyCode() == 39) {
                    if (characterChosen == 0) {
                        if (Location == 4) {
                            Location = 1;
                        } else {
                            Location += 1;
                        }
                    }
                } else if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {



                    if (enter == 1) {
                        switch (Location) {
                            case (1): {
                                System.out.println("You Selected Rifleman");
                                character = new Character(1);
                                characterChosen = 1;
                                break;
                            }
                            case (2): {
                                System.out.println("You selected Sniper");
                                character = new Character(2);
                                characterChosen = 1;
                                break;
                            }
                            case (3): {
                                System.out.println("You selected Machine Gunner");
                                character = new Character(3);
                                characterChosen = 1;
                                break;
                            }
                            case (4): {
                                System.out.println("You selected Scout");
                                character = new Character(4);
                                characterChosen = 1;
                                break;

                            }
                        }
                    } else if (enter == 0) {
                        enter = 1;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Screen screen1 = new Screen(2);

                    }
                } else if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (enter == 1) {
                        switch (Location) {
                            case (1): {
                                System.out.println("You Selected Rifleman");
                                character = new Character(1);
                                characterChosen = 1;
                                break;
                            }
                            case (2): {
                                System.out.println("You selected Sniper");
                                character = new Character(2);
                                characterChosen = 1;
                                break;
                            }
                            case (3): {
                                System.out.println("You selected Machine Gunner");
                                character = new Character(3);
                                characterChosen = 1;
                                break;
                            }
                            case (4): {
                                System.out.println("You selected Scout");
                                character = new Character(4);
                                characterChosen = 1;
                                break;

                            }
                        }
                    } else if (enter == 0) {
                        enter = 1;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Screen screen1 = new Screen(2);

                    }
                }
            }

        });
    }

    public int getLocation() {
        return Location;
    }

    public Character getCharacter(){
        return character;
    }
}
