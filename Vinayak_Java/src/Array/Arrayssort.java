package Array;

import java.util.Arrays;

public class Arrayssort {
	
	public static void main(String[] args) {
		
		String a [] = {"vinayak","vicky","lonar"};
		
		
		for(int i=0; i<a.length;  i++) {
			
			Arrays.sort(a);
			
			System.out.println(a[i]);
		}
		
	}

}