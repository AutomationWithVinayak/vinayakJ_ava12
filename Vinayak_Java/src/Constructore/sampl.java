package Constructore;

public class sampl {
	//variable decleration
	int a;
	int b;
	
    //variable initialization
	
	public sampl() {
		
	a=20;
	b=10;
	
}	
	public static void main(String[] args) {
		sampl obj=new sampl();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
	
	public void m1() {
	
	int c=a+b;
	System.out.println(c);

}
	public void m2() {
	int d=a*b;
	System.out.println(d);
	
}
	public void m3() {
		int f=a/b;
		System.out.println(f);
	}
	
}
