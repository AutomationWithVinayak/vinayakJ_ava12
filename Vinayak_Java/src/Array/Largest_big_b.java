package Array;

public class Largest_big_b {

	public static void main(String[] args) {
		
		
		int viki[]= {5,6,4,7,8,9,1,2,3,15};
		System.out.println(viki.length+" is highest length");
		System.out.println();
		
		int find_Larg=viki[0];
		
	for(int i=0;  i<viki.length;    i++) {
		
		if(viki[i]>find_Larg) {
			
			find_Larg=viki[i];
		
		}	
		
	}
	System.out.println("largest number is :-  "  +find_Larg);
		
		
		
		
		
		
		
	}
	
	
}
