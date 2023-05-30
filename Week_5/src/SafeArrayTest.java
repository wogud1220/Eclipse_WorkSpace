
public class SafeArrayTest {
	public static void main(String args[]) {
		SafeArray array = new SafeArray(3); // 인자로 3전달
		for (int i = 0; i < (array.length); i++) { // 0, 1, 2 실행
			array.setA(i, i * 10); // 0,0 1,10 2,20 반복
			System.out.print(array.getA(i) + " "); // get
		}

	}// main
}// class