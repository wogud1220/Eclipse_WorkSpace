
public class SafeArray {
	private int a[]; // private 변수이니 setter, getter 생성
	public int length;

	public SafeArray(int size) {
		a = new int[size]; // 3들어옴
		length = size; // 3 들어옴

	}

	public int getA(int index) { // 0,1,2가 들어오게 됨
		if (index < length && index >= 0) {// 0<=index<3 만족
			return a[index];// a는 private변수이니 getter을 public으로 하여 반환
		} else
			System.out.println("범위를 넘어섬");
		return -1;
	}

	public void setA(int index, int value) { // 0,0 1,10 2,20 들어옴
		if (index < length && index >= 0) { // index가 3보다 작고 0이상이면
			a[index] = value; // 해당 인덱스에 value 대입
			return;
		} else
			System.out.println("배열의 인덱스가 범위 벗어남");
		return;
	}
}
