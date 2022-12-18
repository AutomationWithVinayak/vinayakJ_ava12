package polymorphism;

public class Method_Overloading {
	
	public void addition(int i , int j) {
		int sum=i+j;
		
		System.out.println(sum);
	}
public void addition(int i,int j, int k) {         //method have same name but diffrent argument
	int sum=i+j+k;
	System.out.println(sum);
}
public void m1() {
	System.out.println("zero argument method");
	
}
public void m1(int i) {
	System.out.println("one argumrnt method");
}



public static void main(String[] args) {
	
	Method_Overloading ob = new Method_Overloading();
	ob.addition(10, 10);
	ob.addition(100, 100, 100);
	ob.m1();
	ob.m1(1);
}
}
