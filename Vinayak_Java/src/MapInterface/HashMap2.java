package MapInterface;

import java.util.HashMap;

public class HashMap2 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(100, "Vinayak");
		hm.put(200, "Vicky");
		hm.put(300, "Abhi");
		hm.put(300, "12345");
		
		System.out.println(hm);
		System.out.println(hm.get(100));

		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.replace(100, "inayak"));
		System.out.println(hm);
		System.out.println();
		
		for(Object o:hm.keySet()) {
			System.out.println(o+" "+hm.get(o));
		}
	}

}
