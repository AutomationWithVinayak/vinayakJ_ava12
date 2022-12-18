package final_;

public class FinallyBlock {

	  // ArithmeticException in catch
	
	public static void main(String[] args) {
		
		FinallyBlock ob=new FinallyBlock();
		ob.div();
		
	}
	
	public  void div() {
		
		int i=10;
		
		try {
			System.out.println("division test");
			
			int k=i/0;
			System.out.println(k);
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("inside catch box");
		System.out.println(e);
	} 
		
	finally {
		System.out.println("executed this code even after any execution");
	}
		System.out.println("rest of the code");
		
	}
	

}