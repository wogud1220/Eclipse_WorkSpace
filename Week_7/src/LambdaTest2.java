interface MyInterface2{
	public void calculate(int x, int y);
}




public class LambdaTest2 {

	public static void main(String[] args) {
		MyInterface2 hello= (a,b) -> {
		int result=a*b;
		System.out.println(result);
		};
		hello.calculate(10,20);
	}

}
