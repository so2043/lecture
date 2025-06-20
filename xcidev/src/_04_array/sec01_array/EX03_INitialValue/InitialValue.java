package _04_array.sec01_array.EX03_INitialValue;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		
	
		int value1;
//		System.out.println(value1);
		
		int[] value2;
//		System.out.println(value2);
		
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null;
		System.out.println(value4);
		System.out.println();
		
		
		// 힙 메모리의 초깃값
		// 기본 자료형 배열
		boolean[] array1 = new boolean[3];			// boolean 초기값 false
		for (int i=0; i<3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		int[] array2 = new int[3];					// int 초기값 0
		for (int i=0; i<3; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		double[] array3 = new double[3];			// double 초기값 0.0
		for (double x : array3) System.out.print(x + " ");
		System.out.println();
		System.out.println();
		
		
		// 참조 자료형 배열
		String[] array4 = new String[3];			// String은 참조 자료형 이라 초기값 null 임
		for (String x : array4) System.out.print(x + " ");
		
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
	}
}
