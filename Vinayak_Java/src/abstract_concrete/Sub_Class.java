package abstract_concrete;

public class Sub_Class extends Incomplete {
	
	public static void main(String[] args) {
		Sub_Class ob=new Sub_Class();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		
	}
	
	public void m2() {
		System.out.println("complete m2");
	}
	public void m3() {
		System.out.println("complete m3");
	}
	
	public void m4() {
		System.out.println("method m4");
	}

}
