import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 키오스크 첫화면 시작
// 포장,매장 선택 -> 메인 KioskPanel로 이동
public class KioskMain extends JFrame implements ActionListener, MouseListener {

    // 최상위 프레임
    JFrame frame = new JFrame();
    // 매장버튼패널
    JPanel storePanel = new JPanel(new BorderLayout());
    // 포장버튼 패널
    JPanel packPanel = new JPanel(new BorderLayout());
    // 버튼은 2개 (매장, 포장)
    JButton btnStore = new JButton();
    JButton btnPacking = new JButton();
    // 상단 알림 텍스트 "이용방법을 선택하세요"
    JButton label = new JButton();

    // 이미지 담는 패널, 레이블
    JPanel imgPanel =new JPanel();
    JLabel imageLabel = new JLabel();


    public KioskMain() {
        super("카페 ING 키오스크");
        try {
            // 동서남북 배치가능를 위해 보더레이아웃 사용
            this.setLayout(new BorderLayout());
            this.setLayout(new GridLayout(2, 2, 30, 0));

            //  매장버튼 박스
            Box store = Box.createVerticalBox();
            store.add(Box.createVerticalStrut(30));
            // 포장버튼 박스
            Box pack = Box.createVerticalBox();
            pack.add(Box.createVerticalStrut(30));
            //  배너박스
            Box bgImg = Box.createVerticalBox();
            bgImg.add(Box.createVerticalStrut(30));

            // 이미지 카페 INg 배경 추가
            ImageIcon icon = new ImageIcon(this.getClass().getResource("background.jpg"));
           
            imageLabel.setIcon(icon);
            imgPanel.add(imageLabel);
            frame.add(imgPanel);


            // 매장버튼 패널 속성
            storePanel.add(store, BorderLayout.CENTER);
            storePanel.setBackground(new Color(236, 232, 231));
            btnStore.setFocusable(false);
            btnStore.setFont(new Font("NanumBarunpen", Font.BOLD, 60));
            btnStore.setText("매장선택");
            btnStore.setForeground(Color.black);
            storePanel.add(btnStore);
            frame.add(storePanel);

            // 포장버튼 패널 속성
            packPanel.add(pack, BorderLayout.CENTER);
            packPanel.setBackground(new Color(236, 232, 231));
            btnPacking.setFocusable(false);
            btnPacking.setText("포장선택");
            btnPacking.setFont(new Font("NanumBarunpen", Font.BOLD, 60));
            btnPacking.setForeground(Color.black);
            packPanel.add(btnPacking);
            frame.add(packPanel);

            // 수직배치
            Box vertical = Box.createVerticalBox();
            vertical.add(imgPanel);
            this.add(vertical, BorderLayout.CENTER);
            // 수평배치
            Box center = Box.createHorizontalBox();
            center.add(storePanel);
            center.add(packPanel);
            this.add(center, BorderLayout.CENTER);


            setBounds(400, 0, 600, 1080);	// 프레임 크기
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);

            // 마우스, 액션 이벤트 등록 ( 포장, 매장버튼 텍스트 활성화 비활성화 )

            btnStore.addMouseListener(this);
            btnPacking.addMouseListener(this);
            btnStore.addActionListener(this);
            btnPacking.addActionListener(this);

        }catch(Exception exception){
                exception.printStackTrace();
            }
        }



	//------------------------------------------------------------------------------------------------------- 마우스 이벤트
    @Override
    public void mouseClicked(MouseEvent e) {}


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    // 마우스, 액션 이벤트 등록 ( 포장, 매장버튼 텍스트 활성화 비활성화 )
    @Override
    public void mouseEntered(MouseEvent e) {	//매장에 커서를 올리면
        if (e.getSource() == btnStore) {
            btnStore.setText("매장선택");
            btnStore.setForeground(Color.black);
            btnPacking.setText("포장선택");
            btnPacking.setForeground(Color.LIGHT_GRAY);
        } else {	//포장에 커서 올리면
            btnStore.setText("매장선택");
            btnStore.setForeground(Color.LIGHT_GRAY);
            btnPacking.setText("포장선택");
            btnPacking.setForeground(Color.black);
        }

    }

    // 마우스, 액션 이벤트 등록 ( 포장, 매장버튼 텍스트 활성화 비활성화 )
    @Override
    public void mouseExited(MouseEvent e) {	//마우스 나가면
        btnStore.setText("매장선택");
        btnPacking.setText("포장선택");
    }

    //----------------------------------------------------------------------------------------------------------- 액션 이벤트

    // 매장,포장 버튼을누르면 Kiosk 프레임을 연결-> (메뉴판 화면)
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnStore) {
            label.setVisible(false);
            // 버튼이름 값 전달 (KioskFrame의 결제확인 textfield로 전달)
            new kioskFrame(btnStore.getText());  
           
            // 매장선택효과음
            soundBtnstore store = new soundBtnstore();
            Thread sound = new Thread(store);
            sound.start();


        } else {
            label.setVisible(false);
            new kioskFrame(btnPacking.getText());
            
            // 포장선택효과음
            soundBtnpack btnpack = new soundBtnpack();
            Thread btnpacksound = new Thread(btnpack);
            btnpacksound.start();
        }

    }


    //-----------------------------------------------------------------------------------------------------------메인 시작

    //첫 시작화면,  KioskMain의 팝업 ->매장,포장선택 -> 메뉴판 화면
    public static void main(String[] args) {

        new KioskMain();
    }

}
