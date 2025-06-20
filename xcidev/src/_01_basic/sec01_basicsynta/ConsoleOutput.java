package _01_basic.sec01_basicsynta;

public class ConsoleOutput {
	public static void main(String[] args) {
		
		System.out.println("1번");
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println(2 + 4); //6
		System.out.println(4.6);
		System.out.println("문자" + 1); // 문자1
		System.out.println("문자" + 1 + 2); // 문자12
		System.out.println(1 + 2 + "문자"); // 3문자
		System.out.println();
		
		int a = 5;
		String b = "하세요";
		
		System.out.println(a); // 5
		System.out.println(b); // 하세요
		System.out.println("안녕" + b); // 안녕5
		System.out.println(a + "안녕" + b); //5안녕하세요
		System.out.println();
		
		
		System.out.println("2번");
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		// 반갑습니다7
		
		System.out.println("3번");
		System.out.printf("%d\n", 10);
		
		System.out.println();
		System.out.println();
		
	}

}
