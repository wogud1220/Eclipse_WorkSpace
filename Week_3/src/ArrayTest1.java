import java.util.*;
public class ArrayTest1 {

	public static void main(String[] args) {
		int s[] = new int[10];
		int  s2[]=new int[4];
		
		
		for(int i = 0; i < s.length ; i ++)
			s[i] = i;
		
		for(int i = 0; i < s.length ; i ++)
			System.out.print (s[i] + " ");
	}

}
/* 1	int[] s=new int[10];
 * 		int s[]=new int[10];
 * 
 *
 *2		int size=10;
 * 		int [] s=new int[size];*/
