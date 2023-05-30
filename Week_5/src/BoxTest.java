public class BoxTest {
	public static void main(String args[]) {
		Box obj1 = new Box(10, 20, 60);	//2개의 박스 생성
		Box obj2 = new Box(10, 20, 60);
		Box largest = obj1.whosLargest(obj1, obj2);//박스의 부피 비교 함수로 인자 전달
		System.out.println("더 큰 박스는: (" + largest.width + "," + largest.length + "," + largest.height + ")");
		System.out.println("매개변수 2개로 비교한 결과" + obj1.isSameBox(obj1, obj2));
		System.out.println("this를 사용한 결과" + obj1.isSameBox_1(obj2));
		System.out.println("obj1 == obj2: " + obj1.isSameBox_1(obj2));
	}
}