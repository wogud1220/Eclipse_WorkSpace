
class Base {
	public Base() {
		System.out.println("Base() 생성자");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived() 생성자");
	}

}

public class Test {
	public static void main(String[] args) {
		Derived r = new Derived();// 1부모 2자식 순서로 생성됨

	}

}
