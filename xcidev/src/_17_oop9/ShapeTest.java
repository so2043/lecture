package _17_oop9;

public class ShapeTest {
	public static void main(String[] args) {
	
		
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
		
		
		
	}

	private static void printArea(Shape s) {
		
		s.area();
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름 " + c.r + "인 원의 넓이는 " + c.res + "입니다.");
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("가로 : " + r.w + ", 세로 : " + r.h + "인 사각형 넓이는 " + r.res );
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("가로 : " + t.w + ", 세로 : " + t.h + "인 삼각형 넓이는 " + t.res );
		}
		
	}
}
