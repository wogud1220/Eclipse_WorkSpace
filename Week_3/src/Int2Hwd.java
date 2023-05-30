import java.util.*;
public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int  num=input.nextInt();
		switch(num) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		}

	}

}
