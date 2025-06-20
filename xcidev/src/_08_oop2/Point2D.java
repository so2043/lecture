package _08_oop2;

public class Point2D {
	
	int x;
	int y;
	
	// 기본생성사
	// default constructor
	public Point2D() {
		
		// constructor overloading
		// 젤 먼저 실행해야함 (아니면 오류남)
		this(1,2);
		System.out.println("Point2D() 수행");
	}
	
	
	// 매개변수 있는 생성자
	// 이걸 사용하려면 기본생성자 꼭 필요(아니면 오류남)
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 수행");
	}

	
	
	
	
	
	
}
