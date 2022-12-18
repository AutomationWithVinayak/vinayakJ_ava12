
package returntype;

public class Return1 {
	
	public static void main(String[] args) {
		
	
		
		m1();
	}
	
	public static int ad(int a, int b) {
		
		int sum =a+b;
		System.out.println(sum);
		return sum;
	
	
	}	
	
	public static void m1() {
		
		System.out.println(ad(20,20));
	}
	
}