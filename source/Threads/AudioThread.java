package source.Threads;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer;

import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Jack on 10/31/2015.
 */
public class AudioThread extends Thread implements Runnable {

    private MediaPlayer mediaPlayer;

    public void run() {
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
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        mediaPlayer.play();
        mediaPlayer.setOnEndOfMedia(this);
    }
}
