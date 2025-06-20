package _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack2;

import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A{
	
	public void print() {
		
//		public int a = 1;
//		protected int b = 2;
//		int c = 3;
//		private int d = 4;
		
		
		System.out.print(a + " ");	// 자식 클래스는 다른 패키지에 있어도 객체 생성 없이 public 접근 가능
		System.out.print(b + " ");	// 자식 클래스는 다른 패키지에 있어도 객체 생성 없이 protected 접근 가능
//		System.out.print(a.c + " ");	// 다른 패키지 클래스 접근 불가능
//		System.out.print(a.d + " ");	// private 라서 접근 불가능	
	}

}
