package LinkedList1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("A");
		ll.add("D");
		ll.add("C");
		ll.add("Z");
		ll.add("S");
		
		System.out.println(ll);
		
		LinkedList newll=new LinkedList();
		newll.add(ll);
		System.out.println(newll);
		
//		LinkedList newll1=new LinkedList(Arrays.asList(ll));
//		System.out.println(newll1);
		
		//removAll
		newll.removeAll(ll);
		System.out.println(newll);
		
		//Sort--
		System.out.println();
		System.out.println("Before Sorting -- "+ll);
		Collections.sort(ll);
		System.out.println("After sorting -- "+ll);
		System.out.println();
		
		//Reverse Order 
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("Reverse sorting -- "+ll);
		System.out.println();
		
		//Shuffling
		Collections.shuffle(ll);
		System.out.println("Shuffle List -- "+ll);
		System.out.println();
		
		System.out.println("Print By Iterator :-- ");
		Iterator i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
