package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList();
		
		AL.add('a');
		AL.add('c');
		AL.add('d');
		AL.add('b');
		
		
		System.out.println(AL);
		AL.remove(Character.valueOf('a'));
		System.out.println("After removing Char in diff data type List :- "+AL);
		
//		System.out.println();
//		AL.remove(Integer.valueOf(3));
//		System.out.println("after removing int value:- "+AL);
		
		ArrayList duplicate=new ArrayList ();
		
		duplicate.addAll(AL);
		System.out.println(duplicate);
		
		duplicate.removeAll(AL);
		System.out.println("After Removing :- "+duplicate);
		
		// Collections Method
		
		System.out.println("Element in the array list : -"+AL);
           Collections.sort(AL);
           System.out.println("Element in array list after sort :- "+AL);
           
        Collections.sort(AL, Collections.reverseOrder());
        System.out.println("Element in array list after sort in reverse Order :- "+AL);
           
	Collections.shuffle(AL);
	System.out.println("Element in array list after suffle :-"+AL);
		
		
		
	System.out.println();
	System.out.println("extra try :-");
		
	ArrayList al = new ArrayList();
		
	al.add("vinayak");
	al.add("vicky");
	al.add("ajay");
	al.add("lonar");
	
	Collections.sort(al);
	System.out.println(al);
	
	System.out.println();
	System.out.println("reverse:-");
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	System.out.println();
	System.out.println("duplicate:-");
	
	ArrayList al2=new ArrayList ();
	al2.addAll(al);
	System.out.println(al2);
    al2.removeAll(al);
    System.out.println("after removing :- "+al2);
    
    
	
	
		
	}
	
	
	
	
	
}
