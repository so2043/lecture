package 연습문제._13장._2번;



class A {
	class B{
		void bcd() {
			System.out.println("이너 클래스의 메서드");
		}
	}
}

public class Unit13_2 {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.bcd();
	}
}
