package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9934 {

	static int k;
	static int[] nums;
	
	class Node {
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val = val;
		}
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<k; i++) nums[i] = Integer.parseInt(st.nextToken());
		
		// 입력받은 배열 => 중위연산
		
		
		
		
		
		
	}

}
