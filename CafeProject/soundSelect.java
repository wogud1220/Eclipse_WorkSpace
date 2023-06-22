import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class soundSelect extends Thread { // 메뉴선택 효과음


    @Override
    public void run() {

        try {
            File soundFile = new File("src/select.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioIn.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioIn);
            clip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}



