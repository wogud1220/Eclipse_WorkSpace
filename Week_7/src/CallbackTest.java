import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.*;

class MyClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {

		System.out.println("beep");
	}
}

public class CallbackTest {

	public static void main(String[] args) {
		ActionListener listener = new MyClass(); // 인터페이스는 new 안됨
		Timer t = new Timer(1000, (event) -> {
			System.out.println("beep1"); // 람다식 변환해서 두줄 가능
			System.out.println("beep2");
		});
		t.start();
		for (int i = 0; i < 5; i++)
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
			}
	}
}