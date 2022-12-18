package TypesOf_variable.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(1);
		v.add(2);
		v.add(5);
		v.add(50);
		v.add(10);
		v.add(100);
		v.add(12);
		v.add(11);
		
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.get(4));
		
		v.remove(3);
		System.out.println(v);
		
		v.add(3, 50);
		System.out.println(v);
		
		v.set(3, 500);
		System.out.println(v);
		
		System.out.println();
		
		System.out.println("reading by for loop :- ");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
			
		}
		System.out.println();
		System.out.println("reading by foreach loop :-- ");
		for(Object ab:v) {
			System.out.println(ab);	
		}
		
		System.out.println();
		System.out.println("reading by iterator :-- ");
        Iterator b=v.iterator();
        while(b.hasNext()) {
        	System.out.println(b.next());
        }
        
        //------------this is only for lagacy-------------//
        
        System.out.println();
        System.out.println("print using enumeration :-");
        Enumeration emu = v.elements();
		while(emu.hasMoreElements()) {
			System.out.println(emu.nextElement());
		}
			
		
		
		
		
		
		
	}

}
