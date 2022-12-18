package polymorphism;

public class Automatic_Promotion {
	
	public static void main(String[] args) {
		
		Automatic_Promotion a=new Automatic_Promotion();
		a.m1();
		a.m1('a');              //in this char is refer to int argu plz read theory of this for understand
		a.m1(105l);
		
		
	}
	
	public void m1() {
		System.out.println("zero input para method");
	}
	public void m1(int i) {         
		System.out.println("int argument method ");
	}
	public void m1(long l) {
		System.out.println("long argument method ");
		
	}
	

}
