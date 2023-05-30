class Shape{
	public Shape() {
		System.out.println("shape 생성자");
	}
}

class RecTestt extends Shape{
public RecTestt() {
	System.out.println("Rectes생성자");
	}
}


public class RecTest {
	


	public static void main(String[] args) {
		
		RecTestt r=new RecTestt();
	}

}
