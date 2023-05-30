import java.util.*;
public class MidTerm01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("width of square :");
		int width=input.nextInt();
		System.out.print("height of square :");
		int height=input.nextInt();
		double area=width*height;
		double length=width*2 +height*2;
		
		System.out.println("Arae of square : " + area);
		System.out.println("Length of square : " + length);

	}

}
