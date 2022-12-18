package LinkedList1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {
	public static void main(String[] args) {
		LinkedList<String>ll=new <String>LinkedList();
		ll.add("lonar");
		ll.add("443302");
		ll.add("Buldhana");
		//ll.add(null);
		
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println("using get method:- "+ll.get(0));
		ll.add("ShindkhedRaja");
		System.out.println(ll);
		ll.add(1, "loni");
		System.out.println(ll);
		ll.set(1,"Chikhli");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		//ll.removeAll(ll);
		//System.out.println(ll);
		
		//---collection method 
		
		Collections.sort(ll);
		System.out.println(ll);
		
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
		
		Collections.shuffle(ll);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("443302"));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf("lonar"));
	
		
		System.out.println("foreach loop :---");
		
		for(String s:ll) {
			System.out.println(s);
		}
		System.out.println();
        System.out.println("iterator :- ");  
		Iterator i =ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	

}
