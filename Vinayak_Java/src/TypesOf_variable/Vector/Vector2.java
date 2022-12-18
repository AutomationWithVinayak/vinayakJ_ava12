package TypesOf_variable.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {
	
	public static void main(String[] args) {
		
		Vector ar=new Vector();
		

	ar.add("Nirobi");
	ar.add("Tokyo");
	ar.add("Denver");
	ar.add("Berlin");
	ar.add("Jarvis");
	
	//1. Print ArrayList info using ListIterator cursor
	
	System.out.println("---Print ArrayList info using ListIterator cursor----");
	ListIterator Litr = ar.listIterator();
	while(Litr.hasNext()) {
		System.out.println(Litr.next());
	}
	System.out.println();
	System.out.println("---Print ArrayList info using Enumeration cursor----");
	Enumeration emu = ar.elements();
	while(emu.hasMoreElements()) {
		System.out.println(emu.nextElement());
	}
	System.out.println();
	System.out.println("---Print ArrayList info using Iterator cursor----");
    Iterator ob=ar.iterator();
    while(ob.hasNext()) {
    	System.out.println(ob.next());
    }
	

}
	
}