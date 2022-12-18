package TypesOf_variable;

public class Globle_variable {
	static int i=40;
	static String a="Rahul";
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(a);
		System.out.println();
		
		m2();
		m1();
		
		System.out.println();
		Globle_variable ObNm=new Globle_variable();
		ObNm.m3();
		
		
	}
	
	
	
	
	public static void m2() {
		
		
		System.out.println(i);
		System.out.println(a);
		System.out.println();
		
		
	}
	public static void m1() {
		System.out.println(i);
		System.out.println(a);
		System.out.println();
		
	}
	
	public void m3() {
		
		
		System.out.println(i);
		System.out.println(a);
		System.out.println();
	}

}





