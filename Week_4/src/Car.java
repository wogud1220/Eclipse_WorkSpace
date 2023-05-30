
public class Car {

	String color = "Red"; // 색상 필드 생성
	int gear; // 기어
	int speed; // 속도
	
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]"; // 문자열 리턴함

	}

	void changecolor(String chstring) {
		color = chstring; // 함수 실행시 매개변수로 들어온 값을 기존에 생성한 필드의 값에 넘겨줌
	}

	void changeGear(int chgear) {
		gear = chgear;
	}

	void speedUp(int chspeed) {
		speed = chspeed; // 30이 들어온다면 속도는 30으로 바뀜
	}

	void speedDown(int chspeed) {
		speed = chspeed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	

	
	
	
}
