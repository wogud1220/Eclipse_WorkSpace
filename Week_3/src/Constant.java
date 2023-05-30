import java.util.Scanner;
public class Constant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double KM_PER_MILE =1.609344;//상수로 만들기 위해서 final 선언
		double km;
		double mile =60.0;
		km=KM_PER_MILE*mile;
		System.out.println(km);

	}

}
