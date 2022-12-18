package Array;

public class Two_d_arrays {
	
	public static void main(String[] args) {
		
		
		String s[][]=new String[3][5];
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";                   // First row
		s[0][3]="D";
		s[0][4]="E";
		
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";                  // second row
		s[1][3]="D1";
		s[1][4]="E1";
		
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="C2";                // third row
		s[2][3]="D2";
		s[2][4]="E2";
		
		
		
		for(int row =0;  row<=s.length-1;  row++) {
			
			for(int col=0;  col<s[0].length; col++) {
				
				System.out.print(s[row][col]+" ");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
