
public class MidTerm05Test {

	public static void main(String[] args) {
		//MidTerm05 obj[];
		MidTerm05 obj[]=new MidTerm05[2];
		obj[0]=new Dog();
		obj[1]= new Cat();
		
		
		for(int i=0;i<2;i++) {
			obj[i].sound();
		}

	}

}
