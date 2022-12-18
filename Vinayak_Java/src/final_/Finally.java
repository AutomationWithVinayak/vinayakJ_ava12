package final_;

public class Finally {
	
	public static void main(String[] args) {
		
		
		test1();
		
		
		
		
	}

	public static void test1() {
		
		
		try {
			
			
			
			System.out.println("test method");
			
		}
		
		catch(Exception e){
			
		System.out.println("Catch block");
		
		}
		finally {
			System.out.println("Finally block");
		}
		
		
		
	}
	
	
	
}
