import java.util.*;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date =new Date();
		int currentHour = date.getHours();
		int currentMonth=date.getMonth();
		System.out.println("현재 시간은 " + date);
		System.out.println("현재는 "+(currentMonth+1)+"월 입니다.");
		
		
		
		if (currentHour<11) {
			System.out.println("good morning");
		}
	}

}
