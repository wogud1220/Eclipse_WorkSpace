
public class CarStatic {

	
	private String model;
	private String color;
	private int speed;
	private int id;
	static int numbers;		//정적 변수, 모든 객체가 공유함
	
	
	public CarStatic(String m, String c, int s) {
		model=m;
		color=c;
		speed=s;
		
		id=++numbers;
	}

	public static int getNumbersOfCars() {
		return numbers;
	}
	
}
