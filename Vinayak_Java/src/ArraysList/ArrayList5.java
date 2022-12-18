package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList5 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("Vicky");
		a.add("vinayak");
		a.add("loanr");
		a.add(1000);
		a.add('A');
		a.add(98.98);
		a.add(98.99f);
		a.add(true);
		a.add(false);
		a.add(null);
		
		
		
		
		System.out.println(a);
		System.out.println(a.size());
		a.set(1, "Vicky2");
		System.out.println(a);
		a.add(1, "vinayak");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("Vicky2");
		System.out.println(a);
		System.out.println(a.get(4));
		System.out.println(a.size());
		System.out.println(a.get(8));
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.add('A');
		System.out.println(a);
		a.add(98.98f);
		System.out.println(a);
		System.out.println();
		
	/*--------below--are--the-complicated--and-practice--point---class---and---method-------------------------*/
		
		a.remove(Character.valueOf('A'));
		System.out.println(a);
		System.out.println();
		
		a.remove(Float.valueOf((float) 98.99));
		System.out.println(a);
		System.out.println();
		
		a.remove(Float.valueOf(98.98f));
		System.out.println(a);
		System.out.println();
		
		a.add(98.95);
		System.out.println(a);
		a.remove(Double.valueOf(98.95));
		System.out.println(a);
		System.out.println();
		
		System.out.println("Print using foreach loop :- ");
		for(Object o:a) {
			System.out.println(o);
		}
		System.out.println();
		System.out.println("print using iterator cursor:-");
		
		Iterator i=a.iterator();                  // universer cursl
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println("print using listiterator cursol :-");
		ListIterator li =a.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println("print using forloop:- ");
		for(int i1=0; i1<a.size(); i1++) {
			System.out.println(a.get(i1));
		}
				
	}
}
