package _02_operation.sec01_operation_1.EX03_ShiftOperator;

public class ShiftOperator {
	public static void main(String[] args) {
		
		// page 95
		
		// 산술시프트
		// <<
		System.out.println(3 << 1);
		System.out.println(-3 << 1);
		System.out.println(3 << 2);
		System.out.println(-3 << 2);
		System.out.println();
		
		// >>
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 2);
		System.out.println();
		
		
		// 논리 시프트
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
		
	}

}
