package TypesOf_variable;

public class Local_variable {
	
	
	
public static void main(String[] args) {

		
		m1();
		m2();   
		
		Local_variable call=new Local_variable();  ///classname objectname=new classname();
		call.m4();                                  ///objectname.methodname();
		
		 // example on local variable
		                                //it dleclear in body of method is called local variable
		                                // it use in only method body(a)/(b)
		
	}
	
	public static void m1() {
	int a=10;
	System.out.println(a);

	
}
	
	public static void m2() {
		
		 int b=20;
	
		System.out.println(b);
	}
	public void m4() {
		
		int d=15;
		
		System.out.println(d);
		
	}
	
}



