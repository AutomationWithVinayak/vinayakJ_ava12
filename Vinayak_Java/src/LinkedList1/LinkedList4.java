package LinkedList1;

import java.util.LinkedList;

public class LinkedList4 {
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("Dog");
		ll.add("Cat");
		ll.add("Dog");
		ll.add("Horse");
		
		System.out.println(ll);
		
		ll.add("Cat");
		System.out.println(ll);
		
		//AddFirst
		ll.addFirst("Tiger");
		System.out.println(ll);
		
		//LastIndex - addlast
		ll.addLast("Elephant");
		System.out.println(ll);
		
		//GetFirst--last
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getClass());  //----------LinedList Class from java.util 
		
		
		
	}

}
