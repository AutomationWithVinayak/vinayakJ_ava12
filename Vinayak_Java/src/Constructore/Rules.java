package Constructore;

public class Rules {



 public Rules() {
	System.out.println("Default constructor");


}
 
public Rules(int i) {
		System.out.println("int Default constructor");
	}
public Rules(int i,int j) {
		System.out.println("Default constructor");
	}
public Rules(String s) {
		System.out.println("String Default constructor");
	}

public static void main(String[] args) {

	
	Rules RO =new Rules();
	Rules R1 =new Rules(10);
	R1.m1();
	RO.m1();
	
	
}
public void m1() {
	System.out.println("Deafult method");
}

}