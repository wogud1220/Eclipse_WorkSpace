import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class soundMenuselect extends Thread { // 메인 키오스트 패널 진입시 나오는 효과음 - 메뉴를 선택하고 결제버튼을 눌러주세요


    @Override
    public void run() {

        try {	//매뉴를 선택해주세요 알림
            Thread.sleep(2500); // ~ 초 뒤 효과음 실행
            File soundFile = new File("src/메뉴선택.wav");
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


//    menuselectSound menuselect = new menuselectSound();// 결제완료창 효과음
//    Thread menuselectsound = new Thread(menuselect);
//    menuselectsound.start();
