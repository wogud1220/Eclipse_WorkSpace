
public class ManagerTest {

	public static void main(String[] args) {
		Manager n = new Manager("Tom", "Seoul", 100000, 123456, 500000);
		//n객체 생성하며 매니저에 넘겨줌
		System.out.println(n.toString()); // 한줄로 출력
		n.test(); // 매니저 클래스의 test함수 실행

	}

}
