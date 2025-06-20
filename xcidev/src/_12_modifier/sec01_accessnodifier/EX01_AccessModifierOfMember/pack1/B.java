package _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack1;

public class B {

	public void print() {
		A a = new A();
//		public int a = 1;
//		protected int b = 2;
//		int c = 3;
//		private int d = 4;
		
		System.out.print(a.a + " "); // 같은 패키지라 접근 가능
		System.out.print(a.b + " "); // 같은 패키지라 접근 가능
		System.out.print(a.c + " "); // 같은 패키지라 접근 가능
//		System.out.print(a.d + " ");	// private 라서 접근 불가능	
		
		System.out.println();
	}
}
