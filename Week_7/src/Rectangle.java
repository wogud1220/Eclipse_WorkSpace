
public class Rectangle implements Comparable {
	private int width = 0;
	private int height = 0;
	//private Rectangle (Rectangle);

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
		System.out.println(this);
	}

	public int getArea() {
		return width * height;
	}

	@Override
	public int compareTo(Object other) {
		Rectangle otherRect = (Rectangle) other; // 인터페이스의 추상메소드 구현

		if (this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}

}
