package _03_control.sec04_controlkeyword.EX01_BreakControlKeyword;

public class BreakControlkKeyword {
	public static void main(String[] args) {
		
		// 1번
		for (int i=0; i<10; i++) {
			System.out.println(i);
			break;						// 0만 출력
		}
		System.out.println();
		
		
		// 2번
		for (int i=0; i<10; i++) {
			if (i==5) break;			// 4까지 출력
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		
		// 3번
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j==2) break;
				System.out.print(i + "," + j + " ");  // 00 01 10 11 20 21 30 31 40 41
				
			}
		}
		System.out.println();
		System.out.println();
		
		
		// 4번
		POS1 : for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (j == 2) break POS1;
				System.out.print(i + "," + j + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		// 5번
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (j == 2) {
					i = 100;
					break;
				}
				System.out.print(i + "," + j + " ");	// for문 안에 있어서 j==2 일 때 break 당해서 출력 못함 (훼이크)
			}
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
	}

}
