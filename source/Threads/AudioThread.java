package source.Threads;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Jack on 10/31/2015.
 */
public class AudioThread extends Thread implements ActionListener {

    private MediaPlayer mediaPlayer;
    private Timer timer;
    private boolean playing = false;

    public void run() {
        timer = new Timer(1000/60,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playAudio();
    }

    private void playAudio() {
        if(!playing) {
            new JFXPanel();
            CountDownLatch latch = new CountDownLatch(1);
            latch.countDown();
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                mediaPlayer = new MediaPlayer(new javafx.scene.media.Media(getClass().getResource("../Audio/AudioFiles/Music.mp3").toURI().toString()));
                mediaPlayer.play();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            playing = true;
        }
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                playing = false;
            }
        });
    }
}
