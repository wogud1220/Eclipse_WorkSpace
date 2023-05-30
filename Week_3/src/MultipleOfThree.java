import java.util.*;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = input.nextInt();
		if (num % 3 == 0) { // 3으로 나누어서 나머지가 0이면 3의 배수
			System.out.println("3의 배수입니다.");
		} else
			System.out.println("3의 배수가 아닙니다.");
	}

}
