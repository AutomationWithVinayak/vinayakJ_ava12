package Array;

public class Two_D1 {
	
	
	
	public static void main(String[] args) {
		
		
		
		int a [][]= {{1,2,3,10},{4,5,6,20},{7,8,9,30}};   // row =3 col =4
		
		
		System.out.println(a.length);
		
		
		System.out.println(a[0].length);
		
		
		System.out.println();
		
	
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[0].length;  j++) {
				
				
				System.out.print(a[i][j]+" ");
				
				
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
