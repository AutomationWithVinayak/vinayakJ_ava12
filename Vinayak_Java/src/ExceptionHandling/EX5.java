package ExceptionHandling;

public class EX5 {
	
	//try catch Finally
	
	
	public static void main(String[] args) {
		
		int arr [] = new int[5];
		
		try {
			
		arr[10]=100;
		}
		catch(ArrayIndexOutOfBoundsException e) {                     //			ArrayIndexOutOfBoundsException

			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("hello");
			
		}
		
		finally {
			
			System.out.println("this is finnaly block");
			
		}
	 	
		    //1. Exception occur, Catch blockhandle, finally block aslo executed
		   //2.Exception occur ,catch block not handle,Finally block executed
		   //3.Exception not occur catch block will ignore, finally block executed 
		
		
		
		
	}

}
