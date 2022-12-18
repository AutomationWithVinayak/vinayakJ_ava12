package ArraysList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayList_method {
	
	public static void main(String[] args) {
		
		ArrayList vn =new ArrayList();
		
		vn.add("Vinayak");
		vn.add("vicky");
		vn.add(1000);
		vn.add(98.54);
		vn.add('A');
		vn.add(true);
		vn.add(null);
		vn.add("vicky");
		
	
		
		
		
		System.out.println(vn.get(0));
		System.out.println(vn);
		System.out.println(vn.isEmpty());
		System.out.println(vn.contains('A'));
		System.out.println(vn.indexOf(1000));
		
		vn.add(1,"lonar");
		System.out.println(vn);
		vn.set(2, "buldhana");
		System.out.println(vn);
		vn.remove(2);
		System.out.println(vn);
		vn.remove(null);
		System.out.println(vn);
		//vn.clear();
		System.out.println(vn);
		
		// add...set....remove....get....clear...contains....indexof....isempty....size....lastindexof
		
	//int a=vn.lastIndexOf("vicky");
	//System.out.println(a);
	 System.out.println(vn.lastIndexOf("vicky"));
		System.out.println(vn.size());
		
		for(int i=0; i<vn.size();  i++) {
			System.out.println(vn.get(i));
		}
		System.out.println();
		System.out.println("by for each loop  : -  ");
		
		for(Object ob:vn) {
			System.out.println(ob);
		}
		
		System.out.println();
		System.out.println("by iterator  :--");
		
		Iterator a=vn.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		System.out.println();
		System.out.println("by listiterator");
		ListIterator b =vn.listIterator();
		
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		
	}

}
