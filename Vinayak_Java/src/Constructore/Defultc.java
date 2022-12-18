package Constructore;

public class Defultc {
	
	//defult contru...
	
	public static void main(String[] args) {
		
		Defultc obj=new Defultc();
		obj.addition();
		obj.multi();
		
	}
	
	public void addition() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println(c);
	}
	public void multi() {
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

}
