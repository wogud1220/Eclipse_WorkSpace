//모든 클래스 임포트하기
import java.util.Scanner;
public class QuadraticEq {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	//인풋으로 스캐너 명령어 쓰기
		double a;
		double b;
		double c;
		System.out.println("a의 값을 입력하세요");		//출력문구
		a=input.nextDouble();						//input으로 실수형값을 a에 저장
		System.out.println("b의 값을 입력하세요");
		b=input.nextDouble();
		System.out.println("c의 값을 입력하세요");
		c=input.nextDouble();

		double quadratic_equation=(b*b)-(4*a*c);		//루트안에 들어갈 식 정리
		
		double sqr=Math.sqrt(quadratic_equation);		//위의 식을 루트로 덮어씌움
		
		double s1=(-b+sqr)/2*a;		//루트로 덮어씌운 값에 나머지 근의 공식 대입.
		double s2=(-b-sqr)/2*a;
		
		System.out.println("근은 "+s1);		//출력
		System.out.println("근은 "+s2);
		
	}

}
