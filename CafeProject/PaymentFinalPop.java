import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.text.SimpleDateFormat;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


// 결제완료, 취소 확인 창 -> 결제완료후 다시 키오스크 첫화면으로 이동
public class PaymentFinalPop extends JFrame {
    // 최상위 패널
    Panel popFinal = new Panel(new BorderLayout());
    // 결제 정보 패널
    JPanel payinfoPanel = new JPanel(new BorderLayout());
    // 주문요청정보 패널
    JPanel ordertxtPanel = new JPanel(new BorderLayout());
    // 주문번호 패널
    JPanel numberPanel = new JPanel(new BorderLayout());
    // 결제완료시간 패널
    JPanel timePanel = new JPanel(new BorderLayout());
    // 하단 확인버튼 패널
    JPanel btnPanel = new JPanel(new BorderLayout());
    // 하단 확인버튼
    JButton confirmBtn = new JButton("<HTML><body style='text-align:center;'><br>확인<br><br></body></HTML>");
    // 결제완료문구
    JLabel completeTxt = new JLabel();
    // 주문번호
    JLabel orderNumber = new JLabel("1");
    // 취소문구
    JLabel cancelTxt = new JLabel();
    // 현재시간표기
    JLabel time = new JLabel();
    // 주문요청내용
    JTextArea ordertxtInfo = new JTextArea();
    
    

    
    
    
	private OrderNumber numberDev;

