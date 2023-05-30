
public class CarObjectTest {

	public static void main(String[] args) {
		CarObject firstCar=new CarObject("HW111");
		CarObject secondCar=new CarObject("HW111");
		
		if(firstCar.equals(secondCar)) {
			System.out.println("같습니다.");
		}
		else
			System.out.println("다른 차입니다.");
	}

}