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
import javax.swing.SwingConstants;

public class CafeTest extends JFrame implements ActionListener {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize(); // 현재 화면 크기 얻음

	// setIconImage(frame_image);

	// Image frame_image=kit.getImage("Image/Americano.jpg");

	JButton[] groupButton;
	String[] groupLabel = { "커피", "에이드", "스무디", "와플", "빵" };

	public CafeTest() {
		JPanel groupPanel = new JPanel(); // 상단 그룹 생성
		groupButton = new JButton[5];
		for (int i = 0; i < groupButton.length; i++) {
			groupButton[i] = new JButton(groupLabel[i]);
			groupButton[i].setPreferredSize(new Dimension(110, 50));
			groupPanel.add(groupButton[i]);
		}
		ImageIcon Americano = new ImageIcon("Image/Americano.jpg");
		JLabel l1 = new JLabel("아메리카노", Americano, SwingConstants.LEADING);
		groupPanel.add(l1);
		add(groupPanel);

		// setLocationRelativeTo(null); 창 가운데에 표시
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(700, 0);
		setVisible(true);
		setTitle("카페 키오스크");
		setSize(600, 900);
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
