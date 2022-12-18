package LinkedList1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	
	// LinkedList<Integer> l=new LinkedList<Integer>();
	
	
	LinkedList ll =new LinkedList ();
	
	ll.add(100);
	ll.add("Vinayak");
	ll.add(15.5);
	ll.add('A');
	ll.add(true);
	ll.add(false);
	
	
	//ll.remove(Character.valueOf('A'));
	

	System.out.println(ll);
	System.out.println(ll.size());
	
	//Remove
	ll.remove(4);
	System.out.println("After removing 4 number index :- "+ll);
	
	//Add element in the middle of ll 
	ll.add(4, "Rohit");
	System.out.println(ll);
	
	////Get- Return the element at the specified position in this in this ll 
   Object a= ll.get(4);
   System.out.println(a);
   System.out.println(ll.get(4));
   
   //Set-Method-- Replace/Update or Modified the element at Specified Position in this ll
   ll.set(4, "Virat");
   System.out.println(ll);
   
   //contains- return the true if the element is present in ll
	System.out.println(ll.contains("Virat"));
	System.out.println(ll.contains("Rohit"));
	
	//isempty
	System.out.println(ll.isEmpty());
	
	//reading element using for loop
	System.out.println();
	System.out.println("----------------USING FOR LOOP------------------- :--");
	for(int i=0; i<ll.size(); i++) {
		System.out.println(ll.get(i));
	}
	System.out.println();
   System.out.println("----------------USING FOREACH LOOP-----------------:--");
	for(Object ob:ll) {
		System.out.println(ob);
	}
	System.out.println();
	 System.out.println("----------------USING ITERATORE------------------:--");
	 Iterator I =ll.iterator();
	 while(I.hasNext()) {
		 System.out.println(I.next());
		 
	 }
			 
	
}
	
}
