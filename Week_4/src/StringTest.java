import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String www = "www"; // 문자열과 비교할 문자열

		for (int i = 0; i < 100; i++) {
			System.out.println("문자열을 입력하세요 >");
			String ad = input.next(); // 문자열을 입력받음
			if (ad.length() < 3) { // 3글자 아래라면 비교 x
				System.out.println("비교할 수 없음 최소 3글자 이상 입력");
			} else if (ad.equalsIgnoreCase("quit")) { // 입력받은 것이 quit라면 프로그램 종료함
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}

			else { // 최소 3글자부터 비교하기 시작
				String ad_sub = ad.substring(0, 3); // 입력받은 문자열의 0,1,2번째의 인덱스에 있는 문자열을 잘라서 따로 저장, www로 시작하는지 알기 위해서

				if (ad_sub.equalsIgnoreCase("www")) { // 앞 3글자 따오 것이 대소비교 없이 www와 동일할 시에 실행
					System.out.println(ad + " 는 " + "'www'로 시작합니다.");

				}

				else { // www와 동일하지 않을 시에 실행
					System.out.println(ad + " 는 " + "'www'로 시작하지 않습니다.");

				}
			}
		}

	}// main

}// class
