import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


//메뉴 선택 화면 시작
public class KioskPanel extends JPanel {  // 메인 KioskPanel에서는 메뉴선택,취소, 결제금액확인 가능 -> PaymentPop으로 연결됨

	
	
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	
	
	///================== 상단 그룹화 버튼 생성
    static JButton[] tabBtn = new JButton[5];  // 커피, 에이드, 스무디, 와플, 빵
    
    String[] tabBtntext = new String[]{"커피", "에이드", "스무디","와플","빵"};
  
    
 
    
    //==================== 커피 메뉴 생성
    JButton[] coffeeBtns = new JButton[6]; // 커피버튼 (총 6개) 이름, 이미지, 가격

    ImageIcon Americano_Img = new ImageIcon("src/Americano.jpg");
    ImageIcon Latte_Img = new ImageIcon("src/Latte.jpg");
	ImageIcon Einspanner_Img = new ImageIcon("src/Einspanner.jpg");
	ImageIcon CaramelMacchiato_Img = new ImageIcon("src/CaramelMacchiato.jpg");
	ImageIcon CafeMocha_Img = new ImageIcon("src/CafeMocha.jpg");
	ImageIcon Hazelnuts_Img = new ImageIcon("src/Hazelnuts.jpg");
    
    String[] coffeeList = new String[]{"아메리카노[2000원]", "카페 라떼 [3000원]", "아인슈페너 [3500원]",
    									"카라멜 마끼아또 [3000원]", "카페 모카 [4000원]", "헤이즐넛 라떼 [3500원]",};
    ImageIcon[] coffeeIcon = {(imageSetSize(Americano_Img, 80, 100)), (imageSetSize(Latte_Img, 80, 100)), (imageSetSize(Einspanner_Img, 80, 100)),
    							(imageSetSize(CaramelMacchiato_Img, 80, 100)),(imageSetSize(CafeMocha_Img, 80, 100)), (imageSetSize(Hazelnuts_Img, 80, 100))};
    int[] coffeePrice = new int[]{2000, 3000, 2500, 2500, 3000, 3000, 3500, 3500, 3000};

    
    
    
    
    //====================== 에이드 메뉴 생성
    ImageIcon lemonade_Img=new ImageIcon("src/lemonade.jpg");
    ImageIcon grapefruit_Img=new ImageIcon("src/grapefruit.jpg");
    ImageIcon greengrape_Img=new ImageIcon("src/greengrape.jpg");
    ImageIcon bluelemonade_Img=new ImageIcon("src/bluelemonade.jpg");
    
    
    JButton[] adeBtn = new JButton[4]; //에이드 버튼 (4개) 이름, 이매ㅣ지, 가격
    String[] adeList = new String[]{"레몬에이드 [3800원]", "자몽에이드 [3800원]", "청포도에이드 [3800원]", "블루레몬에이드 [3800원]"};
    ImageIcon[] adeIcon ={(imageSetSize(lemonade_Img, 80, 100)), (imageSetSize(grapefruit_Img, 80, 100)),
    		(imageSetSize(greengrape_Img, 80, 100)), (imageSetSize(bluelemonade_Img, 80, 100))};
    int[] adePrice = new int[]{3800, 3800, 3800, 3800};



    
    
    
    
    //========================= 스무디 메뉴 생성
    ImageIcon strawberrysmoothie_Img = new ImageIcon("src/strawberrysmoothie.jpg");
    ImageIcon blueberrysmoothie_Img = new ImageIcon("src/blueberrysmoothie.png");
	ImageIcon mangosmoothie_Img = new ImageIcon("src/mangosmoothie.jpg");
	ImageIcon mochafrappe_Img = new ImageIcon("src/CaramelMacchiato.jpg");
	ImageIcon javachipfrappe_Img = new ImageIcon("src/javachipfrappe.png");
	ImageIcon mintchocofrappe_Img = new ImageIcon("src/mintchocofrappe.jpg");
    
    
    
