package _15_oop7;

public class PointTeset {
	public static void main(String[] args) {
		
		
		Point2D p1 = new Point2D();
		p1.x = 100;
		p1.y = 200;
		
		
		Point3D p2 = new Point3D();
		p2.x = 1000;
		p2.y = 2000;
		p2.z = 3000;
		
		Point2D p3 = new Point3D(); // 업캐스팅 (up casting)
		p3.x = 1000;
		p3.y = 2000;
//		p3.z = 3000;				// point3D 사용불가(접근불가)
		
		
//		Point3D p4 = new Point2D(); // 이렇게는 불가능
//		p3.x = 1000;
//		p3.y = 2000;
//		p3.z = 3000;
		
		Point3D p5 = (Point3D) p3;	// 다운캐스팅 (down casting) // 업캐스팅한걸 다시 다운캐스팅하는 개념
		p5.x = 1000;
		p5.y = 2000;
		p5.z = 3000;
		
		
		
	}
}
