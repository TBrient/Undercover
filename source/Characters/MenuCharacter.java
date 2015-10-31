package source.Characters;

import java.awt.event.KeyEvent;

/**
 * Created by Jack on 10/30/2015.
 */
public class MenuCharacter extends Character {
    public MenuCharacter(int healthPoints, int damage, int fireRate, int speed, int mana) {
        super(healthPoints, damage, fireRate, speed, mana);
    }

    @Override
    public void move(KeyEvent e) {

    }
}
