interface Flyable {
	void fly();
}

interface Drivable {
	void drive();
}

public  class MidTerm06 implements Flyable,Drivable{

	public void fly() {
		System.out.println("I'm flying");
	}
	public void drive() {
		System.out.println("I'm driving");
	}
	
	
}
