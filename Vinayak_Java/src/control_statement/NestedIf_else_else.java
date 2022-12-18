
package control_statement;

public class NestedIf_else_else {
	public static void main(String[] args) {
		
		int age =18;
		int weight =50;

		
		if(age>=18) {
			
			if(weight>=50) {
				System.out.println("You are eligible to donate blood");
			}
			else {
				System.out.println("You are not eligible to donate blood besuse weight is low");
			}
		}
		else {
			System.out.println("age must be greater than 18");
		}
	}

}

