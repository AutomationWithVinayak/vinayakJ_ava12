package Constructore;

public class practice7 {

	int num1;
	int num2;
	
	practice7(int a , int b) {
		
		num1=a;
		num2=b;
		
	}
	public void add() {
		
		int addValue=num1+num2;
		System.out.println(addValue);
	}
	public void sub() {
		int subValue=num1-num2;
		System.out.println(subValue);
	}

	public static void main(String[] args) {
		
		
		practice7 obj1=new practice7(2008,8);
		obj1.add();
		obj1.sub();
		
		
		
		practice7 obj2=new practice7(100,50);
		obj2.sub();
		
		practice7 obj3=new practice7(10,3);
		obj3.add();
	}
	
}
