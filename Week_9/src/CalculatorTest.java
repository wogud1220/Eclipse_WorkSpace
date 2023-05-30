import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTest extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = { "Backspace", " ", " ", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=" };

    private double num1, num2, result;
    private char operator;
    private boolean isOperatorClicked = false;

    public CalculatorTest() {
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("");
        tField.setEnabled(false);
        panel.setLayout(new GridLayout(5, 5, 5, 5));
        buttons = new JButton[25];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].addActionListener(this);
            if (i >= 19) {
                buttons[i].setForeground(Color.red);
            } else {
                buttons[i].setForeground(Color.blue);
            }
            buttons[i].setBackground(Color.yellow);
            panel.add(buttons[i]);
        }

        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setTitle("GridLayout Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        CalculatorTest cal = new CalculatorTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                transnum(Integer.parseInt(command));	//문자열 이벤트로 들어오면 정수 형태로 변환시켜서 화면에 표시
                break;
            case ".":
                decimaldot();	//.찍기
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                Operator(command.charAt(0));
                break;
            case "sqrt":
                Sqrt();
                break;
            case "1/x":
                Inverse();
                break;
            case "+/-":
                Negative();
                break;
            case "Backspace":
                Backspace();
                break;
            case "CE":
                CE();
            case "C":
            	CE();
            	break;
            case "=":
                Equal();
                break;
        }
    }

    private void transnum(int digit) {	//숫자 입력시 텍스트에 표시
        if (isOperatorClicked) { 	//false니깐 else 실행
            tField.setText("");
            isOperatorClicked = false;
        }
        tField.setText(tField.getText() + digit);
    }

    private void decimaldot() {	//소수점 입력시
        if (isOperatorClicked) {
            tField.setText("");
            isOperatorClicked = false;
        }
        if (!tField.getText().contains(".")) {		//.이 없으면
            tField.setText(tField.getText() + ".");
        }
    }

    private void Operator(char op) {
        operator = op;	//연산자 저장
        num1 = Double.parseDouble(tField.getText());	//텍스트에 있는 값 실수로 변환하여 저장
        isOperatorClicked = true;
    }

    private void Sqrt() {		//루트 계산
        double number = Double.parseDouble(tField.getText());
        if (number >= 0) {
            double sqrtResult = Math.sqrt(number);
            tField.setText(String.valueOf(sqrtResult));
        } else {
            tField.setText("양수를 입력해주세요.");
        }
        isOperatorClicked = true;
    }

    private void Inverse() {		//역수 계산
        double number = Double.parseDouble(tField.getText());
        if (number != 0) {
            double inverseResult = 1 / number;
            tField.setText(String.valueOf(inverseResult));
        } else {
            tField.setText("0이 아닌 다른 수를 입력해주세요.");
        }
        isOperatorClicked = true;
    }

    private void Negative() {	//부호 바꾸기
        double number = Double.parseDouble(tField.getText());
        double negatedNumber = -number;
        tField.setText(String.valueOf(negatedNumber));
    }

    private void Backspace() {
        String currentText = tField.getText();
        if (currentText.length() > 0) {
            tField.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

    private void CE() {
        tField.setText("");
        num1 = 0;
        num2 = 0;
        isOperatorClicked = false;
    }

    private void Equal() {
        calculate();
        isOperatorClicked = true;
    }

    private void calculate() {
        num2 = Double.parseDouble(tField.getText());

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    tField.setText("0으로는 나눌 수 없습니다.");
                    return;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
        }

        tField.setText(String.valueOf(result));
    }
}