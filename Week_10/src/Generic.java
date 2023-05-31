
public class Generic {
private T part;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generic<String> obj=new Generic();
		//Generic<int> obj=new Generic();
		Generic<Object> obj=new Generic();	//문자열, 정수 둘다 사용가능
		
		obj.set(new String("hello"));
		System.out.println((String)obj.get());
		
		obj.set(new Integer(10));
		System.out.println((int)obj.get());
	}
public void set(T a) {
	this.part=a;
}
public Object get() {
	return part;
}

}
