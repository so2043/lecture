package _04_array.EX;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		
		String[] words = {
				"Java",
				"James Gosling",
				"Green Project",
				"Java Development Kit",
				"Spring Framework",
				"React",
				"Node.js",
				"Write once, Run anywhere",
				"sysone",
				"oracle database"
		};
		
	
		Scanner sc = new Scanner(System.in);
		
		long startTime = System.currentTimeMillis();
		
		for (int i=1; i<=5; i++) {
			int randomNumber = (int)(Math.random() * words.length);
			do {
				System.out.print(i + " : " + words[randomNumber] + " > ");
				String keyword = sc.nextLine();
				if (!keyword.equals(words[randomNumber])) {
					System.out.println("오타입니다. 다시 입력하세여.");
				} else {
					break;
				}
				
			} while(true); // 정확하게 입력할 때 까지
		}
		
		long endTime = System.currentTimeMillis();
		double runningTime = ((double)endTime - startTime) / 1000;
		
		System.out.println("총 소요시간은 " + runningTime + " 초 입니다.");
	}

}
