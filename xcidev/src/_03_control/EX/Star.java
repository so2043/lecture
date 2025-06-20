package _03_control.EX;

public class Star {
	public static void main(String[] args) {
		
		
		
		// 1번
//		*
//		**
//		***
//		****
//		*****
		System.out.println("1번------------------------------");
		int i=1;
		while (i <= 5) {
			int j=1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		
		
		
		// 2번
//		 ******
//		 ****
//		 ***
//		 **
//		 *
		System.out.println("2번------------------------------");
		i=1;
		while (i <= 5) {
			int j=5;
			while(j >= i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		
		i=1;
		while (i <= 5) {
			int j=1;
			while(j <= 6-i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		
		
		// 3번
//		*****
//		 ****
//		  ***
//		   **
//		    *
		System.out.println("3번------------------------------");
		i = 1;
		while(i <= 5) {
			int j=1;
			while(j <= 5) {
				if (j < i) System.out.print(" ");
				else System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		
		// 4번
//		    *
//		   **
//		  ***
//		 ****
//		*****
		System.out.println("4번------------------------------");
		i = 1;
		while(i <= 5) {
			int j=1;
			while(j <= 5) {
				if (j <= 5-i) System.out.print(" ");
				else System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
