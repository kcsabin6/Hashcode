package hashCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBiscuit {

	public static void main(String[] args) {
		Biscuits b1 = new Biscuits(1,"britinia","sweet","OpenAndEat");
		Biscuits b2 = new Biscuits(3,"marry","littleSweet","OpenAndEat");
		Biscuits b3 = new Biscuits(7,"oreo","tooSweet","OpenAndEat");
		Biscuits b4 = new Biscuits(5,"parleG","salty","OpenAndEat");
		Biscuits b5 = new Biscuits(8,"digestive","mild","OpenAndEat");
		
		Set<Biscuits> set = new HashSet<Biscuits>();
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		
		System.out.println(set);
		
		Iterator<Biscuits> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
