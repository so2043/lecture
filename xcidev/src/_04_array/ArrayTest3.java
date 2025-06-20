package _04_array;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		
		int[][] score = {				// 빈문자열 참조중
				{100, 90, 80, 70},
				{90, 80, 70, 60},
				{80, 70, 60, 50}
		};
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int r=0; r<score.length; r++) {				// score.length => 행의 개수
			
			int sum = 0;
			double avg = 0;
			
			for (int c=0; c<score[r].length; c++) { 		// score[r].length => 현재의 열에 행의 개수
				sum += score[r][c];
				System.out.print(score[r][c] + "\t");
			}
			avg = sum / score[r].length;
			System.out.print(sum + "\t" + avg);
			System.out.println();
			
		}
	}

}
