import java.util.*;
public class Month2Int {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("월의 이름을 입력하시오:");
		String month=input.next();
		
		switch(month) {
		case "jan":
		case "January":
			System.out.println("1월");
			break;
		case "February":
		case "feb":
			System.out.println("2월");
			break;
		case "March":
		case "mar":
			System.out.println("3월");
			break;
		}

	}

}
