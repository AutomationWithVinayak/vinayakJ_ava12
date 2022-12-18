package MapInterface;

import java.util.HashMap;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap <Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1, "vinayak");
		hs.put(2, "vicky");
		hs.put(3, "jay");
		hs.put(4, "ajay");
		hs.put(5, "amol");
		hs.put(6, null);
		hs.put(null, "rr");
		
		System.out.println(hs);
		System.out.println(hs.get(1));   // it will return value

		System.out.println(hs.containsKey(5));
		System.out.println(hs.containsKey(10));
		
		
		System.out.println(hs.containsValue("vinayak"));
		System.out.println(hs.containsValue("Ranjeet"));
		
		
		System.out.println(hs.keySet());
		System.out.println(hs.keySet());
		
		System.out.println(hs.values());
		System.out.println(hs.values());
		
		System.out.println();
		System.out.println("entryset() :-");
		System.out.println(hs.entrySet());
		
		System.out.println(" ");
		
		 for(Object obj:hs.keySet()) {
			 
			 System.out.println(obj);
		 }
		 
		 System.out.println(" ");
		 
		 for(Object obj :hs.values()) {
			 System.out.println(obj);
		 }
		System.out.println();
		
		for(Object obj:hs.entrySet()) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		
		
		for(Object obj :hs.keySet()) {
			
			System.out.println(obj +" "+hs.get(obj));
			
		}
		
	}

}
