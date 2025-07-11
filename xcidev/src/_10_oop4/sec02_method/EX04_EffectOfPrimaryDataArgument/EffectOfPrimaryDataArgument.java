package _10_oop4.sec02_method.EX04_EffectOfPrimaryDataArgument;

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
	
		int a = 3;
		
		int result1 = twice(3);
		System.out.println(result1); // 6
		
		int result2 = twice(a);
		System.out.println(result2); // 6
		
		System.out.println(a);		// 3
		
	}
	
	public static int twice(int a) {
		a = a*2;
		return a;
	}
}
