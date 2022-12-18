package polymorphism;

public class overloading {
	
	public static void main(String[] args) {
		
		
		overloading ob1=new overloading();
		
		ob1.samename();
		System.out.println();
		
		ob1.samename(1, 20);
		System.out.println();
		
		ob1.samename("vicky");
		System.out.println();
		
		System.out.println("this is overloding mr=etod name is same but argument is diffrent");
	}
	
	public void samename() {
		
		int a=1;
		int b=2;
		int c=1;
		
		System.out.println(a+b+c);
	}
	
	public void samename(int d, int f) {
		int c=d+f;
		System.out.println(c);
		
	}
	
	public void samename(String name) {
		
		
		System.out.println(name);
	}

}
