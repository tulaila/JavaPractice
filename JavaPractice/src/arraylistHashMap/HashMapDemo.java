package arraylistHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>(); // Declaration

		// Adding Pairs to HashMap
		hm.put(101, "Rammohan");
		hm.put(102, "Sai");
		hm.put(103, "Ramesh");
		hm.put(104, "Raj");
		System.out.println(hm);

		// Remove Pair from HashMap
		hm.remove(102);
		System.out.println(hm);

		// Read Pair from HashMap
		for (Map.Entry m : hm.entrySet()) {
			
			m.getKey();
			m.getValue();

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
