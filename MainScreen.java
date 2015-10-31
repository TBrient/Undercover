import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by kanming_xu on 10/30/15.
 */
public class MainScreen {

    private BufferedImage StartScreenimage;

    public void drawTitle(Graphics2D g2){
        try {
            StartScreenimage = ImageIO.read(new File("Undercover-Start-Screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g2.drawImage(StartScreenimage, 0, 0 , null);

    }
}
