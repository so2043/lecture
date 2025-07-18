package _27_collection.sec01_list.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {

		
		
		// 1. List 구현 클래스의 생성자를 사용해 객체 생성
		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(20);
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);			// 저장 용량 지정 불가
		

		System.out.println("aList3 Capacity: " + ((Vector<Integer>) aList3).capacity());
		System.out.println("aList4 Capacity: " + ((Vector<Integer>) aList4).capacity());
				
		// 2. Arrays 클래스의 정적 메서드 활용
		List<Integer> aList7 = Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("안녕", "방가");
		aList7.set(1,7);
		aList8.set(0, "감사");
//		aList7.add(5);				// 불가능
//		aList8.remove(0);
		System.out.println(aList7);
		System.out.println(aList8);
		
		
		
	}

}
