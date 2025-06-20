package _04_array;

public class ArrayTest4 {
	public static void main(String[] args) {
		
		int[][][] score = {
			{
				{100, 90, 80, 70},
				{90, 80, 70, 60},
				{80, 70, 60, 50}
			},
			{
				{10, 20, 30, 10},
				{50, 30, 10, 60},
				{10, 20, 30, 40}
			}
		};
		
		
		for (int g=0; g<score.length; g++) {
			
			System.out.println("[ " + (g+1) + "학기 ]");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int r=0; r<score[g].length; r++) {				// score.length => 행의 개수
				int sum = 0;
				double avg = 0;
				
				for (int c=0; c<score[g][r].length; c++) { 		// score[r].length => 현재의 열에 행의 개수
					sum += score[g][r][c];
					System.out.print(score[g][r][c] + "\t");
				}
				avg = sum / score[g][r].length;
				System.out.print(sum + "\t" + avg);
				System.out.println();
				
			}
			System.out.println();
		}
		
	}

}
