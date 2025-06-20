package 연습문제._09장._06번;

class A {

	static int a;
	
	static {
        a = 8;  // 클래스가 처음 로딩될 때 딱 한 번 실행됨
    }
	
}



public class Unit09_06번 {
	public static void main(String[] args) {
		
		System.out.println(A.a); 	// 8
	}
}
