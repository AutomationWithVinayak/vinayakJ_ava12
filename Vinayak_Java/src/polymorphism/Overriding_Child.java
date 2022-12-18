package polymorphism;

public class Overriding_Child extends Overriding_Parent {

	
	public  void father() {
		
		
		System.out.println("4 lakh rupees");
	}
	
	public void car() {
		System.out.println("kia");
	}
	public void child() {
		System.out.println("mobalie");
	}
	public void m11() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		Overriding_Child ob = new Overriding_Child();
		ob.father();
		ob.car();
		ob.flat();
		ob.m1();
		ob.child();
		
		System.out.println();
		
		
		Overriding_Parent ob1=new Overriding_Child();
		ob1.m1();
		ob1.father();
		ob1.flat();
		ob1.car();
		System.out.println("in this call or acssess only parent class method ");
		
		System.out.println();
		
	Overriding_Child ob2 =(Overriding_Child)new Overriding_Parent();
		ob2.car();
		ob2.father();
		ob2.child();
		ob2.flat();
		ob2.m1(); 
		
		
	
	
	}
}
