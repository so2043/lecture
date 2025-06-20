package _02_operation.sec01_operation_1.EX01_ArithmeticOperator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		// page 87
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		// 2 + 3 + 5 = 10
		
		System.out.println(value7); // 2
		System.out.println(value8); // 5
		System.out.println(value9); // 10
		
		
	}

}