    JButton[] smoothieBtn = new JButton[6]; 	//스무디 버튼(6개) 이름, 이미지, 가격,
    String[] smoothieList = new String[]{"딸기스무디 [4100원]", "블루베리스무디 [4100원]", "망고스무디 [4100원]",
                                            "모카프라페 [4700원]", "자바칩프라페 [4200원]", "민트초코프라페[4200원]"};
    ImageIcon[] smoothieIcon ={(imageSetSize(strawberrysmoothie_Img, 80, 100)),(imageSetSize(blueberrysmoothie_Img, 80, 100))
    		,(imageSetSize(mangosmoothie_Img, 80, 100)),(imageSetSize(mochafrappe_Img, 80, 100)),
    		(imageSetSize(javachipfrappe_Img, 80, 100)),(imageSetSize(mintchocofrappe_Img, 80, 100))};
    int[] smoothiePrice = new int[]{4100, 4100, 4100, 4700, 4200, 4200};

    
  
    
    
    
   //========================== 와플 메뉴 생성 
    ImageIcon plainwaffle_Img=new ImageIcon("src/plainwaffle.jpg");
    ImageIcon applewaffle_Img=new ImageIcon("src/applewaffle.jpg");
    ImageIcon strawberrywaffle_Img=new ImageIcon("src/strawberrywaffle.jpg");
    ImageIcon mangowaffle_Img=new ImageIcon("src/mangowaffle.jpg");
    
    
    JButton[] waffleBtn = new JButton[4]; 	//와플 버튼(4개) 이름, 이미지, 가격,
    String[] waffleList = new String[]{"플레인와플 [4100원]", "사과잼 와플 [4100원]", "딸기잼와플 [4100원]",
                                            "망고잼 와플 [4700원]"};
    ImageIcon[] waffleIcon ={(imageSetSize(plainwaffle_Img, 80, 100)),(imageSetSize(applewaffle_Img, 80, 100))
    		,(imageSetSize(strawberrywaffle_Img, 80, 100)),(imageSetSize(mangowaffle_Img, 80, 100))};
    int[] wafflePrice = new int[]{1800, 2300, 2300, 2300,};
    
    
    
    
    
    //========================== 빵 메뉴 생성
    ImageIcon bagel_Img=new ImageIcon("src/bagel.jpg");
    ImageIcon englishmuffin_Img=new ImageIcon("src/englishmuffin.jpg");
    ImageIcon chocochipmuffin_Img=new ImageIcon("src/chocochipmuffin.jpg");
    ImageIcon amondchocomuffin_Img=new ImageIcon("src/amondchocomuffin.jpg");
    JButton[] bakeryBtn = new JButton[4]; 	//빵 버튼(4개) 이름, 이미지, 가격,
    String[] bakeryList = new String[]{"베이글 [2300원]", "잉글리쉬머핀 [4000원]", "초코칩 머핀 [2500원]",
                                            "아몬드초코 머핀 [2500원]"};
    ImageIcon[] bakeryIcon ={(imageSetSize(bagel_Img, 80, 100)),(imageSetSize(englishmuffin_Img, 80, 100)),
    		(imageSetSize(chocochipmuffin_Img, 80, 100)),(imageSetSize(amondchocomuffin_Img, 80, 100))};
    int[] bakeryPrice = new int[]{2300, 4000, 2500, 2500,};
    
    
    
    
    
    
    

    static JTextField textField = new JTextField(20); // 결제확인 표 높이

    String[] resultView = new String[]{"메뉴", "수량", "가격"};
    String[][] Data; // 수량,가격 표시
    int count = 1; // 수량은 1부터 시작

    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;

    JButton[] selectBtn = new JButton[2]; // 전체취소, 결제버튼
    String[] SelectBtn = new String[]{"취소하기", "결제하기"};

