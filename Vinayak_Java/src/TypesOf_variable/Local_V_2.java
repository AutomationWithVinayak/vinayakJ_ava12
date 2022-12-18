
package TypesOf_variable;

public class Local_V_2 {

	public static void main(String[] args) {
		
		int i=10;
		String name="Virat";
		
		System.out.println(i);
		System.out.println(name);
		System.out.println();
		m1();
		System.out.println();
		
		Local_V_2 vn=new Local_V_2();
		vn.m2();
	}
	public static void m1() {
		int i=20;
		System.out.println(i);
		
	}
	public void m2() {
		int j=20;
		int k=30;
		int x=j+k;
		System.out.println(x);
		System.out.println();
		System.out.println(j);
		System.out.println();
		System.out.println("Rohit");
	}
	
	
	
}
