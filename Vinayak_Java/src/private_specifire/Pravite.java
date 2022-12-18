package private_specifire;

public class Pravite {
	 int a=1;
	 int b=2;
	
	
	public static void main(String[] args) {
		Pravite ob=new Pravite();
		ob.m3();
		
		
	}
	
	private void m3() {
		
		 int a=10;
		 int  b=20;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		System.out.println(this.a);
		System.out.println(this.b);
		
		
	}

}
