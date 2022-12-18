package Method_parameter;

public class parameterMethod {
	
	public static void main(String[] args) {
		
		addition();
		addition(10,20);
		substraction(50,25);
		subadd(10,20,2);
		Studantinfo("Vicky");
		
	}
	
	public static void addition() {
		
	  int a=10;
	  int b=20;
	  int sum=a+b;
	  
	  System.out.println("Addtion of two no =" +sum);
	  
	}
	
	public static void addition(int x, int y) {
		int z=x+y;
		System.out.println(z);
		
	}
	
	public static void substraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void subadd(int a, int b,int c) {
		int d=a+b-c;
		System.out.println(d);
	}
	
	public static void Studantinfo(String name) {
		System.out.println("Studant name =" +name);
		
	}
	
	

}
