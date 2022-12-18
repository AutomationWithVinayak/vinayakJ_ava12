package final_;

public class try_catch_finally {

	public static void main(String[] args) {
		
		try {
			int a=1;
			int b=2;
			System.out.println(a+b);
			
			
			
			
		}
		catch(Exception e) {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		finally {
			
			System.out.println("finally");
			
			int i=10;
			int g=10;
			int k=i/g;
			System.out.println(k);
		}
		
		
		
		
	}
}
