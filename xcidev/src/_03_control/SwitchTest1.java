package _03_control;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		
		int n = 3;
		
		switch (n) {
		case 1 :
		case 3 :
			System.out.println("남자"); 
			break;
		case 2 :
		case 4 : 
			System.out.println("여자"); 
			break;
		default : 
			System.out.println("Error"); 
			break; 
		}
		
		
		
		switch (n) {
		case 1,3 -> System.out.println("남자");
		case 2,4 -> System.out.println("여자");
		default  -> System.out.println("Error"); 
		}
		
		
		System.out.println("종료");

	}
}
