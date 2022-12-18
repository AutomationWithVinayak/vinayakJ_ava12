package TypesOf_variable;

public class Non_static_Globl_variable {
	
	 int i=10;             //non static globle variable
	String s="mohit";
	
	public static void main(String[] args) {
		
		m1();                                  //call m1 method in same class
		                                       // this is a regular static method
		
		
	}
	
	public static void m1() {                     // this is staic method
		Non_static_Globl_variable call=new Non_static_Globl_variable();
		// this is object creation for non static variable
		
		
		System.out.println(call.i);
		System.out.println(call.s);
		//object call is use to access non static varivable
	}

}
