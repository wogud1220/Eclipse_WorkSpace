
public class DynamicCallTest {

	public static void main(String[] args) {
		Animal Animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat(); // 각각의 객체 생성
		Animal.sound(); // 같은 메소드여도 객체에 따라 달라짐
		dog.sound(); // 같은 메소드여도 객체에 따라 달라짐
		cat.sound(); // 같은 메소드여도 객체에 따라 달라짐

	}

}
