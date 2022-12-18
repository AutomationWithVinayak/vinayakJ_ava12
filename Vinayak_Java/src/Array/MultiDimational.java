package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimational {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		
		String name [][] = {{"viki","vinayak"},{"lonar","buldhana"},{"maharashtra","india"}};
		
		System.out.println(name.length);
		System.out.println(name[0].length);
		
		for(int i=0; i<name.length; i++) {
			
			for(int j=0; j<name[0].length; j++) {
				
				System.out.print(name[i][j] +" | ");
				
				
				
			}
			
			System.out.println();
			
			
			
			
		}
		//ArrayList a =new ArrayList(Arrays.asList(name));

		//System.out.println(a);
	}
	
}
