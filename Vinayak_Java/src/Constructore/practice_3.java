package Constructore;

public class practice_3 {
	int a;
	int b;
	
	practice_3() {
		a=10;
		b=20;	
	}
	practice_3(int c , int d) {
		a=c;
		b=d;
		
		int e=c+d;
		System.out.println(e);	
	}
	public static void main(String[] args) {
		
		practice_3 vk=new practice_3();
		vk.add();
		
		practice_3 vk2=new practice_3(50,5);
		
		vk2.add2(7, 30);	
	}
	public void add() {
		
		int sum=a+b;                         
		System.out.println(sum);	
	}
	public void add2(int g, int h) {
		
		int f=g+h;
		System.out.println(f);
		
		
	}
	
}
