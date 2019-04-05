package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	List<String> user = new ArrayList<String>();

	void iteratordemo() {
		user.add("ravi");
		user.add("kiran");
		user.add("koti");
		user.add("uma");
		user.add("vamsi");
	}

	void iterator() {
		Iterator it = user.iterator();
		System.out.println("printing data by using iterator");
		while (it.hasNext()) {
			String s =(String) it.next();
			System.out.println(s);

		}
	}

	void enhancedLoop() {
		System.out.println("printing data in list by using enhanced for loop");
		for (String s : user) {
			System.out.println(s);

		}
	}
}
