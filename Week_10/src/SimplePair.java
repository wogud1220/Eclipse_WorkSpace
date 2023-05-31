
public class SimplePair<T> {

	private T first, second;

	public SimplePair(T a, T b) {
		this.first = a;
		this.second = b;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());

	}

}
