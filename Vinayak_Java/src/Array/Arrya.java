package Array;

import java.util.Arrays;

public class Arrya {
	
	
	
	public static void main(String[] args) {
		
		int a[]=new int[3];      // its not growable ; i.e :- size is fixed         // arrays are homogenuse in nature/ two diff data type are not allowed in single defined object
		a[0]=10;                          // indexing satrt  frm zero
		a[1]=50;                     
		a[2]=5;
		
		Arrays.sort(a);
		
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
				
		
		
	}

}
