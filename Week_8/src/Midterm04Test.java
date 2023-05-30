
public class Midterm04Test {

	public static void main(String[] args) {
		
		MidTerm04 obj1=new MidTerm04("A3","seoul");
		MidTerm04 obj2=new MidTerm04("A1", "busan");
		MidTerm04 obj3=new MidTerm04("A3","china");
		
		int num=obj1.getNumberOfCars();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	
		System.out.println("Num of Car:" +MidTerm04.numbers);
		System.out.println("누적 생산량 :"+MidTerm04.ShowNumberOfCar());
	}



}
