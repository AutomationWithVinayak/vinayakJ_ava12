package Methods;

public class MethodInMethod {
	
	
	
	 
	public static void m1() {
		
		System.out.println("velocity");
	}
	
	public static void m2() {
		
		m1();
		
		System.out.println("viki");
	}
public static void main(String[] args) {
	
	m2();
	
	MethodInMethod ob =new MethodInMethod();
	ob.m4();
}

static public void m3() {
	
	System.out.println("lonar");
}

public void m4() {
	
	
	m3();
	System.out.println("buldhana");
}
}
