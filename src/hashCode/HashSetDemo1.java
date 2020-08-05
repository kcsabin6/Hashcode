package hashCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//default capacity is 16
//load factor=0.75, means capacity will be doubled when it's filled 75%
//generally performs search, add, remove operations in 0(1) t , means constant time

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("banana");
		set.add("apple");
		set.add("mango");
		set.add("apple");
		set.add("papaya");
		//set.add(new String("banana"));
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
