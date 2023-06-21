import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CafeTest extends JFrame {

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	
	
	public CafeTest() {
		

		Font font1 = new Font(Font.MONOSPACED, Font.PLAIN, 15);
		JButton groupButton[];
		String[] groupLabel = { "커피", "에이드", "스무디", "와플", "빵" };

		Font font2 = new Font("맑은 고딕", Font.BOLD, 15);
		

		JFrame frame = new JFrame();

		JPanel NorthPanel = new JPanel();
		NorthPanel.setBackground(Color.orange);
		NorthPanel.setLayout(new FlowLayout()); // 그룹 패널 생성

		JButton[] groupbar = new JButton[5];
		for (int i = 0; i < groupbar.length; i++) {
			groupbar[i] = new JButton(groupLabel[i]);
			NorthPanel.add(groupbar[i]);
			groupbar[i].setFont(font2);
		} // 그룹 패널에 그룹 버튼 추가
		
		
		
		
		//=========그룹 바에서 커피 버튼 누르면 커피들 나옴
	    groupbar[1].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
			    });
		
		JPanel MenuPanel = new JPanel(); // 메뉴 패널 생성
		MenuPanel.setLayout(null);
		MenuPanel.setBackground(Color.LIGHT_GRAY);
		String coffeeMenu[] = { "Americano", "카페라떼", "아인슈페너", "카라멜 마끼아또", "카페 모카", "헤이즐넛 라떼" };
		int price[] = { 2000, 2300, 2500, 2700, 2900, 3000 };
		JButton coffeeButton[] = new JButton[coffeeMenu.length];
		JButton minus[] = new JButton[coffeeMenu.length];
		JButton plus[] = new JButton[coffeeMenu.length];
		JButton ok[] = new JButton[coffeeMenu.length];
		JTextField count[] = new JTextField[coffeeMenu.length];

		ImageIcon Americano_Img = new ImageIcon("Image/Americano.jpg");
		ImageIcon Latte_Img = new ImageIcon("Image/Latte.jpg");
		ImageIcon Einspanner_Img = new ImageIcon("Image/Einspanner.jpg");
		ImageIcon CaramelMacchiato_Img = new ImageIcon("Image/CaramelMacchiato.jpg");
		ImageIcon CafeMocha_Img = new ImageIcon("Image/CafeMocha.jpg");
		ImageIcon Hazelnuts_Img = new ImageIcon("Image/Hazelnuts.jpg");
		// 커피 이미지 생성

		coffeeButton[0] = new JButton(imageSetSize(Americano_Img, 100, 100));
		coffeeButton[1] = new JButton(imageSetSize(Latte_Img, 100, 100));
		coffeeButton[2] = new JButton(imageSetSize(Einspanner_Img, 100, 100));
		coffeeButton[3] = new JButton(imageSetSize(CaramelMacchiato_Img, 100, 100));
		coffeeButton[4] = new JButton(imageSetSize(CafeMocha_Img, 100, 100));
		coffeeButton[5] = new JButton(imageSetSize(Hazelnuts_Img, 100, 100));
		// 커피 이미지를 버튼으로 사용

		for (int i = 0; i < coffeeButton.length; i++) {
			if (i < 3)
				coffeeButton[i].setBounds(25 + i * 180, 40, 140, 120);
			else if (i < 6)
				coffeeButton[i].setBounds(25 + (i - 3) * 180, 280, 140, 120);

			// 1.가로 위치 2. 세로 위치 4. 가로 길이 5. 세로 길이
			MenuPanel.add(coffeeButton[i]);
			// 메뉴 패널에 카페 이미지 생성 완료

			Label name[] = new Label[coffeeMenu.length]; // 커피 이름 라벨 생성
			name[i] = new Label(coffeeMenu[i]);
			name[i].setBounds(coffeeButton[i].getX() - 3, coffeeButton[i].getY() + 120, 130, 20);
			name[i].setFont(font1);

			Label won[] = new Label[coffeeMenu.length]; // 커피 가격 라벨 생성
			won[i] = new Label(price[i] + "원");
			won[i].setBounds(name[i].getX(), name[i].getY() + 20, 100, 20);
			won[i].setFont(font1);

			// ======== - 버튼 생성
			minus[i] = new JButton("-");
			minus[i].setBounds(won[i].getX(), won[i].getY() + 20, 38, 20);
			minus[i].setEnabled(true);

			// ======== + 버튼 생성
			plus[i] = new JButton("+");
			plus[i].setBounds(minus[i].getX() + 100, won[i].getY() + 20, 41, 20);
			plus[i].setEnabled(true);

			// ====== 수량 텍스트필드 생성
			count[i] = new JTextField("0");
			count[i].setBounds(minus[i].getX() + 50, won[i].getY() + 20, 40, 20);
			count[i].setEnabled(false);

			// ======== 추가하기 버튼 생성
			ok[i] = new JButton("추가하기");
			ok[i].setBounds(minus[i].getX() + 30, won[i].getY() + 50, 90, 20);
			ok[i].setEnabled(false);
			
			//=======	 결제하기 위치 알려주기
			JLabel buyLabel=new JLabel("결제하기 ==>");
			buyLabel.setBounds(400, 500, 100, 60);
			
			
			
			MenuPanel.add(buyLabel);
			
			MenuPanel.add(plus[i]);
			MenuPanel.add(minus[i]);
			MenuPanel.add(name[i]);
			MenuPanel.add(won[i]);
			MenuPanel.add(ok[i]);
			MenuPanel.add(count[i]);
			
		} // for문 종료

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//======= 오른쪽 결제하기 패널 생성
		JPanel BuyPanel = new JPanel();
		JButton buy[] = new JButton[1];
		
		
		
		
		
		
		//=========  하단 주문 목록 패널 생성
		Panel SouthPanel = new Panel();
		
		String[] [] data = new String[0][0];
        String[] title = {"상품명","단가","수량","합계", "총 금액"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(580,200));
        SouthPanel.add(scrollPane);
        SouthPanel.setEnabled(false);
        
        
        
        //======== 우측 결제버튼 생성
        Panel EastPanel = new Panel();
        
        
        
        frame.add(BuyPanel, BorderLayout.EAST);
        frame.add(SouthPanel, BorderLayout.SOUTH);
		frame.add(NorthPanel, BorderLayout.NORTH);
		frame.add(MenuPanel, BorderLayout.CENTER);
		// frame.add(CenterPanel, BorderLayout.CENTER);
		// frame.add(SouthPanel, BorderLayout.SOUTH);
		// frame.add(SelectPanel, BorderLayout.EAST);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(800, 0);
		frame.setVisible(true);
		frame.setTitle("카페 ING 키오스크");
		frame.setSize(600, 900);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		CafeTest Cafe = new CafeTest();
		//Cafe.setVisible(true);
	}

}
