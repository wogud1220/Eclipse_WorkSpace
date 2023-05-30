import javax.swing.*;
//import java.awt.FlowLayout;

public class TemperatureTransferTest extends JFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		
		
		// f.setLayout(new FlowLayout());
		f.setLocation(800, 400); // 뜨는 창 위치 선언
		f.add(panel); // 프레임 아래 패널 생성

		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JButton button1 = new JButton("변환");
		JTextField field1 = new JTextField(15);// 화씨꺼 텍스트 필드의 칸 수
		JTextField field2 = new JTextField(15);// 섭씨꺼
		
		panel1.add(label1);
		panel1.add(field1);
		
		panel2.add(label2);
		panel2.add(field2);
		
		panel3.add(button1);
		
		/*panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button1);*/

		f.setTitle("온도 변환기");
		f.setSize(250, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
