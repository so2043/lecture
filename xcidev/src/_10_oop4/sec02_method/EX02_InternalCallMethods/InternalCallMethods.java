package _10_oop4.sec02_method.EX02_InternalCallMethods;

public class InternalCallMethods {
	public static void main(String[] args) {
		
		
		print();
		
		int a = twice(3);		// 6
		System.out.println(a);
		
		double b = sum(a, 5.8);	// 11.8
		System.out.println(b);
		
	}
	
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int m, double n) {
		return m + n;
	}
	
	
	
}
