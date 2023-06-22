import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class soundCancel extends Thread { // 결제취소 효과음


    @Override
    public void run() {

        try {
            Thread.sleep(50); // ~ 초 뒤 효과음 실행
            File soundFile = new File("src/취소.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioIn.getFormat();


            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioIn);
            clip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            // 오디오 파일 가지고 올수 없을때,   입출력동작 실패시 , 라인이 사용불가시일때,          Thread가 꺠아나지 못할떄
            e.printStackTrace(); // 에러발생한 곳을 찾아 에러를 출력해라
        }
    }
}


//    cancelSound  cancelbtn = new cancelSound();// 결제완료창 효과음
//    Thread cancelbtnsound = new Thread(cancelbtn);
//    cancelbtnsoundd.start();
