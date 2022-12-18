package polymorphism;

public class Overloding_ {

public void m1() {
	
	System.out.println("no argumenrt method");
		
}
public static void m1(int i) {

System.out.println("int argument method");

}

public static void m1(long l) {
	
	System.out.println("long arument method");
}

public static void m1(double d) {
	System.out.println("double argument method");
}


public static void main(String[] args) {
	m1(10);
	
	
}

}
