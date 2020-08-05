package TreeSet;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.Set;
//import java.util.ArrayList;
import java.util.TreeSet;

//import arrayList.Dog;

public class TreeSetEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("sabin",2,800);
		Employee e2 = new Employee("prabhat",4,700);
		Employee e3 = new Employee("nagendra",6,900);
		
		TreeSet<Employee> set = new TreeSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.println(set);
		Iterator<Employee> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}

	}


