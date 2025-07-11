package 연습문제._07장;

class D {
	
	
	void averageScore(int...nums) {
		
		double avg = 0;
		double sum = 0;
		
		for (int x : nums) sum += x;
		
		avg = sum/nums.length;
		
		System.out.println(avg);
	}
}


public class Unit07_05번 {
	public static void main(String[] args) {
		
		D d = new D();
		
		d.averageScore(1);
		d.averageScore(1, 2);
		d.averageScore(1, 2, 3);
		d.averageScore(1, 2, 3, 4);
		
	}
}