    String btnName = ""; // KioskMain에서 가져오는 버튼text값

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }
    public String getBtnName() {
        return btnName;
    }

  //---------------------------Kiosk Panel시작

    public KioskPanel() { 

    	 soundMenuselect menuselect = new soundMenuselect();// 메뉴를골라주세요효과음
    	    Thread menuselectsound = new Thread(menuselect);
    	    menuselectsound.start();

        
        this.model = new DefaultTableModel(this.Data, this.resultView);// 열: Data 값  / 행 : 메뉴,수량,가격

        this.table = new JTable(this.model); // JTabel에 주문정보가 담긴다.
        //   this.scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        this.setLayout(null); // null값일 때 좌표로 위치와 사이즈 조정가능


        tabBtn tabBtn = new tabBtn();// 상단카테고리 : 커피 / 에이드 / 스무디  / 와플 / 빵
        
        tabBtn.setSize(500, 80);
        tabBtn.setLocation(50, 50);
        this.add(tabBtn);
        
        int menuNum=0;
        coffeeMenuBtn coffee = new coffeeMenuBtn();// 커피 버튼 묶음
        coffee.setSize(560, 400);
        coffee.setLocation(10, 160);
        this.add(coffee);

        for (int i = 0; i < this.coffeeBtns.length; ++i) { // 커피 테이블에 입력되는 값
            int product = i;

            this.coffeeBtns[i].addActionListener(e -> {
            	soundSelect selectSound = new soundSelect(); // 선택효과음
                Thread btnSelect= new Thread(selectSound);
                btnSelect.start();
                
            DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();// 가로열에 메뉴명,수량,가격이 들어감
            model.addRow(new Object[]{KioskPanel.this.coffeeList[product], KioskPanel.this.count,KioskPanel.this.coffeePrice[product]});
           // menuNum++;  
            int rowCont = KioskPanel.this.table.getRowCount(); // 열의 수   //하단 결제금액 확인창에 정보가 출력
                int sum = 0;
                for (int j = 0; j < rowCont; ++j) {
                    sum = sum + (Integer) KioskPanel.this.table.getValueAt(j, 2);
                }
                textField.setText(btnName + " / 수량 " + rowCont + " / 총 금액 " + sum + "원");
            });
        }


        adeMenuBtn ade = new adeMenuBtn();// 에이드 버튼 묶음
        ade.setSize(560, 400);
        ade.setLocation(10, 160);
        ade.setBackground(new Color(236, 232, 231));
        this.add(ade);
        ade.setVisible(false);
        for (int i = 0; i < this.adeBtn.length; ++i) { // 에이드 테이블에 입력되는 값
            int product = i;
            // 에이드 버튼을 클릭-> 테이블에 메뉴의 값을 가져온다.
            this.adeBtn[i].addActionListener(e -> {
            	soundSelect selectSound = new soundSelect();// 선택효과음
                Thread btnSelect= new Thread(selectSound);
                btnSelect.start();
                
                DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();// 가로열에 메뉴명,수량,가격이 들어감
                model.addRow(new Object[]{KioskPanel.this.adeList[product], KioskPanel.this.count, KioskPanel.this.adePrice[product]});
               
                
                //PosDevice posDev=new PosDevice();	
               
              //posDev.sendOrder(1,KioskPanel.this.adeList[product],KioskPanel.this.count);
               
               
               int rowCont = KioskPanel.this.table.getRowCount(); // 열의 수   //하단 결제금액 확인창에 정보가 출력
                int sum = 0;

                for (int j = 0; j < rowCont; ++j) {
                    sum = sum + (Integer) KioskPanel.this.table.getValueAt(j, 2);
                }
                textField.setText(btnName + " / 수량 " + rowCont + " / 총 금액 " + sum + "원");


            });
          
        }

        
        
        smoothieBtn smoothies = new smoothieBtn();// 스무디 버튼 묶음
        smoothies.setSize(560, 400);
        smoothies.setLocation(10, 160);
        smoothies.setBackground(new Color(236, 232, 231));
        this.add(smoothies);
        smoothies.setVisible(false);
        for (int i = 0; i < this.smoothieBtn.length; ++i) { // 스무디 테이블에 입력되는 값
            int product = i;
            this.smoothieBtn[i].addActionListener(e -> { // 스무디 버튼을 클릭-> 테이블에 메뉴의 값을 가져온다.
                
            	soundSelect selectSound = new soundSelect();// 선택효과음
                Thread btnSelect= new Thread(selectSound);
                btnSelect.start();

                DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();// 가로열에 메뉴명,수량,가격이 들어감
                model.addRow(new Object[]{KioskPanel.this.smoothieList[product], KioskPanel.this.count, KioskPanel.this.smoothiePrice[product]});


                int rowCont = KioskPanel.this.table.getRowCount(); // 열의 수   //하단 결제금액 확인창에 정보가 출력
                int sum = 0;

                for (int j = 0; j < rowCont; ++j) {
                    sum = sum + (Integer) KioskPanel.this.table.getValueAt(j, 2);
                }
                textField.setText(btnName + " / 수량 " + rowCont + " / 총 금액 " + sum + "원");


            });
        }
        
        
        
        
        
        
        waffleBtn waffle= new waffleBtn();// 와플 버튼 묶음
        waffle.setSize(560, 400);
        waffle.setLocation(10, 160);
        waffle.setBackground(new Color(236, 232, 231));
        this.add(waffle);
        waffle.setVisible(false);
        for (int i = 0; i < this.waffleBtn.length; ++i) { // 와플 테이블에 입력되는 값
            int product = i;
            this.waffleBtn[i].addActionListener(e -> { // 와플 버튼을 클릭-> 테이블에 메뉴의 값을 가져온다.
                
            	soundSelect selectSound = new soundSelect();// 선택효과음
                Thread btnSelect= new Thread(selectSound);
                btnSelect.start();
                
                DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();// 가로열에 메뉴명,수량,가격이 들어감
                model.addRow(new Object[]{KioskPanel.this.waffleList[product], KioskPanel.this.count, KioskPanel.this.wafflePrice[product]});


                int rowCont = KioskPanel.this.table.getRowCount(); // 열의 수   //하단 결제금액 확인창에 정보가 출력
                int sum = 0;

                for (int j = 0; j < rowCont; ++j) {
                    sum = sum + (Integer) KioskPanel.this.table.getValueAt(j, 2);
                }
                textField.setText(btnName + " / 수량 " + rowCont + " / 총 금액 " + sum + "원");

                
            });
        }
        
        
        
        
        
        
        
        
        bakeryBtn bakery= new bakeryBtn();// 빵 버튼 묶음
        bakery.setSize(560, 400);
        bakery.setLocation(10, 160);
        bakery.setBackground(new Color(236, 232, 231));
        this.add(bakery);
        bakery.setVisible(false);
        for (int i = 0; i < this.bakeryBtn.length; ++i) { // 빵 테이블에 입력되는 값
            int product = i;
            this.bakeryBtn[i].addActionListener(e -> { // 빵 버튼을 클릭-> 테이블에 메뉴의 값을 가져온다.
                
            	soundSelect selectSound = new soundSelect();// 선택효과음
                Thread btnSelect= new Thread(selectSound);
                btnSelect.start();
                
                DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();// 가로열에 메뉴명,수량,가격이 들어감
                model.addRow(new Object[]{KioskPanel.this.bakeryList[product], KioskPanel.this.count, KioskPanel.this.bakeryPrice[product]});


                int rowCont = KioskPanel.this.table.getRowCount(); // 열의 수   //하단 결제금액 확인창에 정보가 출력
                int sum = 0;

                for (int j = 0; j < rowCont; ++j) {
                    sum = sum + (Integer) KioskPanel.this.table.getValueAt(j, 2);
                }
                textField.setText(btnName + " / 수량 " + rowCont + " / 총 금액 " + sum + "원");
            });
        }
        
        
        
        
        
        
        
        
        
     

        Screen screen = new Screen(); // 메뉴정보가 담기는 하단 테이블
        screen.setSize(600, 200);
        screen.setLocation(0, 580);
        screen.setBackground(new Color(236, 232, 231));
        this.add(screen);



        textField.setFont(new Font("NanumBarunpen", Font.BOLD, 20));  // 총 결제금액 박스
        textField.setSize(570, 70);
        textField.setLocation(10, 780);
        textField.setText(" 총 결제 금액 : ");
        textField.setFont(new Font("NanumBarunpen", Font.BOLD, 20));
        textField.setForeground(Color.black);
        textField.setBackground(Color.white);
        textField.setEnabled(false); // 수정불가한 상태로 설정
        this.add(textField);


        JLabel checkNotice = new JLabel("※ 메뉴를 선택 후 결제하기 버튼을 눌러주세요."); // 좌측 하단 주의사항 문구
        checkNotice.setSize(400, 60);
        checkNotice.setForeground(Color.black);
        checkNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        checkNotice.setLocation(50, 870);
        this.add(checkNotice);


        selectPaymentBtn selectPayment = new selectPaymentBtn(); // 하단선택버튼묵음 :선택취소, 전체취소, 결제 버튼
        selectPayment.setSize(350, 60);
        selectPayment.setLocation(210, 930);
        selectPayment.setBackground(new Color(236, 232, 231));
        this.add(selectPayment);


//------------// 알림문구

        JLabel coffeeNotice = new JLabel("커피를 골라주세요."); // 상단 커피탭 버튼 클릭시 뜨는 문구
        coffeeNotice.setSize(400, 60);
        coffeeNotice.setForeground(Color.BLACK);
        coffeeNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        coffeeNotice.setLocation(60, 110);
        coffeeNotice.setVisible(true);
        this.add(coffeeNotice);

        JLabel  adeNotice = new JLabel("에이드를 골라주세요."); // 상단 에이드탭 버튼 클릭시 뜨는 문구
        adeNotice.setSize(400, 60);
        adeNotice.setForeground(Color.BLACK);
        adeNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        adeNotice.setLocation(60, 110);
        adeNotice.setVisible(false);
        this.add(adeNotice);

        JLabel smoothiesNotice = new JLabel("스무디를 골라주세요."); // 상단 스무디탭 버튼 클릭시 뜨는 문구
        smoothiesNotice.setSize(400, 60);
        smoothiesNotice.setForeground(Color.BLACK);
        smoothiesNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        smoothiesNotice.setLocation(60, 110);
        smoothiesNotice.setVisible(false);
        this.add(smoothiesNotice);
        
        
        JLabel waffleNotice = new JLabel("와플을 골라주세요."); // 상단 와플탭 버튼 클릭시 뜨는 문구
        waffleNotice.setSize(400, 60);
        waffleNotice.setForeground(Color.BLACK);
        waffleNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        waffleNotice.setLocation(60, 110);
        waffleNotice.setVisible(false);
        this.add(waffleNotice);
        
        
        JLabel bakeryNotice = new JLabel("빵을 골라주세요."); // 상단 와플탭 버튼 클릭시 뜨는 문구
        bakeryNotice.setSize(400, 60);
        bakeryNotice.setForeground(Color.BLACK);
        bakeryNotice.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        bakeryNotice.setLocation(60, 110);
        bakeryNotice.setVisible(false);
        this.add(bakeryNotice);
        
        
        
        
        
        
        
        

//--------------------------------- 선택취소,전체취소,총금액,결제버튼 이벤트


        // 전체취소 버튼 이벤트
        this.selectBtn[0].addActionListener(e -> {
            JButton button = (JButton) e.getSource();
            DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();
            model.setRowCount(0); // 행수를 0으로 설정
            textField.setText(""); // 기존에 있는 내용을 지우고 새로 세팅
            textField.setText("메뉴를 선택해주세요.");
            textField.setFont(new Font("NanumBarunpen", Font.BOLD, 20));
        });

        // 결제완료 버튼 이벤트
        this.selectBtn[1].addActionListener(e -> {  // 총금액을 확인하고, 결제하기를 누르면 로딩팝업이 잠시 뜬후 결제확인창이 뜸
     
        	
        	
        	
        	
        for(int i=0;i<table.getRowCount();i++) {
        	System.out.println("메뉴: "+table.getValueAt(i,0)+"수량: "+table.getValueAt(i, 1));
        	
        	}
            new PaymentPop();


        });

//------------ 커피, 에이드, 스무디, 와플, 빵,  이벤트

        // 커피 카테고리 이벤트 // 첫화면에는 커피 카테고리가 보임
        KioskPanel.tabBtn[0].addActionListener(e -> {
            JButton button = (JButton) e.getSource();
            String str = button.getText();

            coffee.setVisible(true);
            ade.setVisible(false);
            smoothies.setVisible(false);
            waffle.setVisible(false);
            bakery.setVisible(false);
            coffeeNotice.setVisible(true);
            adeNotice.setVisible(false);
            smoothiesNotice.setVisible(false);
            waffleNotice.setVisible(false);
            bakeryNotice.setVisible(false);
            setBackground(new Color(236, 232, 231));

        });

        // 에이드 카테고리 이벤트
        KioskPanel.tabBtn[1].addActionListener(e -> {
            JButton button = (JButton) e.getSource();
            String str = button.getText();

            coffee.setVisible(false);
            ade.setVisible(true);
            smoothies.setVisible(false);
            waffle.setVisible(false);
            bakery.setVisible(false);
            coffeeNotice.setVisible(false);
            adeNotice.setVisible(true);
            smoothiesNotice.setVisible(false);
            waffleNotice.setVisible(false);
            bakeryNotice.setVisible(false);
            setBackground(new Color(236, 232, 231));
        });

        
     // 스무디 카테고리 이벤트
        KioskPanel.tabBtn[2].addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String str = button.getText();

               
                coffee.setVisible(false);
                ade.setVisible(false);
                smoothies.setVisible(true);
                waffle.setVisible(false);
                bakery.setVisible(false);
                coffeeNotice.setVisible(false);
                adeNotice.setVisible(false);
                smoothiesNotice.setVisible(true);
                waffleNotice.setVisible(false);
                bakeryNotice.setVisible(false);
                setBackground(new Color(236, 232, 231));
            }
        });
        
        // 와플 카테고리 이벤트
        KioskPanel.tabBtn[3].addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String str = button.getText();

         
                coffee.setVisible(false);
                ade.setVisible(false);
                smoothies.setVisible(false);
                waffle.setVisible(true);
                bakery.setVisible(false);
                coffeeNotice.setVisible(false);
                adeNotice.setVisible(false);
                smoothiesNotice.setVisible(false);
                waffleNotice.setVisible(true);
                bakeryNotice.setVisible(false);
                setBackground(new Color(236, 232, 231));
            }
        });
        
        
        // 빵 카테고리 이벤트
        KioskPanel.tabBtn[4].addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String str = button.getText();

         
                coffee.setVisible(false);
                ade.setVisible(false);
                smoothies.setVisible(false);
                waffle.setVisible(false);
                bakery.setVisible(true);
                coffeeNotice.setVisible(false);
                adeNotice.setVisible(false);
                smoothiesNotice.setVisible(false);
                waffleNotice.setVisible(false);
                bakeryNotice.setVisible(true);
                setBackground(new Color(236, 232, 231));
            }
        });
        
      
        

    }


    //------------------------------------------------------------------------------------------------------------------ 정렬, 텍스트, 컬러 속성
    class tabBtn extends JPanel {  // 상단 카테고리 탭 버튼 정렬
        tabBtn() {
            this.setBackground(new Color(236, 232, 231));
            this.setLayout(new GridLayout(1, 1, 1, 1));
            	
            for (int i = 0; i < tabBtn.length; ++i) { // 탭텍스트 + 이미지 아이콘
                tabBtn[i] = new JButton(KioskPanel.this.tabBtntext[i]);
               // tabBtn[i].setForeground(tabColor[i]);	색 조정
                tabBtn[i].setFocusable(false);
                tabBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 20));
                this.add(tabBtn[i]);
            }
        }
    }


    class coffeeMenuBtn extends JPanel { // 커피 버튼 정렬 
    	coffeeMenuBtn() {
            this.setLayout(new GridLayout(3, 3, 4, 4));
            this.setBackground(new Color(246, 244, 241));
            this.setVisible(true); // 초기값으로 커피 버튼으로 노출


            for (int i = 0; i < KioskPanel.this.coffeeBtns.length; ++i) {
                KioskPanel.this.coffeeBtns[i] = new JButton(KioskPanel.this.coffeeList[i], KioskPanel.this.coffeeIcon[i]); // 커피 이름 순서대로 넣기
                KioskPanel.this.coffeeBtns[i].setIconTextGap(10); // 버튼과 텍스트사이 간격
               // KioskPanel.this.coffeeBtns[i].setForeground(new Color(18, 26, 7)); // 컬러값 순서대로 넣기
                KioskPanel.this.coffeeBtns[i].setFocusable(false);
                if(i==5||i==3 || i==0)
                	KioskPanel.this.coffeeBtns[i].setFont(new Font("NanumBarunpen", Font.BOLD, 13));
                else
                	KioskPanel.this.coffeeBtns[i].setFont(new Font("NanumBarunpen", Font.BOLD, 16));

                this.add(KioskPanel.this.coffeeBtns[i]);
            }
        }
    }


    class adeMenuBtn extends JPanel { // 에이드 버튼 정렬 
        adeMenuBtn() {
            this.setLayout(new GridLayout(2, 2, 4, 4));
            this.setBackground(new Color(246, 244, 241));


            for (int i = 0; i < KioskPanel.this.adeBtn.length; ++i) {
                KioskPanel.this.adeBtn[i] = new JButton(KioskPanel.this.adeList[i],KioskPanel.this.adeIcon[i]);  // 에이드 이름 순서대로 넣기
                KioskPanel.this.adeBtn[i].setIconTextGap(10); // 버튼과 텍스트사이 간격
               // KioskPanel.this.adeBtn[i].setForeground(new Color(201, 59, 69));   글자 색깔 변경
                KioskPanel.this.adeBtn[i].setFocusable(false);
                if (i>1)
                	KioskPanel.this.adeBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 13));
                else if(i<2)
                	KioskPanel.this.adeBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 16));
                
                this.add(KioskPanel.this.adeBtn[i]);
            }
        }
    }

    class smoothieBtn extends JPanel { // 스무디 버튼 정렬
        smoothieBtn() {
            this.setLayout(new GridLayout(3, 2, 4, 4));
            this.setBackground(new Color(246, 244, 241));


            for (int i = 0; i < KioskPanel.this.smoothieBtn.length; ++i) {
                KioskPanel.this.smoothieBtn[i] = new JButton(KioskPanel.this.smoothieList[i],KioskPanel.this.smoothieIcon[i]); // 돈까스 이름 순서대로 넣기
                KioskPanel.this.smoothieBtn[i].setIconTextGap(10); // 버튼과 텍스트사이 간격
               // KioskPanel.this.smoothieBtn[i].setForeground(new Color(213, 100, 62));  // 컬러값 순서대로 넣기
                KioskPanel.this.smoothieBtn[i].setFocusable(false);
               if(i==1 || i==5)
            	   KioskPanel.this.smoothieBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 13));
               else
                KioskPanel.this.smoothieBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 15));
              
                this.add(KioskPanel.this.smoothieBtn[i]);
            }
        }
    }
    
    
    class waffleBtn extends JPanel { // 와플 버튼 정렬 
    	waffleBtn() {
            this.setLayout(new GridLayout(3, 2, 4, 4));
            this.setBackground(new Color(246, 244, 241));


            for (int i = 0; i < KioskPanel.this.waffleBtn.length; ++i) {
                KioskPanel.this.waffleBtn[i] = new JButton(KioskPanel.this.waffleList[i],KioskPanel.this.waffleIcon[i]); // 돈까스 이름 순서대로 넣기
                KioskPanel.this.waffleBtn[i].setIconTextGap(10); // 버튼과 텍스트사이 간격
               // KioskPanel.this.waffleBtn[i].setForeground(new Color(213, 100, 62));  // 컬러값 순서대로 넣기
                KioskPanel.this.waffleBtn[i].setFocusable(false);
                KioskPanel.this.waffleBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 15));

                this.add(KioskPanel.this.waffleBtn[i]);
            }
        }
    }
    
    
    class bakeryBtn extends JPanel { // 빵 버튼 정렬 
    	bakeryBtn() {
            this.setLayout(new GridLayout(3, 2, 4, 4));
            this.setBackground(new Color(246, 244, 241));


            for (int i = 0; i < KioskPanel.this.bakeryBtn.length; ++i) {
                KioskPanel.this.bakeryBtn[i] = new JButton(KioskPanel.this.bakeryList[i],KioskPanel.this.bakeryIcon[i]); // 돈까스 이름 순서대로 넣기
                KioskPanel.this.bakeryBtn[i].setIconTextGap(10); // 버튼과 텍스트사이 간격
              //  KioskPanel.this.bakeryBtn[i].setForeground(new Color(213, 100, 62));  // 컬러값 순서대로 넣기
                KioskPanel.this.bakeryBtn[i].setFocusable(false);
                if(i==3)
                	KioskPanel.this.bakeryBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 13));
                else
                	KioskPanel.this.bakeryBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 15));
                this.add(KioskPanel.this.bakeryBtn[i]);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    class Screen extends JPanel { // 테이블 속성 정렬 및 텍스트 컬러
        Screen() {
            this.setBackground(new Color(246, 244, 241));
            DefaultTableModel model = (DefaultTableModel) KioskPanel.this.table.getModel();
            table.setFillsViewportHeight(true);
            KioskPanel.this.table.setBounds(100, 300, 300, 230);
            KioskPanel.this.table.setRowHeight(20); // 열 높이
            KioskPanel.this.table.getTableHeader().setFont(new Font("NanumBarunpen", Font.PLAIN, 12));
            KioskPanel.this.table.setFocusable(false); // 열 높이

            Dimension width = new Dimension(580, 160); // 테이블 가로 사이즈 조정
            KioskPanel.this.table.setPreferredScrollableViewportSize(width);
            JScrollPane jp = new JScrollPane(KioskPanel.this.table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            jp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // 스크롤 생성
            
            this.add(jp);
            
        }
    }


    class selectPaymentBtn extends JPanel { // 하단 선택버튼 정렬

        selectPaymentBtn() {
            this.setBackground(new Color(246, 244, 241));
            this.setLayout(new GridLayout(1, 2, 3, 3));

            for (int i = 0; i < KioskPanel.this.SelectBtn.length; ++i) {
                KioskPanel.this.selectBtn[i] = new JButton(KioskPanel.this.
                        SelectBtn[i]);
                KioskPanel.this.selectBtn[i].setForeground(Color.BLACK);
                KioskPanel.this.selectBtn[i].setFocusable(false);
                KioskPanel.this.selectBtn[i].setFont(new Font("NanumBarunpen", Font.BOLD, 24));

                this.add(KioskPanel.this.selectBtn[i]);
            }
        }
    }
}




