package polymorphism;

public class runtime_error {
	
	public static void main(String[] args) {
		
		runtime_error ob =new runtime_error();
		ob.m2();
		
		
	}
	
public void m2() {
		
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
	}
	


}