    public PaymentFinalPop(boolean btn, String orderText, 
    		boolean isChecked, boolean isSelected,
    		boolean isiceSelected,OrderNumber numberDev) {

    	this.numberDev=numberDev;
    	int count=numberDev.getOrderNumber();
    	
    	
    	
        //super("주문확인");
        // 로딩쓰레드
        LoadingPop loadingPop = new LoadingPop();
        Printpos printpos=new Printpos();
        Thread progress = new Thread(loadingPop);
        progress.start();


        setSize(600, 600);
        setLayout(new BorderLayout());
        // 결제정보 박스
        Box payinfo = Box.createVerticalBox();
        payinfo.add(Box.createVerticalStrut(30));
        // 결제완료
        Box numberBox = Box.createVerticalBox();
        numberBox.add(Box.createVerticalStrut(30));
        // 요청사항 박스
        Box ordertxt = Box.createVerticalBox();
        ordertxt.add(Box.createVerticalStrut(30));
        // 결제완료 시간 박스
        Box timeBox = Box.createVerticalBox();
        timeBox.add(Box.createVerticalStrut(10));
        // 하단버튼박스
        Box btnBox = Box.createVerticalBox();
        btnBox.add(Box.createVerticalStrut(4));


        // 결제정보 
        payinfoPanel.setBorder(
                new TitledBorder(new EtchedBorder(), " 결제정보 확인"));
        payinfoPanel.add(payinfo, BorderLayout.NORTH);

        popFinal.add(payinfoPanel); // 패널 타이블 박스, 판넬에 붙이기


        // 주문요청사항
        ordertxtPanel.setBorder(
                new TitledBorder(new EtchedBorder(), " 주문요청사항"));
        ordertxtPanel.add(payinfo, BorderLayout.CENTER);
        popFinal.add(ordertxtPanel);


        // 주문번호
        numberPanel.setBorder(
                new TitledBorder(new EtchedBorder(), "주문번호"));
        numberPanel.add(numberBox, BorderLayout.CENTER);
        popFinal.add(numberPanel);


        // 하단 결제완료 시간 출력
        timePanel.add(timeBox, BorderLayout.SOUTH);
        SimpleDateFormat simpleDate = new SimpleDateFormat("결제완료 : yyyy-MM-dd / HH시 mm분 ");
        String timeTxt = simpleDate.format(System.currentTimeMillis());
        time.setText(timeTxt);
        time.setForeground(Color.BLACK);
        timePanel.add(time);
        popFinal.add(timePanel);

        // 하단 확인버튼
        btnPanel.add(btnBox, BorderLayout.SOUTH);
        btnBox.setForeground(Color.BLACK);
        btnPanel.add(confirmBtn);
        popFinal.add(btnPanel);

        //  버튼 속성,이벤트
        confirmBtn.setFocusable(false);
        confirmBtn.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        confirmBtn.setSize(200, 60);
        confirmBtn.setLocation(100, 50);
        confirmBtn.addActionListener(e -> { // 확인버튼 눌렀을때 창을 종료함
            //  창꺼지고 첫화면 다시 시작
            dispose();
            new KioskMain();


        });
        add(popFinal); //결제판넬에 붙임

        // 박스 수평배치
        Box center = Box.createHorizontalBox();
        center.add(payinfoPanel);

        add(center, BorderLayout.CENTER);

        // 박스 수직배치
        Box vertical = Box.createVerticalBox();
        vertical.add(numberPanel);
        vertical.add(ordertxtPanel);

        vertical.add(timePanel);
        vertical.add(btnPanel);
        add(vertical, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


//---------------------------------------------결제 누를때

        if (btn) { // 결제시 출력되는 문구
        	
            //주문번호 나타내는 것 바꾸기
            
            orderNumber.setText(String.valueOf(count));

        	System.out.println("주문번호: "+count);
        	System.out.println("요청사항: "+orderText);
        	if(isiceSelected==true)
        		System.out.println("음료 온도: 차가움");
        	else if(isiceSelected==false)
    		System.out.println("음료 온도: 뜨거움");
    	if(isSelected==true)
    		System.out.println("결제 방식: 카드");
    	else if(isSelected==false)
    		System.out.println("결제 방식: 현금");
    	if(isChecked==true)
    		System.out.println("빨대가 필요 없습니다.");
    	else if(isChecked==false)
    		System.out.println("빨대가 필요합니다.");
        	
    	
    	
    	
    	
    	
    	
    	
      	//=================== 카드가 올바른지 판단, 짝수면 True, 홀수면 False
        PaymentDevice payDev =new PaymentDevice();
        boolean res = payDev.sendPaymentReq(1234, 23, 10);
        System.out.println(res);
        if(res==true)
        	System.out.println("카드의 정보가 올바름"+true);
        else {
        	System.out.println("카드의 정보가 잘못됨"+false);
        //올바르지 않으면 결제가 되면 안됨
        }
 
        
        
        
        
        
        
        
    	

            // 카드결제, 현금결제 라디오 버튼 옵션
            if(isSelected){ //true
                ordertxtInfo.append("/ 카드결제");
            }else{
                ordertxtInfo.append("/ 현금결제");
            }
            if(isiceSelected) {
            	ordertxtInfo.append("/ 차가움");
            }
            else {
            	ordertxtInfo.append("/ 뜨거움");
            }
            if(ordertxt!=null)	//내용이 있으면 추가적으로
            	ordertxtInfo.append("/"+orderText);
            // 일회용 체크박스 체크시
            if (isChecked) {
                ordertxtInfo.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
                ordertxtInfo.setForeground(new Color(213, 100, 62));
                ordertxtInfo.setColumns(1);
                ordertxtInfo.setRows(3);
                ordertxtInfo.setLineWrap(true);
                ordertxtInfo.setWrapStyleWord(true);
                completeTxt.setText("<HTML><body>결제완료!<br><br>메뉴가 준비되면 호출모니터로 안내해드립니다.</body></HTML>");
                ordertxtInfo.append("(일회용 빨대 필요없음 체크)카드의 정보가"+ res+"입니다."); // 결제창 체크박스 체크시 + (일회용 빨대 필요없음 체크)더해 출력
            } // 일회용 체크박스 체크안함
            else if(!isChecked){
                ordertxtInfo.setFont(new Font("NanumBarunpen", Font.PLAIN, 16)); // PaymetPop에서 넘겨 받은 요청사항 텍스트 크기 재설정
                ordertxtInfo.setForeground(new Color(213, 100, 62));
                ordertxtInfo.setColumns(1);
                ordertxtInfo.setRows(3);
                ordertxtInfo.setLineWrap(true);
                ordertxtInfo.setWrapStyleWord(true);
                completeTxt.setText("<HTML><body>결제완료!<br><br>메뉴가 준비되면 호출모니터로 안내해드립니다.</body></HTML>");
                ordertxtInfo.append("카드의 정보가"+res+"입니다"); // 결제창 체크박스 체크시 + (일회용 수저 필요없음 체크)더해 출력
            }
            
            
            if(res==false)
            	return;
            	
          

            //결제가 완료되었습니다.
            soundSuccess sucessbtn = new soundSuccess();// 결제완료창 효과음
            Thread sucesssound = new Thread(sucessbtn);
            sucesssound.start();



            completeTxt.setFont(new Font("NanumBarunpen", Font.PLAIN, 24)); // 결제완료 텍스트 속성
            completeTxt.setForeground(Color.BLACK);
            payinfoPanel.add(completeTxt); // 결제완료텍스트

            ordertxtPanel.add(ordertxtInfo); //요청사항
            ordertxtInfo.setEnabled(false);

            numberPanel.add(orderNumber); // 주문번호 텍스트 속성
            orderNumber.setFont(new Font("NanumBarunpen", Font.PLAIN, 30));
            orderNumber.setForeground(Color.BLACK);
            
        	
        	
        

        } else {
            payinfoPanel.add(cancelTxt); // 취소 텍스트 속성
            cancelTxt.setText("<HTML><body>취소되었습니다.<body> 다시 주문해주세요.</body></HTML>");
            cancelTxt.setFont(new Font("NanumBarunpen", Font.PLAIN, 24));
            cancelTxt.setForeground(Color.BLACK);

            soundCancel cancelbtn = new soundCancel();// 취소 효과음
            Thread cancelbtnsound = new Thread(cancelbtn);
            cancelbtnsound.start();

        }
    }
}


