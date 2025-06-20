package _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack2;

import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	public void print() {
		
		A a = new A();
//		public int a = 1;
//		protected int b = 2;
//		int c = 3;
//		private int d = 4;
		
		
		System.out.print(a.a + " ");	// 다른 패키지는 public만 가능
//		System.out.print(a.b + " ");	// 다른 패키지 클래스 접근 불가능 
//		System.out.print(a.c + " ");	// 다른 패키지 클래스 접근 불가능
//		System.out.print(a.d + " ");	// private 라서 접근 불가능	
		
		System.out.println();
	}

}
