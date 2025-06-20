package _06_method;

public class MethodTest1 {
	public static void main(String[] args) {
		
		// overload
		
		print("정소영");
		print("배고파");
		print();
		
		// 위에 같은 명의 메서드를 사용하고 파라미터 형태가 다른경우
		// 오버로드
		
		
	}
	
	
	private static void print() {
		System.out.println("안녕");
	}


	private static void print(String name) { // arguments
		
		System.out.println("+==========+");
		System.out.println("|  " + name + "  |");		
		System.out.println("+==========+");
	}
}
