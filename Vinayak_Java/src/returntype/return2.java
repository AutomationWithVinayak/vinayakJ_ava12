
package returntype;

public class return2 {
	
	public static void main(String[] args) {
		
	System.out.println(add(10));	
	m1();
		
	}
	
	public static int add(int x) {
		
		return 2+x;
	}
	
	public static void m1() {
		
		System.out.println(add(2));
	}

}
