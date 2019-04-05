package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	Map<Integer, String> user = new HashMap<>();

	void mapDemo() {
		user.put(1, "ravi");
		user.put(2, "kiran");
		user.put(3, "koti");
		user.put(4, "uma");
		user.put(5, "vamsi");
		user.put(5, "vamsi");
	}

	void mapEntry() {
		System.out.println("printing map data using entrySet method ");
		for (Map.Entry entry : user.entrySet()) {
			Integer i = (Integer) entry.getKey();
			String s = (String) entry.getValue();
			System.out.println(i + "   " + s);
		}

	}

	Set<Integer> keySet = user.keySet();

	void mapIterator() {
		System.out.println("printing values by using iterator ");
		Iterator it = keySet.iterator(); // it.hasNext();
		while (it.hasNext()) {

			Integer i = (Integer) it.next();
			String s = (String) user.get(i);
			System.out.print(i + " " + s);
			System.out.println();
		}
	}

	void enhancedLoop() {
		System.out.println("printing list by using enhanced loop");
		for (Integer i : keySet) {
			String s = user.get(i);
			System.out.println(i + " " + s);
		}
	}

}
