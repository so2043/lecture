package 연습문제._07장;


class B {
	
	
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int n) {
		System.out.println("정수 입력값 : " + n);
	}
	
	void print(double n) {
		System.out.println("실수 입력값 : " + n);
	}
	
	void print(String str) {
		System.out.println("문자열 입력값 : " + str);
	}
}


public class Unit07_02번 {
	public static void main(String[] args) {
		
		B a = new B();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");
		
	}
}
