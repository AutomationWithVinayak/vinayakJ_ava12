package Jvm_Memory;

public class memory {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("main method excecutaion flow memory is in :- stack");
		System.out.println();
		
		m1();
		memory ob=new memory
				();
		ob.m2();
		
		
	}
	
	public static void m1 () {
		
		System.out.println("decleration memory in  :- stack/static pool area ");
		
		System.out.println();
		System.out.println("static & non static defination is in :- method area");
		System.out.println();
	}
	
	public void m2() {
		System.out.println("non-static method decleration memory in :- heap area/memory");
		System.out.println();
		System.out.println("static & non static defination is in :- method area");
		System.out.println();
		System.out.println("this defination is :- printing statment");
	}

}
