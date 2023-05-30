
public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn; // 프라이빗 변수

	public Employee(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}// 매니저에서 넘겨받은 매개변수 super로 사용해서 현재 객체에 저장

	@Override
	public String toString() { // 한줄로 출력 문장
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}

	/**
	 * @return the rrn
	 */
	public int getRrn() { // 프라이빗 변수를 밖에서 쓰기 위해서 생성
		return rrn;
	}

	/**
	 * @param rrn the rrn to set
	 */
	public void setRrn(int rrn) {// 프라이빗 변수를 밖에서 쓰기 위해서 생성
		this.rrn = rrn;
	}

}
