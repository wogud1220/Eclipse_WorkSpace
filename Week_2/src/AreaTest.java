//모든 클래스 임포트
import java.util.Scanner;


public class AreaTest {

	public static void main(String[] args) {
		System.out.println("반지름을 입력해주세요");
		Scanner input=new Scanner(System.in);		//스캐너 클래스를 인풋으로 사용
		double area=input.nextDouble();		//실수하나를 입력받아서 area에 저장
		double PI=3.141592;
		
		System.out.println("반지름이 "+(area)+"인 원의 면적은 "+(area*area)*PI+"입니다.");
	}

}
