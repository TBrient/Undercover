package source.Screens;

import java.util.ArrayList;

/**
 * Created by Jack on 10/30/2015.
 * Knows what is the screen that is currently displaying.
 */
public class ScreenHandler {
    private static ArrayList<Screen> screens = new ArrayList<Screen>();
    private static Screen screen;

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public Screen getCurrentScreen() {
        return screen;
    }

    public static void setScreen(int index) {
        try {
            screen = screens.get(index);
        } catch(IndexOutOfBoundsException e) {e.printStackTrace();}
    }
}
