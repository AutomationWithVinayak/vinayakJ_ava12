package MapInterface;

import java.util.Hashtable;

public class HashTable1 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		
		ht.put(100, "ggjhg");
		ht.put(500, "jkkh");
		ht.put(600, "85jhg");
		
		System.out.println(ht.get(500));
		System.out.println(ht.entrySet());
		
		System.out.println(ht.size());
		System.out.println(ht.values());
		System.out.println(ht.keySet());
		System.out.println();
		
		for(Object o:ht.keySet()) {
			
			System.out.println(o+" "+ht.get(o));
			
		}
		}
}
