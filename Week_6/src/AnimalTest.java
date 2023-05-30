class AnimalLion {
	private int weight;
	private String picture;

	void eat() {
		System.out.println("eat()가 호출되었음");
	}

	void sleep() {
		System.out.println("sleep()가 호출되었음");
	}

}

class Lion extends AnimalLion {
	private int legs;

	void roar() {
		System.out.println("roar()가 호출되었음");
	}
}

class Eagle extends AnimalLion {
	private int wings;

	void fly() {
		System.out.println("fly()가 호출되었음");
	}

}

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();		//각 객체 생성
		Eagle eagle = new Eagle();
		
		lion.eat();		//부모 클래스의 메소드  사용 가능
		lion.sleep();
		lion.roar();	//본인의 메소드 사용 가능
		
		eagle.eat();
		eagle.sleep();
		eagle.fly();
		
		
	}

}
