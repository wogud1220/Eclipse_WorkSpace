
public class MyCounterTest {

	public static void main(String[] args) {
		MyCounter obj=new MyCounter();
		System.out.println(obj.value1);
		obj.inc(obj);
		System.out.println(obj.value);

	}

}
