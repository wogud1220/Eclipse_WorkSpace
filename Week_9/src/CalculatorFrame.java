import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

import javax.swing.*;

public class CalculatorFrame extends JFrame {

	//클래스의 멤버 변수
	String operand;			//피연산자	
	String operator;		//연산자
	
	public CalculatorFrame() {
    
    	//Frame 크기, 위치, 종료 설정
		setSize(500, 500);					//Frame 크기 가로 500, 세로 500
		setLocationRelativeTo(null);		//실행화면 위치 : 중간
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		//프로그램 정상 종료
		
        //textField 생성자 생성 : 텍스트 작성 가능
		var textField = new JTextField();
		
        //텍스트 작성 위치를 BorderLayout의 북쪽(위쪽)에 지정
		add(textField, BorderLayout.NORTH);
		
        //panel 생성자 생성 : GirdLayout을 4x4로 생성
        //공간 생성
		var panel = new JPanel( new GridLayout(4, 4) );
		
        //문자열 배열 buttons를 생성한 후 계산기 위의 값 저장
        //GirdLayout은 4개까지 한 줄로 생성됨을 이용
		String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };
		
        //buttons 문자열 배열값을 읽어서 하나씩 button으로 값을 읽는다
		for(String button : buttons) {
        	//buttons의 값을 버튼으로 만든다.
			var btn = new JButton(button);
            //버튼의 라벨 크기 조정
            //버튼의 폰트는 Arial, 글자 크기는 30으로 설정
            btn.setFont(new Font("Arial", Font.PLAIN, 30));
            btn.setForeground(Color.blue);
    
			//각 버튼이 눌러졌을 때 어떤 일을 할 것인가를 정의한다.
            //e : 액션 이벤트 객체
			btn.addActionListener(e -> {
            	//숫자 버튼이 눌렸을 경우
				if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
					//현재 textField에 적혀있는 숫자 문자열과 입력한 숫자 문자열끼리 합치기
					textField.setText(textField.getText() + button);
				}
                //Clear 버튼을 눌렀을 경우
				else if (button.equals("Clear")) {
					//현재 textField에 있는 숫자, 피연산자, 연산자 초기화
					textField.setText("");
					operand = "";
					operator = "";
				}
                // =버튼을 눌렀을 경우
				else if (button.equals("=")) {
                	//operand에 저장된 수, 즉 전에 입력한 숫자 문자열을 Long타입으로 변환해 op1에 저장
					long op1 = Long.valueOf(operand);
                    //텍스트 필드에 있는 값을 Long타입으로 변환해 op2에 저장
					long op2 = Long.valueOf(textField.getText());
					
                    //입력받은 연산자로 연산하기
                    //연산한 값을 textField에 setText하기
					if (operator.equals("+")) {								//해당 operator로 연산
						textField.setText(String.valueOf(op1 + op2));		//op1 + op2
					} else if (operator.equals("-")) {
						textField.setText(String.valueOf(op1 - op2));						
					} else if (operator.equals("*")) {
						textField.setText(String.valueOf(op1 * op2));						
					} else if (operator.equals("/")) {
						textField.setText(String.valueOf(op1 / op2));						
					}
				}
                //연산자 버튼을 눌렀을 경우
				else {
					// 현재 입력된 피연산자 저장
					operand = textField.getText();
                    //지금 입력한 연산자를 operator에 저장
					operator = button;
                    //새로운 피연산자를 입력받기 위해 textField 초기화
					textField.setText("");
				}	
			});
			//이렇게 만들어진 버튼 객체를 컨테이너인 panel에 담는다
			panel.add(btn);
		}// for문 end
		
		add(panel);
	}
	
    //계산기를 실행할 main함수
	public static void main(String[] args) {
    
    	//위의 CalculatorFrame의 정보를 가진 객체 생성
		var frame = new CalculatorFrame();
        // == CalculatorFrame frame = new CalculatorFrame();
		
        //계산기 화면 실행
		frame.setVisible(true);
		
	}

}