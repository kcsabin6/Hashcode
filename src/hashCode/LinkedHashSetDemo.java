package hashCode;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
//LInkedHashSet is ordered
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		
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
