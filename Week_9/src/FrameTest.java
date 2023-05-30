import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("EXIT");
		JFrame f2 = new JFrame("Dispose");

		// f.setTitle("asdf");
		f1.setSize(300, 200); // 크기 조절
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 close하면 프로젝트 종료
		f1.setVisible(true); // 눈에 보이게 하기

		f2.setSize(500, 200); // 크기 조절
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창 close하면 사라지게 해라, 프로젝트 종료는 아님, 알림창에 사용
		f2.setVisible(true); // 눈에 보이게 하기

	}

}
