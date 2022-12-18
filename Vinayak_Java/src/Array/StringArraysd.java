package Array;



public class StringArraysd {
	
	public static void main(String[] args) {
		
		
		String viki [][] ={ {"viki","vinayak","ram"},{"sham","ak","lonar"},{"gopal","tom","jerry"}};
		 
		 
		
		
		int a= viki.length;   
		System.out.println(a);
		                           // find length = 3*3
		int b=viki[0].length;
		System.out.println(b);
		
		
		
	  
		
		for(int i=0;  i<viki.length;  i++) {
			
			for(int j=0;   j<viki[0].length;  j++) {
				
				
				
				System.out.print(viki[i][j]+" , ");
				
		
		
			}
		System.out.println(" ");
		
			}	
	}
	
	
}
	
	

