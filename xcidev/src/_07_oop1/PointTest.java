package _07_oop1;

public class PointTest {
	public static void main(String[] args) {
		
//		Point2D pt = new Point2D();
//		
//		pt.setX(100);
//		pt.setY(200);
//		
//		System.out.println("x = " + pt.getX());
//		System.out.println("y = " + pt.getY());
		
		
		Point3D pt = new Point3D();
		
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
//		System.out.println("x = " + pt.getX());
//		System.out.println("y = " + pt.getY());
//		System.out.println("z = " + pt.getZ());
		
		pt.print();		// Point3D에 오버라이딩 안해주면 z 안나옴
						// Point2D의 print()가 사용된다
		
						// 오버라이딩 해주면 z 나옴
						// super.print(); 로 Point2D 나오게 만들기
		
		
	}
}
