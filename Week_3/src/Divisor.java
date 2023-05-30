import java.util.*;
public class Divisor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("양의정수를 입력하시오:");
		int num=input.nextInt();
		System.out.println(num+"의 약수는 다음과 같습니다.");
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
			
		}

	}

}
