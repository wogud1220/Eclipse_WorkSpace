
public class Manager extends Employee {	//부모 클래스 연장
	private int bonus;	//프라이빗 보너스
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);	//부모의 변수 가져옴
		this.bonus=bonus;	//넘겨받은 보너스 현재 객체에 저장
		setRrn(rrn);	//rrn은 프라이빗이니 setter생성
	}
	
	
	
	void test() {	//출력 구문
		System.out.println("name= "+name);
		System.out.println("address= "+address);
		System.out.println("salary= "+salary);
		System.out.println("rrn= "+getRrn());//프라이빗이니 getter로 넘겨줌
		System.out.println("bonus= "+bonus);
	}

}
