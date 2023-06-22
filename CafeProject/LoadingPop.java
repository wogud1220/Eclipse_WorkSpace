import javax.swing.*;
import java.awt.*;


public class LoadingPop extends Thread { // 로딩중 팝업 (PaymentPop 에서 결제,취소버튼을 누르면 1회 실행)

    JFrame loadingFrame = new JFrame(" 결제 로딩 ");
    JProgressBar bar = new JProgressBar(0, 100); // 진행바

    Label status = new Label("로딩중입니다...");

    @Override
    public void run() {
    	
    
    	super.run();

        bar.setValue(0);  // 진행률 바 속성
        bar.setBounds(0, 0, 300, 100);
        bar.setStringPainted(true);
        bar.setBackground(Color.BLUE);
        bar.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));

        loadingFrame.add(bar);
        loadingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadingFrame.setSize(300, 100); // 사이즈, 위치값
        loadingFrame.setLocation(700, 100);
        loadingFrame.setLayout(null); // 프로그래스바
        loadingFrame.add(status);
        loadingFrame.setVisible(true);

        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(30);

                counter += 10;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        bar.setString("완료!");
        try{
            Thread.sleep(5000);	//5초 뒤에 꺼지기
        }catch (Exception e){

        }
        loadingFrame.dispose();
        
    	}


    }
	
