package polymorphism;

public class Oveload {     //compiletime polym
	

public void yogesh() {                // zero para/ with out para
	
	System.out.println("overload 1");
}

public void  yogesh(int a , int b) {       // 2 method with param,argument
	
	System.out.println(a+b);
	
}
public void yogesh (String name) {        // 1 para
	System.out.println(name);

}

public void yogesh(int a, int b, int c) {               // 3 para
	
	int d=a+b+c;
	System.out.println(d);
}
public static void main(String[] args) {
	
	Oveload object =new Oveload();
	object.yogesh();
	object.yogesh(10,10);
	
	object.yogesh("vicky");
	object.yogesh(1, 20, 4);
}

}

