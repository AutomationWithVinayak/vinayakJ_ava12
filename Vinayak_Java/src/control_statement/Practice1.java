package control_statement;

public class Practice1 {
	
	public static void main(String[] args) {
		
		m1();
		System.out.println();
		
		Practice1 ob=new Practice1();
		ob.m2();
		
		
	}
	
	
	static void m1() {
	
	int a=50;

	if(a>=50) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	}
	
	
   void m2() {
	   int b=60;
	   if(b<50) {
		   System.out.println("pass");
		   
	   }
	   else {
		   System.out.println("fail");
   }
	
}
}
