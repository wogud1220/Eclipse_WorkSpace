
public class CarTest {

	public static void main(String[] args) {

		Car mycar = new Car(); // 클래스 선언
		mycar.color = "blue"; // color 변수에 blue 대입
		mycar.gear = 2; // gear 변수에 2대입
		mycar.speed = 80; // 기본 속도 80*/
		
		mycar.speedUp(30); // speedup 함수와 매개변수로 30을 넣음
	    mycar.speedDown(10);
		System.out.println(mycar); // 문자열 리턴하는 함수를 불러옴, 출력문으로 함수 내의 문자열 실행

	}// main

}// class
