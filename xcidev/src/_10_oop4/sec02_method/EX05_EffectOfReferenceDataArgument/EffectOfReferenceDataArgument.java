package _10_oop4.sec02_method.EX05_EffectOfReferenceDataArgument;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3};
		
		
		// array 위치값이 전달되기 때문에 실제 값이 바뀜
		modifyData(array);
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;		
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a)); // 4,5,6
	}
}
