package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _18511 {
	
	static int n, k, max;
	static Integer[] nums;
	
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine());
		nums = new Integer[k];
		for (int i=0; i<k; i++) nums[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(nums, Collections.reverseOrder());
		
		recursive("");
		
		System.out.println(max);
	}
	
	static void recursive(String tmp) {
		
		if(!tmp.equals("")){
			int num = Integer.parseInt(tmp); // int 형태로 바꾸기
			if (num > n) return;
			max = Math.max(num, max);
		}
		
		for (int x : nums) 
			recursive(tmp + x);
	}
}
