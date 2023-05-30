import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int r;
		System.out.println("두개의 정수를 입력하시오(큰 수, 작은 수)");
		int x=input.nextInt();
		int y=input.nextInt();
		while(y!=0) {
			r=x%y;
			x=y;
			y=r;
		}
		System.out.println("최대 공약수는 " + x);
	}

}
