
class Bank {
	public double getInterestRate() { // 오버라이드 하면 부모의 것을 재정의하여 씀
		return 0.0;
	}
}

class BadBank extends Bank { // 뱅크가 부모
	@Override // 부모의 것의 변환이 필요할 때 사용
	public double getInterestRate() { // 반환형, 이름, 매개변수가 같은 오버라이딩 써줌
		return 10.0;
	}
}

class NormalBank extends Bank {
	@Override
	public double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	@Override
	public double getInterestRate() {
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {

		BadBank b1 = new BadBank(); // 각 객체 생성
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율: " + b1.getInterestRate()); // 각 객체의 리턴함수 불러옴
		System.out.println("NormalBank의 이자율: " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율: " + b3.getInterestRate());
	}

}
