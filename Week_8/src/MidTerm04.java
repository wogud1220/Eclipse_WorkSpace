
public class MidTerm04 {
	
	private String model;
	private String make;
	private int id;
	static int numbers;		//정적 변수, 모든 객체가 공유함
	
	
	public MidTerm04(String m) {
		model=m;
		
		id=++numbers;
	}
	

	@Override
	public String toString() {
		return ("자동차 1대 생산 " + model + "  From:" + make);
	}


	public MidTerm04(String m, String c) {
		model=m;
		make=c;
		
		id=++numbers;
	}

	
	public static int getNumberOfCars() {
		return 1;
	}
	public static int ShowNumberOfCar() {
		return numbers;
	}
}
