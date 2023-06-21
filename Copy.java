import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CafeTest extends JFrame implements ActionListener {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize(); // 현재 화면 크기 얻음
	JButton[] groupButton;
	String[] groupLabel = { "커피", "에이드", "스무디", "와플", "빵" };

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	public CafeTest() {
		JPanel panel = new JPanel(); // 전체 패널 생성

		JPanel groupPanel = new JPanel(); // 상단 그룹 생성

		groupButton = new JButton[5];
		for (int i = 0; i < groupButton.length; i++) {
			groupButton[i] = new JButton(groupLabel[i]);
			groupButton[i].setPreferredSize(new Dimension(110, 50));
			groupPanel.add(groupButton[i]);
		}
		panel.add(groupPanel); // 버튼 패널을 전체 패널에 집어넣음

		JPanel coffeePanel1 = new JPanel();

		ImageIcon Americano = new ImageIcon("Image/Americano.jpg");
		JButton label_Americano = new JButton("아메리카노", imageSetSize(Americano, 80, 200)); // 글자 위치

		ImageIcon Latte = new ImageIcon("Image/Latte.jpg");
		JButton label_Latte = new JButton("카페라떼", imageSetSize(Latte, 80, 200)); // 글자 위치

		ImageIcon Einspanner = new ImageIcon("Image/Einspanner.jpg");
		JButton label_Einspanner = new JButton("아인슈페너", imageSetSize(Einspanner, 80, 200)); // 글자 위치
		coffeePanel1.add(label_Americano);
		coffeePanel1.add(label_Latte);
		coffeePanel1.add(label_Einspanner);

		panel.add(coffeePanel1); // 패널에 첫째줄 커피 버튼 생성

		
		
		
		
		
		
		JPanel pricePanel1 = new JPanel();	//첫째줄 커피 가격 패널 생성
		// pricePanel1.setLayout(null);
		JLabel AmericanoLabel = new JLabel("2000");
		AmericanoLabel.setHorizontalAlignment(JLabel.RIGHT);

		pricePanel1.add(AmericanoLabel);
		panel.add(pricePanel1);// 첫째줄 커피 가격 생성
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		JPanel coffeePanel2 = new JPanel(); // 둘째줄 커피 버튼 생성

		ImageIcon CaramelMacchiato = new ImageIcon("Image/CaramelMacchiato.jpg");
		JButton label_CaramelMacchiato = new JButton("카라멜 마끼아또", imageSetSize(CaramelMacchiato, 80, 200)); // 글자 위치

		ImageIcon CafeMocha = new ImageIcon("Image/CafeMocha.jpg");
		JButton label_CafeMocha = new JButton("카페 모카", imageSetSize(CafeMocha, 80, 200));

		ImageIcon Hazelnuts = new ImageIcon("Image/Hazelnuts.jpg");
		JButton label_Hazelnuts = new JButton("헤이즐넛 라떼", imageSetSize(Hazelnuts, 80, 200));

		coffeePanel2.add(label_CaramelMacchiato);
		coffeePanel2.add(label_CafeMocha);
		coffeePanel2.add(label_Hazelnuts);
		panel.add(coffeePanel2);// 둘째줄 커피 버튼 패널에 추가

		// panel.setLayout(null);
		JButton Order = new JButton("결제하기");
		Order.setBounds(100, 200, 400, 400);
		panel.add(Order); // 결제 버튼 패널에 추가하기

		add(panel);

		// setLocationRelativeTo(null); 창 가운데에 표시
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(700, 0);
		setVisible(true);
		setTitle("카페 키오스크");
		setSize(600, 900);
	}

	private void setHorizontalAlignment(int center) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeTest Cafe = new CafeTest();
		Cafe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
