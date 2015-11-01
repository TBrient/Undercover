package source.Threads;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by spam on 11/1/2015.
 */
public class ThreadPoll extends Thread {
    private BufferedImage img;
    private long total;

    public Image loadImage(final String PATH) {
        Thread loadImageThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    img = ImageIO.read(new File(PATH));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        loadImageThread.start();
        return img;
    }

    public long doMath(final int x, final int y, String operation) {
        if (operation.toLowerCase().contains("add")) {
            Thread addThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    total = x + y;
                }
            });
        } else if (operation.toLowerCase().contains("subtract")) {
            Thread subThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    total = x - y;
                }
            });
        } else if (operation.toLowerCase().contains("multiply")) {
            Thread multiplyThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    total = x * y;
                }
            });
        } else if (operation.toLowerCase().contains("divide")) {
            Thread divThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    total = x / y;
                }
            });
        } else if (operation.toLowerCase().contains("modulo")) {
            Thread modThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    total = x % y;
                }
            });
        }
        return total;
    }
}


