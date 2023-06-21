import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// 결제 확인창 ( 결제금액확인,카드현금선택라디오버튼, 요청사항 입력, 체크박스옵션이 있음)
public class PaymentPop extends JFrame {

    // 최상단 패널
    JPanel payPanel = new JPanel(new BorderLayout());
    // 결제정보 패널
    JPanel payInfoPanel = new JPanel(new BorderLayout());
    // 카드,현금선택 패널
    JPanel cardcashPanel = new JPanel(new FlowLayout());
    // 뜨거움, 차가움 선택 패널
    JPanel hoticePanel = new JPanel(new FlowLayout());
    // 주문요구사항
    JPanel ordertxtPanel = new JPanel(new BorderLayout());
    // 체크박스 패널
    JPanel checkPanel = new JPanel(new BorderLayout());
    // 버튼영역 패널
    JPanel btnPanel = new JPanel(new BorderLayout());
    JLabel notice = new JLabel("");

    // 결제,취소버튼
    JButton payBtn, cancelBtn;
    JRadioButton cardRadio = new JRadioButton("카드결제");
    JRadioButton cashRadio = new JRadioButton("현금결제");
    
    //뜨거움, 차가움 선택 라디오 버튼
    JRadioButton hotRadio = new JRadioButton("뜨거움");
    JRadioButton iceRadio = new JRadioButton("차가움");

    // 주문요청사항 입력필드 // (JTextArea ordertxtArea)
    JTextArea ordertxtInfo = new JTextArea();
    JCheckBox check = new JCheckBox("포장손님 일회용 빨대 필요없어요 ",false);


    public PaymentPop() {
        super("주문확인");
        // 수직 배치박스 레이아웃 설정
        setLayout(new BorderLayout());
        // 결제정보박스
        Box payBox = Box.createVerticalBox();
        payBox.add(Box.createVerticalStrut(20));
        // 카드,현금선택 박스
        Box cardcashBox = Box.createVerticalBox();
        cardcashBox.add(Box.createVerticalStrut(50));
        
        // 뜨거운거, 차가운거 선택 박스
        Box hoticebox = Box.createVerticalBox();
        hoticebox.add(Box.createVerticalStrut(40));
        
        // 주문요구사항박스
        Box ordertxtBox = Box.createVerticalBox();
        ordertxtBox.add(Box.createVerticalStrut(20));
        // 체크박스박스
        Box checkBox = Box.createVerticalBox();
        checkBox.add(Box.createVerticalStrut(10));
        // 버튼박스
        Box btnBox = Box.createVerticalBox();
        btnBox.add(Box.createVerticalStrut(20));


        // 패널 타이틀 및 테두리선
        payInfoPanel.setBorder(new TitledBorder(new EtchedBorder(), "주문정보를 확인하세요 "));
        payInfoPanel.add(payBox, BorderLayout.CENTER);

        // 결제 총금액 가져오기
        payInfoPanel.add(KioskPanel.textField);

        // 요청사항 글씨 설정
        ordertxtInfo.setFont(new Font("NanumBarunpen", Font.PLAIN, 24));
        ordertxtInfo.setForeground(new Color(213, 100, 62));
        ordertxtInfo.setColumns(1);
        ordertxtInfo.setRows(3);
        ordertxtInfo.setLineWrap(true);
        ordertxtInfo.setWrapStyleWord(true);

        //  카드현금 선택 라디오버튼 속성
        cardcashPanel.setBorder(new TitledBorder(new EtchedBorder(), " 카드 or 현금를 선택하세요 "));
        cardcashPanel.add(cardcashBox,LEFT_ALIGNMENT);
        ButtonGroup bg = new ButtonGroup();
        bg.add(cardRadio);
        bg.add(cashRadio);
        // 기본설정은 카드가 선택되어있음
        cardRadio.setSelected(true);
        cardcashPanel.add(cardRadio);
        cardcashPanel.add(cashRadio);
        cardcashPanel.setFont(new Font("NanumBarunpen", Font.PLAIN, 40));
        cardcashPanel.setForeground(Color.BLACK);
        // 라디오버튼
        cardRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean isSelected = cardRadio.isSelected();
            }
        });
        
        
        
        hoticePanel.setBorder(new TitledBorder(new EtchedBorder(), " 음료의 온도를 선택하세요 "));
        hoticePanel.add(cardcashBox,LEFT_ALIGNMENT);
        ButtonGroup temperature = new ButtonGroup();
        temperature.add(iceRadio);
        temperature.add(hotRadio);
        // 기본설정은 차가움 선택되어있음
        iceRadio.setSelected(true);
        hoticePanel.add(iceRadio);
        hoticePanel.add(hotRadio);
        hoticePanel.setFont(new Font("NanumBarunpen", Font.PLAIN, 40));
        hoticePanel.setForeground(Color.BLACK);
        //차가움 라디오 버튼
        iceRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean isiceSelected = iceRadio.isSelected();
            }
        });

        // 중간추가 요구사항 기재
        ordertxtPanel.add(ordertxtBox, BorderLayout.CENTER);
        // 주문요구사항 적는 영역
        ordertxtPanel.add(ordertxtInfo);
        ordertxtPanel.setFont(new Font("NanumBarunpen", Font.PLAIN, 46));
        ordertxtPanel.setForeground(Color.BLACK);

        Border border = BorderFactory.createTitledBorder(" 요청사항을 적어주세요.");
        ordertxtPanel.setBorder(border);

        // 체크박스, PaymentPopFinal에 전달
        checkPanel.add(checkBox, BorderLayout.SOUTH);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 boolean isChecked = check.isSelected();
            }
        });
        checkPanel.add(check);

        // 취소하기 버튼 // 결제하기 버튼
        btnPanel.add(btnBox, BorderLayout.CENTER);
        cancelBtn = new JButton("취소하기");
        cancelBtn.setSize(200, 60);
        cancelBtn.setLocation(100, 0);
        cancelBtn.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        cancelBtn.setForeground(Color.BLACK);
        payBtn = new JButton("결제하기");
        payBtn.setSize(200, 60);
        payBtn.setLocation(300, 0);
        payBtn.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        payBtn.setForeground(Color.BLACK);

        btnPanel.add(payBtn);
        btnPanel.add(cancelBtn);
        btnPanel.add(notice);

        payPanel.add(payInfoPanel);
        payPanel.add(cardcashPanel);
        payPanel.add(hoticePanel);
        payPanel.add(ordertxtPanel);
        payPanel.add(checkPanel);
        payPanel.add(btnPanel);
        add(payPanel);

        // 패널 수직으로 배치
        Box center = Box.createVerticalBox();
        center.add(payInfoPanel);
        center.add(cardcashPanel);
        center.add(hoticePanel);
        center.add(ordertxtPanel);
        center.add(checkPanel);
        center.add(btnPanel);

        add(center, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 키오스크 판넬 사이즈
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


//------------------------------------- 버튼 이벤트
        // 결제버튼 이벤트
        payBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
        
                
               
                // 주문정보값을 받아서 넘김
                String str  = "";
                if(ordertxtInfo != null && !"".equals(ordertxtInfo.getText()) && ordertxtInfo.getText().length() > 0) {
                    str = ordertxtInfo.getText();
                }
               // System.out.println();
                
                dispose();
                // 체크박스 값, 카드현금 라디오버튼 값 -> cardcashPop으로 전달
                new CardcashPop(str, check.isSelected(), cardRadio.isSelected(),iceRadio.isSelected());
            }
        });

        cancelBtn.addActionListener(new ActionListener() { // 취소 버튼 이벤트
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}



