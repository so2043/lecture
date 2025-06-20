package _03_control.sec04_controlkeyword.EX02_ContinueControlKeyword;

public class ContinueControlKeyword {
	public static void main(String[] args) {
		
		// 1번
		for (int i=0; i<10; i++) {
			continue;
//			System.out.println(i + " "); 
		}
		
		
		// 2번
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");	// 0 1 2 3 4 5 6 7 8 9
			continue;
		}

		
		// 3번
		for (int i=0; i<10; i++) {
			if (i==5) continue;
			System.out.print(i + " "); 	// 0 1 2 3 4 6 7 8 9
		}
		System.out.println();
		System.out.println();
		
		// 4번
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j == 3) continue;
				System.out.print(i + "," + j + " ");	// 00 01 02 04 10 11 12 14 ...
			}
		}
		System.out.println();
		System.out.println();
		
		
		// 5번
		POS1 : for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j == 3) continue POS1;
				System.out.print(i + "," + j + " ");	// 00 01 02 10 11 12 20 21 22,,,
			}
		}
	}
}
