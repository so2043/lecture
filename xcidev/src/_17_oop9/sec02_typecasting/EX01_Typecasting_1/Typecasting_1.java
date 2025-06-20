package _17_oop9.sec02_typecasting.EX01_Typecasting_1;



// 클래스의 상속 관계
class A {}
class B extends A {} // B -> A
class C extends B {} // C -> B
class D extends B {} // D -> B


public class Typecasting_1 {
	public static void main(String[] args) {
		
		
		// 업캐스팅 (자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C();
		B bc = (B) new C();
		
		B bb = new B();
		A a = (A) bb;
		
		
		// 다운캐스팅 (수동 변환) : 캐스팅 할 수 없을 때 / 실행할 때 예외 발생
		A aa = new A();
//		B b = (B) aa;
//		C c = (C) aa;
		
		A ab = new B();
		B b = (B) ab;
//		C c = (C) ab;
		
		
		B bd = new D();
		D d = (D) bd;
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		
		
		
		
		
	}
}
