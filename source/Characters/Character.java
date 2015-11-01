package source.Characters;

import java.awt.event.KeyEvent;

/**
 * Created by kanming_xu on 10/28/15.
 */
public abstract class Character {
    private int healthPoints, damage, fireRate, speed, mana;

    public Character (int healthPoints, int damage, int fireRate, int speed, int mana){
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.fireRate = fireRate;
        this.speed = speed;
        this.mana = mana;
    }

    //Define the methods that the character should have here.

    protected int getHealthPoints() {
        return healthPoints;
    }

    protected void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    protected int getDamage() {
        return damage;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected int getFireRate() {
        return fireRate;
    }

    protected void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int getMana() {
        return mana;
    }

    protected void setMana(int mana) {
        this.mana = mana;
    }

    public abstract void move(KeyEvent e);


}