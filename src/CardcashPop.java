import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardcashPop extends JFrame {

    // 최상위 패널
    JPanel basicPanel = new JPanel(new BorderLayout());
    // 안내문구 패널
    JPanel txtPanel = new JPanel();

    // 버튼영역 패널, 좌우로 정렬을 위해 FlowLayout 사용

    JPanel btnPanel = new JPanel(new FlowLayout());
    JLabel notice = new JLabel("");

    JLabel cardTxt = new JLabel("카드 결제하시겠습니까? 카드를 투입구에 넣어주세요.");
    JLabel cashTxt = new JLabel("현금 결제하시겠습니까? 현금을 투입구에 넣어주세요.");

    JButton cancelBtn, payBtn;

    // PaymentPop에서 받은 주문요청사항
    String ordertxtInfo;
    // 라디오버튼 카드선택시
    boolean isSelected;
    //따듯함 차가움 선택시
    boolean isiceSelected;
    // 체크박스 선택시
    boolean isChecked;
   

    public CardcashPop(String ordertxtInfo, boolean isChecked, boolean isSelected,boolean isiceSelected) {
        super(" 결제방법 선택 ");

        setLayout(new BorderLayout());
        cardTxt.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        cardTxt.setForeground(Color.BLACK);
        cashTxt.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        cashTxt.setForeground(Color.BLACK);

        // 텍스트
        Box txtBox = Box.createVerticalBox();
        txtBox.add(Box.createVerticalStrut(100));
        // 버튼 박스
        Box btnBox = Box.createVerticalBox();
        btnBox.add(Box.createVerticalStrut(40));

        txtPanel.add(txtBox, BorderLayout.CENTER);

        // 카드 현금체크시 출력되는 문구
        if(isSelected) {
            txtPanel.add(cardTxt);
        } else{
            txtPanel.add(cashTxt);
        }
        add(basicPanel);

        // 취소하기 버튼 // 결제하기 버튼
        btnPanel.add(btnBox, BorderLayout.CENTER);
        cancelBtn = new JButton("취소하기");
        cancelBtn.setFocusable(false);
        cancelBtn.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        cancelBtn.setForeground(Color.BLACK);
        payBtn = new JButton("결제하기");
        payBtn.setFocusable(false);
        payBtn.setFont(new Font("NanumBarunpen", Font.PLAIN, 16));
        payBtn.setForeground(Color.BLACK);
        btnPanel.add(cancelBtn);
        btnPanel.add(payBtn);

        basicPanel.add(notice);
        basicPanel.add(txtPanel);
        basicPanel.add(btnPanel);
        add(basicPanel);
        // 패널 수직으로 배치
        Box center = Box.createVerticalBox();
        center.add(txtPanel, BorderLayout.CENTER);
        center.add(btnPanel, BorderLayout.CENTER);
        add(center, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 키오스크 판넬 사이즈
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        // PaymentPop에서 전달받은 주문요청사항, 체크박스, 라디오 값
        this.ordertxtInfo = ordertxtInfo;
        this.isSelected = isSelected;
        this.isChecked = isChecked;
        this.isiceSelected=isiceSelected;	//불린값

        // 결제버튼 이벤트
        payBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // true일때 결제, txtArea 주문요청사항, 체크값전달
                dispose();
                
                OrderDevice numberDev=new OrderDevice();
                
                new PaymentFinalPop(true, ordertxtInfo, isChecked,
                		isSelected,isiceSelected,numberDev);
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}



