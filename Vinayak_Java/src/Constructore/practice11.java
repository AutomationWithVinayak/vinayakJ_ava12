package Constructore;

public class practice11 {
	
	
	int a;
	
    int b;
    
    String name;
	
	
	
	
	practice11(int c , int d){       ///contructore with para 
		
		
		a=c;
		b=d;
		
		
	}
	
	practice11(String name1){
		name=name1;
		
	}
	
	public void m() {
		
		int add=a+b;
		System.out.println(add);
		
	}
	
	
	public  void m2() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		
		practice11 ob=new practice11(10,10);
				ob.m();
				
				
				practice11 ob1=new practice11("vicky");
				ob1.m2();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
