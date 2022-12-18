package control_statement;

public class ifelse_nested {
	
	public static void main(String[] args) {
		
		int age=18;  int weight=50; String name="Jorden";
		
		if(age>=18) {
			if(weight>=50) {
				System.out.println("weight and age are as requierd "+name+ " can donate blood");
			
			}
			else {
				System.out.println("age is ok but ur underweight "+name+"u cannot donate blood");
				
			}
		}
			else {
				System.out.println(name+"is underage");
			}
			
		}
	}



