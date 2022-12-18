package control_statement;

public class Practice2 {
	
	public static void main(String[] args) {
		
		Practice2 ob =new Practice2();
		ob.m1();
		
		
	}
	
	public void m1() {
		
	int marks =60;
	
	if (marks >=60) {
		System.out.println("first class");
	}
	
	else if (marks >=50) {
		System.out.println("pass");
	}
	
	else if (marks>35) {
		System.out.println("second class");
	}
	
	else {
		System.out.println("fail");
	}
		
	}

}
