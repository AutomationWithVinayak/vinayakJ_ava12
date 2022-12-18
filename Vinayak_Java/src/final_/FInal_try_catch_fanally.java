package final_;

public class FInal_try_catch_fanally {
	
	public static void main(String[] args) {
		
		FInal_try_catch_fanally ob =new FInal_try_catch_fanally();
		ob.m1();
		
		
	}

	public void m1() {
		
		try {
			
			int a=30;
			int b=30;
			
			int c=a/b/0;
			
			System.out.println(c);
		}
		catch(ArithmeticException e){
			
			int a=1;
			int b=2;
			System.out.println(a+b);
			
			
			
		}
		finally {
			
			String d="vinayak";
			
			System.out.println(d.length());
		}
		System.out.println("to be continue...programing");
		
	}
		
	
}
