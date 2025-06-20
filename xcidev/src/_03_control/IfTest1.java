package _03_control;

public class IfTest1 {
	public static void main(String[] args) {
		
		
		int n = 1; // 남자:1, 여자:2
		
		if (n == 1 || n == 3) {
			System.out.println("남자입니더");
		} else if (n == 2 || n == 3){
			System.out.println("여자입니당");
		} else {
			System.out.println("error");
		}

		System.out.println("종료");	

	}
}
