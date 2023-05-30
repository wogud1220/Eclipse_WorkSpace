import java.util.*;

public class KoreanChar {

	public static void main(String[] args) {
		char i = '\uAC00';			//'가'로 표시가능, 유니코드 시작
		do {
		System.out.print(i);
		i++;
		if(i=='\uB098')		//'나'로 표시 가능
			System.out.println("\n=============");
		else if(i=='\uB2e4' || i=='\uB77c' || i=='\uB9C8' || i=='\uBC14' || i=='\uC0AC' ||
				i=='\uC544' || i=='\uC790' || i=='\uCC28' || i=='\uCE74' || i=='\uD0C0' ||
				i=='\uD30C' || i=='\uD558')	//	다라마바사~일때 줄 바꾸기 시행
			System.out.println("\n--...--");
		} while(i<='\uD7A3');	//힣 만날 때까지
		
		
		
	}// main
}// class
