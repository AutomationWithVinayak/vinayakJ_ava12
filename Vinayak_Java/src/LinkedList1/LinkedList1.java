package LinkedList1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		// declere LinkedList
		
		
		LinkedList ll=new LinkedList();
		
		// Add element into ll:-
		
       ll.add(100);
       ll.add("vinayak");
       ll.add(98.58);
       ll.add('A');
       ll.add(true);
       ll.add(false);
       
       System.out.println(ll);
       System.out.println(ll.size());
      
       //ll.clear();
       //System.out.println(ll);
       
       //Remove
       
       ll.remove(4);
       System.out.println("After Removing Element from list :- "+ll);
       
       //Add Element in middle of ll 
       
       ll.add(4, "Vicky");
       System.out.println("After inserting Element :- "+ll);
       
		//Get - return element at the specific position in this ll
       
       System.out.println(ll.get(4));
       
       
       // Set Method - Replace/Update or modified The Element At The Specified Position 
       
       ll.set(4, "Lonar");
       System.out.println("After Replace the Value :- "+ll);
		
		
	}

}
