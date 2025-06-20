package _04_array;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		int[] s = new int[3];
		s[0] = 100;
		s[1] = 200;
		s[2] = 300;
		
		
		for (int i=0; i<s.length; i++) System.out.println(s[i]);
		for (int x : s) System.out.println(x);
		
		
	}

}
