package source.Threads;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Jack on 10/31/2015.
 */
public class AudioThread extends Thread {

    public void run() {
        try {
            FileInputStream audioInputStream = new FileInputStream(getClass().getResource("../Audio/AudioFiles/Music.mp3").getPath());
            final Player audioPlayer = new Player(audioInputStream);
            audioPlayer.play();
            Timer timer = new Timer(1000 / 60, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(audioPlayer.isComplete()) {
                        try {
                            audioPlayer.play();
                        } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
            timer.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
