class  Shape {
	protected int x, y;

	public void draw() {
		System.out.println("ShapeDraw");

	}
}

class Rectangle extends Shape {
	private int width, height;

	public void draw() {
		System.out.println("RecDraw");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1, s2;
		s1 = new Shape();
		s2 = new Rectangle(); // (x,y)<=(x,y,w,h) 이기때문에 상향 형변환 해줘야함
		s2.x = 0;
		s2.y = 0;
		System.out.println("x=" + s2.x);
		System.out.println("y=" + s2.y);
		// s2.setWidth(20);
		s1.draw();
		s2.draw();
		((Rectangle)s2).draw();	//Shape 함수에 draw없어도 됨
		((Rectangle) s2).setWidth(100); // 상향 형변환
		System.out.println(((Rectangle) s2).getWidth());
		Shape.draw();	//Shpae클래스에 static붙이면됨
	}

}
