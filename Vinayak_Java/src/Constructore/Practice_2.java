package Constructore;

public class Practice_2 {
	
	//user difine constructor with parameter
	
	int ank1;
	int ank2;
	
	
	public Practice_2(int a, int b) {  // 2 parameter yat variable parenthisis madhe declear kele
		
		ank1=a;
		ank2=b;
		
		
		             //---------------variable initilazation ; parenthisis madhele variable initil.. kele
		
		
	}
	
	public static void main(String[] args) {
		
		Practice_2 v=new Practice_2(10,20);
		v.method();
			
		
	}
	public void method() {
		int add=ank1+ank2;
		System.out.println(add);
		
		
		
	}

}
