import javax.swing.*; //10주차 pdf 11페이지
//마침내 버튼이 눌렸습니다 클래스

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}

}

public class ActionEventTest1 {		//독립적인 클래스 작성
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}