package TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		
		set.add("banana");
		set.add("apple");
		set.add("mango");
		set.add("apple");
		set.add("papaya");
		set.add(new String("banana"));
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
