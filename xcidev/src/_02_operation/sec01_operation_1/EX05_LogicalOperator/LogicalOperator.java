package _02_operation.sec01_operation_1.EX05_LogicalOperator;

public class LogicalOperator {
	public static void main(String[] args) {
		
		// page 100
		
		// 논리연산자 
		// AND (&&)
		System.out.println(true && true);	//t
		System.out.println(true && false);	//f
		System.out.println(true && (5<3));	//f
		System.out.println((5<=5) && (7>2));//t
		System.out.println();
		
		
		// OR (||)
		System.out.println(true || true);	//t
		System.out.println(true || false);	//t
		System.out.println(false || (5<3));	//f
		System.out.println((5<=5) || (7>2));//t
		System.out.println();
		
		// XOR (^)		
		System.out.println(true ^ true);	//f
		System.out.println(true ^ false);	//t
		System.out.println(false ^ (5<3));	//f
		System.out.println((5<=5) ^ (7>2));	//f
		System.out.println();
		
		// NOT(!)
		System.out.println(!true);			//f
		System.out.println(!false);			//t
		System.out.println(false || !(5<3));	//t
		System.out.println((5<=5) || !(7>2));	//t
		System.out.println();
		
		// 비트 연산자로 논리 연산 수행
		System.out.println(true & true);	//t
		System.out.println(true & false);	//f
		System.out.println(true | (5<3));	//t
		System.out.println((5<=5) | (7>2));	//t
		System.out.println();
		
		// 쇼트 서킷 사용 여부
		int value1 = 3;
		System.out.println(false && ++value1 > 6);	// 이미 false 뒤에 수행 안함
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); // 4>6 false => f & f => f
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6); // 이미 true 뒤에 수행 안함
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6); // 이건 양쪽 평가 모두 해야함 쇼트 서킷X
		System.out.println(value4);
		
	}

}
