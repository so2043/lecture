package _02_operation.sec01_operation_1.EX02_BitwiseOperator;

public class BitwiseOperator {
	public static void main(String[] args) {
		
		// page 91
		
		
		int data = 13;
		
		// 10진수 값 => 2진수, 8진수, 16진수로 변환
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		
		
		// 2진수, 8진수, 16진수 => 10진수
		System.out.println(Integer.parseInt("1101", 2));
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("0D", 16));
		System.out.println();
		
		
		
	}

}
