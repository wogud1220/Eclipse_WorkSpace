//모든 클래스 임포트
import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);		//입력값을 받기 위해서 선언해줌
												//Scanner scanner하면 year=scanner.nextFloat로 하기
		boolean a;									//참 거짓 구분 변수 생성
		double year;								//년도를 입력받고 저장할 변수 생성
		System.out.println("년도를 입력해주세요");		//출력 문구
		year = input.nextInt();		//
		a = (year%4==0);							//4로 나누어진다면 윤년 -> true가 된다.
		
		if(a) {		//a가 true라면
			System.out.println("윤년입니다.");
		}
		else {		//아니라면
			System.out.println("윤년이 아닙니다.");
		}
	}

}
