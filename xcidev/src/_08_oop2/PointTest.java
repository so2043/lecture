package _08_oop2;

public class PointTest {
	public static void main(String[] args) {
		
		Point2D pt = new Point2D();
		System.out.println("x = " + pt.x);
		System.out.println("y = " + pt.y);
		
		
		Point2D pt2 = new Point2D(100, 200);
		System.out.println("x = " + pt2.x);
		System.out.println("y = " + pt2.y);
		
		
		Point3D pt3 = new Point3D(10, 20, 30);
		System.out.println("x = " + pt3.x);
		System.out.println("y = " + pt3.y);
		System.out.println("y = " + pt3.z);
		
		
		Point3D pt4 = new Point3D();
		System.out.println("x = " + pt4.x);
		System.out.println("y = " + pt4.y);
		System.out.println("y = " + pt4.z);
		
	}
}
