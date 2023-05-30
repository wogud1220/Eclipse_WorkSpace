import javax.swing.*;
public class PIzzaFrameTest extends JFrame {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JPanel panel=new JPanel();	//위, 아래를 포함하는 전체 패널 생성
		JPanel panel1=new JPanel();	// 위 패널
		JPanel panel2=new JPanel();// 아래패널
		f.add(panel);
		panel.add(panel1);
		panel.add(panel2);
		
		
		JLabel label1=new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JLabel label2=new JLabel("개수");
		panel1.add(label1);
		
		
		JButton button1=new JButton("콤보피자");
		JButton button2=new JButton("포테이토피자");
		JButton button3=new JButton("불고기피자");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		JTextField field1=new JTextField(10);
		panel2.add(field1);

		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("피자 주문 프로그램");
		f.setSize(500,300);
		f.setVisible(true);
	}

}
