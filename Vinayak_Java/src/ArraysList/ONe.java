package ArraysList;

import java.util.ArrayList;
import java.util.Iterator;

public class ONe {
	
	public static void main(String[] args) {
		
		ArrayList l =new ArrayList();
		l.add(108);
		l.add("one zero eight");
		l.add('O');
		l.add(true);
		l.add(108.8);
		l.add(null);
		l.add(108.8);
		
	
		
		System.out.println(l.size());
		
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.contains('O'));
		l.add(2, "python");
		System.out.println(l);
		//l.remove(2);
		//System.out.println(l);
		l.remove("python");
		System.out.println(l);
		System.out.println(l.get(0));
		
		l.set(1, 108);               // this is the replace method change value by index number
		System.out.println(l);
		
		System.out.println();
		for(int i=0;  i<l.size();  i++) {
			System.out.println(l.get(i));
			
		}
		
		System.out.println();
		for(Object ob:l) {
			System.out.println(ob);
		}
		
		System.out.println();
		
	Iterator vn= l.iterator();
	while(vn.hasNext());
	System.out.println(vn.next());

}
	}
