package Array;

public class ObjectArraysPrctice {
	
	public static void main(String[] args) {
		
		
		Object [][]tdata=new Object[4][2];
		
		tdata[0][0]="Admin";
		tdata[0][1]="Admin@123";
		
		tdata[1][0]="Admin";
		tdata[1][1]="Adimn#12234";
		
		tdata[2][0]="Admm";
		tdata[2][1]="Admin@123";
		
		tdata[3][0]="Admmn";
		tdata[3][1]="Admin@12345";
		
		
		for(int i=0; i<=tdata.length-1; i++) {
			
			for(int j=0; j<=tdata[0].length-1; j++) {
				
				System.out.print(tdata[i][j]+" | ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
