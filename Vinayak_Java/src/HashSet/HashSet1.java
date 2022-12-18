package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		
		hs.add(111);
		hs.add("Vicky");
		hs.add(98.75);
		hs.add('A');
		hs.add(true);
		hs.add(false);
		hs.add(50);
		hs.add("Java");
		hs.add(null);
		
		
		System.out.println(hs);
		System.out.println();
//		hs.add('A');
//		System.out.println(hs);
		System.out.println(hs.add('A'));
		System.out.println();
		hs.remove("Java");
		System.out.println(hs);
		System.out.println();
		System.out.println(hs.contains("Vicky"));
		System.out.println();
		System.out.println(hs.isEmpty());
		System.out.println();
	
		System.out.println("Using iterator :-");
		Iterator e =hs.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		System.out.println();
		System.out.println("Using Foreach loop :- ");
		
		for(Object ob:hs) {
			System.out.println(ob);
		}
				
		
		
		
		
		
		
		
	}

}
