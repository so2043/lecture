package _06_method;

public class MethodTest3 {
	public static void main(String[] args) {
		
		
		// 리턴값 O
		// 파라미터 X
		
		
		System.out.println("주사위 값은 : " + dice());
		
		
	}
	
	private static int dice() {
		return (int)(Math.random() * 6) + 1;
	}
}
