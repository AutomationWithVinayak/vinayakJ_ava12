package control_statement;

public class If_else_if_cs {
	
	public static void main(String[] args) {
		
		int marks=50;
		
		if(marks>=65) {
			
			System.out.println("distiction");
			
		}
		else if(marks>=60) {
			System.out.println("fist class");
			
		}
		else if(marks>=50) {
			System.out.println("second class");
		}
		else if(marks>=35) {
			System.out.println("pass");
			
		}
		else {
			
			System.out.println("fail");
			
		}
	}

}
