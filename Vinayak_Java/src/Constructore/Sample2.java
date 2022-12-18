package Constructore;

public class Sample2 {
	
	int a;
	int a1;
	String name;
	
	
	public Sample2() {
		
		a=10;
		a1=20;
		
	}
	public Sample2(int d, int f) {
		
		a=d;
		a1=f;
		
		int add=d+f;
		System.out.println(add);
	}
	public static void main(String[] args) {
		
		Sample2 vn=new Sample2();
		vn.A1();
		
		Sample2 vn2=new Sample2(10,20);
		vn2.A2(7,7);
		System.out.println(vn2.a+" "+vn2.a1);
	}
	
	public void A1() {
		int sum=a+a1;
		System.out.println(sum);
		
		
	}
	public void A2(int d, int f) {
		
		a=d;
		a1=f;
		int sum2=d+f;
		System.out.println(sum2);
		
		
		
	}
	
	

}
