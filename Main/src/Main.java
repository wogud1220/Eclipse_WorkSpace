import java.util.*;

public class Main {
	public static void main(String args[]) {
		TestB b = new TestB();
		int val = 100;
		b.val = 200;
		b.increment();		//b.val=201
		b.decrement(val);	//99 no return
		System.out.println(b.val); // 답: ( 201)
		System.out.println(val); // 답: ( 100)
	}
}

class TestB {
	public int val;

	public void increment() {
		val++;
	}

	public void decrement(int val) {
		val--;
	}
}