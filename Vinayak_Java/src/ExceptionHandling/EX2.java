package ExceptionHandling;

public class EX2 {

	
	public static void main(String[] args) {
		
       System.out.println("Program is started");
		
		int a=20;
		
		try {
			System.out.println(a/0);
			
		}
		catch(ArithmeticException e){   // Here we have to tell what kind of exception will throw
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
		}
		
		
		//if u don't know the exception name
				//generic Exception
		
			
		
		
	}
}
