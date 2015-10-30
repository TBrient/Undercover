package source.Screens;

/**
 * Created by Jack on 10/30/2015.
 * Knows what is the screen that is currently displaying.
 */
public class ScreenHandler {
    private static Screen screen;

    public static Screen getScreen() {
        return screen;
    }

    public static void setScreen(Screen scr) {
        screen = scr;
    }
}
