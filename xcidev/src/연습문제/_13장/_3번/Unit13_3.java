package 연습문제._13장._3번;


class A {
	void print() {
		System.out.println("클래스 A 메서드");
	}
	
	class B {
		void print() {
			System.out.println("클래스 B 메서드");
		}
		
		void bcd() {
			
			A.this.print();
			
		}
	}
}

public class Unit13_3 {
	public static void main(String[] args) {
		
		
		A a = new  A();
		A.B ab = a.new B();
		ab.bcd();
	}

}
