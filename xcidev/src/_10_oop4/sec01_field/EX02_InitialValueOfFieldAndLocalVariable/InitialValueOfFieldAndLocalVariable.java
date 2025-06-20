package _10_oop4.sec01_field.EX02_InitialValueOfFieldAndLocalVariable;


class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		
		// 필드 값들은 초기화하지 않아도 값이 강제로 초기화돼 출력 가능
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLovalVariable() {
		int k;
		
		// 이건 (초기화 안된)지역변수를 출력하는거라 오류남
//		System.out.println(k);
	}
}




public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		
		// 클래스를 활용하여 객체 생성
		A a = new A();
		
		
		// 객체 활용
		a.printFieldValue();
		
	}
}
