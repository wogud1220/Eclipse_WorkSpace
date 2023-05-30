interface MyInterface {
	public abstract void myMethod1();	//앞에 반환형 빼도 됨

	default void myMethod2() {
		System.out.println("선언 안 한 MyMethod2");
	}
	static void print() {
		System.out.println( "인터ㅔ이스의 정적 메소드 호출");
	}
	
	
}

public class DefaultMethodTest implements MyInterface {
	public void myMethod1() {
		System.out.println("Method1()");
	}

	public static void main(String[] args) {
		DefaultMethodTest obj = new DefaultMethodTest();
		obj.myMethod1();
		obj.myMethod2();	//default로 구현한 것은 선언 안 해도됨.
		MyInterface.print();
	}
}
