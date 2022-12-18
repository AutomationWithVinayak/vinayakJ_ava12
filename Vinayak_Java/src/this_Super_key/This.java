package this_Super_key;

public class This {
	
	int a=10;
	int b=20;    // non static globle variable
	
	
	public static void main(String[] args) {
		
		This vn=new This();
		vn.m1();
		
	}
	
	
	public void m1() {
		int a=11;          // local variable
		int b=22;
		
		
		System.out.println(a);     // a is local
		System.out.println(b);
		
		System.out.println();
		
		System.out.println(this.a);   // a is globle
		System.out.println(this.b);
	}
	

}


