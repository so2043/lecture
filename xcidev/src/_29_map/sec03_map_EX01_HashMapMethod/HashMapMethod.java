package _29_map.sec03_map_EX01_HashMapMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hmap1 = new HashMap<Integer, String>();
		
		// 1. put (K key, V value)
		hmap1.put(2, "나다라");
		hmap1.put(1, "가나다");
		hmap1.put(3, "다라마");
		System.out.println(hmap1.toString());
		
		
		// 2. putAll (다른 맵 객체)
		Map<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.putAll(hmap1);
		System.out.println(hmap2.toString());
		
		// 3. replace (K key, V value)
		hmap2.replace(1, "가가가");
		hmap2.replace(4, "라라라");			// 동작하지 않음
		System.out.println(hmap2.toString());
		
		
		// 4. replace(K key, V oldValue, V newValue)
		hmap2.replace(1, "가가가", "나나나");
		hmap2.replace(4, "다다다", "라라라"); // 동작하지 않음
		System.out.println(hmap2.toString());
		
		// 5. V get(Object key)
		System.out.println(hmap2.get(1));
		System.out.println(hmap2.get(2));
		System.out.println(hmap2.get(3));
		
		// 6. containsKey(Object key)
		System.out.println(hmap2.containsKey(1));
		System.out.println(hmap2.containsKey(5));
		
		
		// 7. containsValue(Object value)
		System.out.println(hmap2.containsValue("나나나"));
		System.out.println(hmap2.containsValue("나가나"));
		
		
		// 8. Set<K> keySet()
		Set<Integer> keySet = hmap2.keySet();
		System.out.println(keySet.toString());
		
		
		// 9. Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();
		System.out.println(keySet.toString());

		
		// 10. size()
		System.out.println(hmap2.size());
		
		// 11. remove(Object key)
		
		// 12. remove(Object key, Object value)
		
		
		// 13. clear()
	}

}
