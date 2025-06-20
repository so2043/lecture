package _06_method;

public class MethodTest6 {
	public static void main(String[] args) {
		
		int[] a = {10};
		
		callref(a);
		System.out.println("3. callref : " + a[0]);
		System.out.println("종료");
	}

	private static void callref(int[] a) {		// call by reference
		System.out.println("1. callref : " + a[0]);
		a[0]++;
		System.out.println("2. callref : " + a[0]);
		
		
	}

}
