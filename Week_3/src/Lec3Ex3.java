import java.util.*;

public class Lec3Ex3 {

	public static void main(String[] args) {//소수 출력 함수
		int i;
		for(i = 1; i <= 50; i++) {
	
	            int count = 0;
	            
	            for(int j = 1; j <= i; j++) {
	                if(i%j == 0) {
	                    count++;		//2번만 나눠진다면 소수 ( 1과 자기 자신)
	                }
	            }
	            
	            if(count == 2) {
	                System.out.println(i);
	            }
	       }

}
}
