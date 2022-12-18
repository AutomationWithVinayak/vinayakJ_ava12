package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_to_arrayList {
	
	public static void main(String[] args) {
		
		String [] arr= {"Dog","Elephant","Cat"};
		
		for(String vr:arr) {
			System.out.println(vr);
			
		}
		
     		// convert array into arraylist
 		
      	ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println("convert array into arraylist:--");
		System.out.println(al);
		
		
		
		
	
	}

	}


