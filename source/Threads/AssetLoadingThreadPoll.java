package source.Threads;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by spam on 11/1/2015.
 */
public class AssetLoadingThreadPoll {
    private Image img;
    private String PATH;
    public AssetLoadingThreadPoll(String PATH){

    }
    private Image LoadImageOnSeparateThread(){
        Thread t = new Thread();
        t.start();
        return this.img;
    }

    public void run(){
        this.img = LoadImage(PATH);
    }

    private BufferedImage LoadImage(String PATH){
        try {
            return ImageIO.read(new File(PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
