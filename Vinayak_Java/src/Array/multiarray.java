package Array;

public class multiarray {
	
	
	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		
		System.out.println(a.length+"  lenght of row");
		System.out.println();
		System.out.println(a[0].length+"  lenght of colm");
		System.out.println();
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		
		for(int i=0;  i<a.length;  i++) {
			
			for(int k=0;  k<a[0].length;  k++) {
				
				System.out.print(a[i][k]+" ");
			}
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
