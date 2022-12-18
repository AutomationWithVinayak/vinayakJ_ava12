package protected_specifire;

public class Protrcteds {
	
	public static void main(String[] args) {
		Protrcteds ob=new Protrcteds();
		
		ob.m1();	                              // protected method call in same pakage same class
		
	}
	
	
	protected void m1() {
		
		System.out.println("protected non static method");
	}

}
