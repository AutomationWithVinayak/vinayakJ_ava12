package control_statement;

public class Practice3 {

	
	public static void main(String[] args) {
		Practice3 o=new Practice3();
		o.m1();
		
	}
	
	public void m1(){
		
		int age = 18;
		int weight=50;
		
		if (age>=18)
			
			if (weight>=50) {
				System.out.println("u r ok");
			}
			else {
				System.out.println("weight not ok");
			}
		else {
			System.out.println("age not ok");
		}
	
	}
					
		
	
}

