package TypesOf_variable;

public class non_s_vb {
	
	String name="Rahul";                       // non static variable
	
	public static void main(String[] args) {
		
		non_s_vb N=new non_s_vb();                          // object creation
		System.out.println(N.name);                    // print non static variable by objectname.variable name
		System.out.println();
		
		N.m4();                             // call non static variable
		
		
	}
	
	public static void m4() {                                //non static method 
		
		non_s_vb n1=new non_s_vb(); 
		                              // object creation for non static access variable
		System.out.println(n1.name);
		
		
	}

}
