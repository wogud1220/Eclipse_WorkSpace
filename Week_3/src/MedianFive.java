import java.util.*;

public class MedianFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("양수를 입력해주세요");
		int num[]= new int[5]; // 정수형 배열 5개 선언
		int i = 0;
		for (i = 0; i < 5; i++) { // 5번 반복
			num[i] = input.nextInt(); // num 배열에 하나씩 입력받음
		}
		Arrays.sort(num);  // 크기 순으로 정렬 -Arrays.sort();	Arrays.toString(num)하면 배열의 모든 요소 출력
		for (i = 0; i < 5; i++) {		//int num_list[]=Arrays.copyof(num, num.length)	하면 배열의 모든 값을 복붙함
			System.out.print(num[i] + ", "); // num배열 하나씩 출력
		}
		System.out.println("\n가운데 값은 " + num[i / 2]); // 그 배열의 가운데에 있는 값 출력
	}//main

}//class
