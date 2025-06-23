package _29_map.sec03_map.EX05_TreeMapMethod_1;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {

	public static void main(String[] args) {

		
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		for (int i=20; i>0; i-=2) treemap.put(i, i+ " 번째 데이터");
		
		System.out.println(treemap.toString());
		
		// 1. firstKey()
		System.out.println(treemap.firstKey());
		
		// 2. firstEntry()
		System.out.println(treemap.firstEntry());
		
		// 3. lastKey()
		System.out.println(treemap.lastKey());
		
		
		// 4. lastEntry()
		System.out.println(treemap.lastEntry());
		
		// 5. lowerKey(K key)
		System.out.println(treemap.lowerKey(11));
		System.out.println(treemap.lowerKey(10));
		
		// 6. higherKey(K key)
		System.out.println(treemap.higherKey(11));
		System.out.println(treemap.higherKey(10));
		
		// 7. pollFirstEntry()
		System.out.println(treemap.pollFirstEntry());
		System.out.println(treemap.toString());

		// 8. pollLastEntry()
		System.out.println(treemap.pollLastEntry());
		System.out.println(treemap.toString());

	
		// 9. SortedMap<K, V>
		// headMap(K toKey)
		SortedMap<Integer, String> sortedMap = treemap.headMap(8);
		System.out.println(sortedMap);
		
		
		// 10. NavigableMap<K, V>
		// headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> navigableMap = treemap.headMap(8, true);
		System.out.println(navigableMap);
		

		// 11. SortedMap(K, V>
		// headMap(K toKey, boolean inclusive)
		sortedMap = treemap.tailMap(14);
		System.out.println(sortedMap);
		
		// 12. NavigableMap<K, V> 
		// headMap(K toKey, boolean inclusive)
		navigableMap = treemap.tailMap(14, false);
		System.out.println(navigableMap);
		
		
		
		// 13. SortedMap<K, V> subMap(K fromKey, K toKey)
		System.out.println("13번");
		sortedMap = treemap.subMap(6, 10);
		System.out.println(sortedMap);
		
		
		// 14. NavigableMap<K, V> subMap(K toKey, boolean inclusive)
		System.out.println("14번");
		navigableMap = treemap.subMap(6, false, 10, true);
		System.out.println(navigableMap);
		
		
		// 15.NavigableSet<K> descendignKeySet()
		NavigableSet<Integer> navigableSet = treemap.descendingKeySet();
		System.out.println(navigableSet.toString());
		System.out.println(navigableSet.descendingSet());
		
		
		// 16. NavigableMap<K, V> descendingMap();
		System.out.println(navigableMap.toString());
		System.out.println(navigableMap.descendingMap());
		
		
		
		
	}

}
