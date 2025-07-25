package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// map 없이


class Node {
	
	char left;
	char right;
	
	Node(char left, char right){
		this.left = left;
		this.right = right;
	}
	
}

public class _1991 {
	
	static int n;
	static Node node;
	static char root;
	static Node[] tree = new Node[26];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			
			String[] str = br.readLine().split(" ");
					
			char val = str[0].charAt(0); 
			char left = str[1].charAt(0); 
			char right = str[2].charAt(0); 
			
			tree[val - 'A'] = new Node(left, right);
			
			if (i==0) root = val; 
		}
		
		preorder(root);
		sb.append("\n");
		inorder(root);
		sb.append("\n");
		postorder(root);
		
		System.out.println(sb);
		
		// 입력 확인
//		for (int i = 0; i < 26; i++) {
//		    if (tree[i] != null) {
//		        char parent = (char) (i + 'A');  // 숫자 → 문자로 변환
//		        System.out.println("[" + parent + "] → left: " + tree[i].left + ", right: " + tree[i].right);
//		    }
//		}

	}

	// 전위
	private static void preorder(char cur) {
		if (cur == '.') return;
		sb.append(cur);
		preorder(tree[cur - 'A'].left);
		preorder(tree[cur - 'A'].right);
	}
	
	
	// 중위
	private static void inorder(char cur) {
		if (cur == '.') return;
		inorder(tree[cur - 'A'].left);
		sb.append(cur);
		inorder(tree[cur - 'A'].right);
	}
	
	// 후위
	private static void postorder(char cur) {
		if (cur == '.') return;
		postorder(tree[cur - 'A'].left);
		postorder(tree[cur - 'A'].right);
		sb.append(cur);
	}
}
