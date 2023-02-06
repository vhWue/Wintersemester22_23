package L20_3MultiMapDictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MultiMap<K,V> {
	private Map<K, Collection<V>> map = new HashMap<>();
	
	public void put(K key, V value) {
		if(map.get(key)==null) {
			map.put(key, new ArrayList<V>());
		}
		map.get(key).add(value);
	}
	
	public Collection<V> get(K key) {
		return map.get(key);
		
	}
	
	
	public void ausgabe() {
		Set<K> keySet = map.keySet();
		for (K k : keySet) {
			System.out.println(k+ "-> "+map.get(k));
		}
	}
	

}
