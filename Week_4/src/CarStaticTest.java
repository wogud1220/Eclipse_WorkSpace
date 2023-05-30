
public class CarStaticTest {

	public static void main(String[] args) {
		CarStatic c1=new CarStatic("S600","white",80);	//생성자 
		CarStatic c2=new CarStatic("E700","black",20);
		
		System.out.println("생성된 차의 개수는 "+CarStatic.numbers);
		
		System.out.println("정적 메소드를 통한 생성된 차의 개수는" +CarStatic.getNumbersOfCars());
		
		//상수는 static을 정의하여 클래스 변수로 정의가 바람직함
		//차의 개수를 정적이 아닌 인스턴스로 한다면 객체마다 생성되므로
		//공간 낭비가됨.
		
		
	}

}
