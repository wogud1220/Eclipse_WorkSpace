import javax.swing.*;



public class kioskFrame extends JFrame { //Frame은 최상위 컨테이너에 패널을 붙여ㅅ
    public kioskFrame(String btnName) {
        this.setTitle("카페 INg 키오스크");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        KioskPanel kioskPanel = new KioskPanel();
        kioskPanel.setBtnName(btnName); // Kiosk패널로 값전달
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        this.setContentPane(kioskPanel);
        this.setResizable(true); 
        this.setBounds(400, 0, 600, 1080); // 첫시작화면 사이즈
        this.setVisible(true);

    }
}