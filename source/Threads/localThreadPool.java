package source.Threads;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by s0urc3d3v3l0pm3nt on 11/1/2015.
 */
public class localThreadPool extends Thread {
    private static BufferedImage img;
    private static long total;

    public static Image loadImage(final String PATH) {
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

    public long doMath(final long x, final long y, String operation) {
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

    interface backgroundThread {
        void doInBackground();
    }

    public static void doInBackground(final backgroundThread code){
        //To use Lambda just define some code ()->{code here}; and define like this backgroundThread doStuff = ()->{code here};
        //Then call like so doInBackground(definedCode);
        try {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    code.doInBackground();
                }
            });
            t.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}




