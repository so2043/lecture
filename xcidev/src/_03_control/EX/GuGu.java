package _03_control.EX;

public class GuGu {
	public static void main(String[] args) {
		
//		for (int i=2; i<=9; i+=4) {
//			for (int j=1; j<=9; j++) {
//				for (int k=0; k<=3; k++) {
//					System.out.print(i+k + "*" + j + "=" + (i+k)*j + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println();
//		}
//		
//		
//		
//		// k에 i를 넣는 방법
//		for (int i=2; i<=9; i+=4) {
//			for (int j=1; j<=9; j++) {
//				for (int k=i; k<=i+3; k++) {
//					System.out.print(k + "*" + j + "=" + k*j + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println();
//		}
//		
		
		
		// while문으로 바꾸기
		int i = 2;
		
		while (i < 10) {
			
		
			int j = 1;
			while (j < 10) {
				
				int k = i;
				while (k < i+4) {
					System.out.print(k + "*" + j + "=" + k*j + "\t");
					k++;
				}
				j++;
				System.out.println();
			}
			
			i+=4;
			System.out.println();
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
