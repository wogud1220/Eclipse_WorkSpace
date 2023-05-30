import java.util.*;
public class Lec3Ex1 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해주세요");
		int a=input.nextInt();
		int b=input.nextInt();
		if(a>b) {
			System.out.println("a가 더 큽니다.");
		}
		else if(a==b) {
			System.out.println("같은 값입니다.");
		}
		else {
			System.out.println("b가 더 큽니다.");
		}
	}//main

}//class
 
