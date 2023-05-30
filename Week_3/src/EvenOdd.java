import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		Scanner input=new Scanner(System.in);	//입력받기위해서
		int num=input.nextInt();
		if(num%2==0) {
			System.out.println("입력하신 정수는 짝수입니다.");
		}
		else if(num==0){
			System.out.println("0입니다.");
		}
		else {
			System.out.println("입력하신 정수는 홀수입니다.");
		}
		System.out.println("프로그램이 종료되었씁니다.");
		
	}
 
}
