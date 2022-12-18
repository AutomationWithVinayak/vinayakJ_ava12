package Array;

import java.util.Arrays;

public class Array6 {
	
	public static void main(String[] args) {
		
		String s[]=new String[4];
		s[0]="vicky";
		s[1]="vinayak";
		s[2]="rr1";
		s[3]="RR2";
		
	
		Arrays.sort(s);
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
