package _27_collection.sec01_list.EX06_ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {

		
		// 1. 데이터 추가 시간 비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1. ArrayList 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i=0; i<100000; i++) aList.add(0, i);
		endTime = System.nanoTime();
		System.out.println();
		
		
		
	}

}
