package Array;

import java.util.Arrays;

public class Array4 {
	
	public static void main(String[] args) {
		
		double d[]=new double[4];
		d[0]=2;
		d[1]=6;
		d[2]=4;
		d[3]=5;
		
		Arrays.sort(d);
		
		for (int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
		
		
		
		
	}

}
