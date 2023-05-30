import java.util.*;

public class Midterm02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Positive Number : ");
		int a = input.nextInt();
		int i = 1;

		
		if (a < 0) {
			System.out.println("It is not a positive value.");
		} 
		else System.out.println("The factors of " +a +" are : ");
		for(i=1;i<=a;i++) {
			
		 if (a % i == 0) {
				
			
			
			System.out.print(i + " ");}

			
		}

	}
}
