
public class OuterClass {
private int value=10;
class InnerClass{
	public void myMethod() {
		System.out.println("외부 클래스의 private변수 값:"+value);
		
	}//myMethod
	
}

OuterClass(){
	InnerClass obj= new InnerClass();
	obj.myMethod();
}




}//OuterClass
