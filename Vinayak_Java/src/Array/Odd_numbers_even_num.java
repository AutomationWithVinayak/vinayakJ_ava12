package Array;

public class Odd_numbers_even_num {
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,12,14,16,20,22,23,35,85,95,77,99,101,201,202};
		System.out.println(a.length);
		System.out.println();
		
		System.out.println("odd number");
		
		for(int i=0;     i<a.length;    i++) {
			
			
			
			if(a[i] % 2 != 0) {
				System.out.print(a[i]+" ");
				
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("even number");
	
		
		for(int j=0; j<a.length; j++) {
			
			if(a[j] % 2 == 0) {
				
				System.out.print(a[j]+" ");
			}
		}
				
		
		
		
		
		
		
		
		
		
	}

}
