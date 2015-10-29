import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by kanming_xu on 10/28/15.
 */
public class Character {
    int i;
    int[] healthPoints = {
            100, 75, 150, 75, 100, 100
    };
    int[] damage = {
            50, 300, 35, 75, 50, 50
    };
    int[] fireRate = {
            100, 200, 50, 75, 100, 100
    };
    int[] speed = {
            100, 100, 70, 200, 100, 100
    };
    int[] mana = {
            100, 100, 100, 100, 100, 100
    };
    private static ArrayList<Integer> character = new ArrayList<Integer>();
    public Character (int i){
        this.i = i - 1;
    }
    public ArrayList returnCharacter() {
        character.add(healthPoints[i]);
        character.add(damage[i]);
        character.add(fireRate[i]);
        character.add(speed[i]);
        character.add(mana[i]);
        return character;
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Pick a character: Rifleman, Sniper, Machine Gunner");
//        String characterSet = input.nextLine();
//        if (characterSet.equalsIgnoreCase("Rifleman")) {
//            Character character = new Character(1);
//            character.returnCharacter();;
//        } else if (characterSet.equalsIgnoreCase("Sniper")) {
//            Character character = new Character(2);
//            character.returnCharacter();
//        } else if (characterSet.equalsIgnoreCase("Machine Gunner")) {
//            Character character = new Character(3);
//            character.returnCharacter();
//        }
//    }
}