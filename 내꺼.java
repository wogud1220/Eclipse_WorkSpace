import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CafeTest extends JFrame {

	JButton groupButton[];
	String[] groupLabel = { "커피", "에이드", "스무디", "와플", "빵" };
	
	
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	
	
	

public CafeTest() {
		
		JFrame frame = new JFrame();
		
		 JPanel NorthPanel = new JPanel();
	     NorthPanel.setBackground(Color.orange);
	     NorthPanel.setLayout(new FlowLayout());	//그룹 패널 생성
	     
	     JButton[] groupbar=new JButton[5];
	     for(int i=0;i<groupbar.length;i++) {
	    	 groupbar[i]=new JButton(groupLabel[i]);
	    	 NorthPanel.add(groupbar[i]);
	     }										//그룹 패널에 그룹 버튼 추가
	     
	     
	     
	     
	     
	     JPanel MenuPanel = new JPanel();	//메뉴 패널 생성
	     MenuPanel.setLayout(null);
	     MenuPanel.setBackground(Color.LIGHT_GRAY);
	     String coffeeMenu[]= {"아메리카노","카페라떼","아인슈페너","카라멜 마끼아또","카페 모카","헤이즐넛 라떼"};
	     int price[]= {2000, 2300, 2500, 2700, 2900};
	     JButton coffeeButton[] = new JButton[coffeeMenu.length];
	     
	     
	     ImageIcon Americano_Img = new ImageIcon("Image/Americano.jpg");
	     ImageIcon Latte_Img = new ImageIcon("Image/Latte.jpg");
	     ImageIcon Einspanner_Img = new ImageIcon("Image/Einspanner.jpg");
	     ImageIcon CaramelMacchiato_Img = new ImageIcon("Image/CaramelMacchiato.jpg");
	     ImageIcon CafeMocha_Img = new ImageIcon("Image/CafeMocha.jpg");
	     ImageIcon Hazelnuts_Img = new ImageIcon("Image/Hazelnuts.jpg");
	     //커피 이미지 생성
	     
	     coffeeButton[0]=new JButton (imageSetSize(Americano_Img, 100, 100));
	     coffeeButton[1]=new JButton (imageSetSize(Latte_Img, 100, 100));
	     coffeeButton[2]=new JButton (imageSetSize(Einspanner_Img, 100, 100));
	     coffeeButton[3]=new JButton (imageSetSize(CaramelMacchiato_Img, 100, 100));
	     coffeeButton[4]=new JButton (imageSetSize(CafeMocha_Img, 100, 100));
	     coffeeButton[5]=new JButton (imageSetSize(Hazelnuts_Img, 100, 100));
	     //커피 이미지를 버튼으로 사용
	     
	     for(int i=0;i<coffeeButton.length;i++) {
	    	 if(i<3)
	    		 coffeeButton[i].setBounds(25 + i * 180, 40, 140, 120);
	    	 else if(i<5)
	    		 coffeeButton[i].setBounds(25 + (i-3) * 150, 200, 140, 120);
	    	
	    //						1.가로 위치 2. 세로 위치 4. 가로 길이 5. 세로 길이
	    MenuPanel.add(coffeeButton[i]);
	    }
	     
	     
	     
		 frame.add(NorthPanel, BorderLayout.NORTH);
		 frame.add(MenuPanel, BorderLayout.CENTER);
	      //  frame.add(CenterPanel, BorderLayout.CENTER);
	       // frame.add(SouthPanel, BorderLayout.SOUTH);
	        //frame.add(SelectPanel, BorderLayout.EAST);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(700, 0);
		frame.setVisible(true);
		frame.setTitle("카페 ING 키오스ㅋ");
		frame.setSize(600, 900);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeTest Cafe = new CafeTest();
	}


}
