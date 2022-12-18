package final_;

public class Finallyb {
	//NullpointerException 
	
	
	public static void main(String[] args) {
		
		try {
			
			int a=10;
			int b=a/0;
			System.out.println(b);
			
		}
		catch(Exception e) {
		
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("finally alway run");
		}
		
		
		System.out.println("rest of code");
		
		
	}

}
