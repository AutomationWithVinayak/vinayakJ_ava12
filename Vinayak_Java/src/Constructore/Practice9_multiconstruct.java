package Constructore;

public class Practice9_multiconstruct {

	int variable1;
	int variable2;
	
	String Name;
	
	String Studant_Name;
	int Studant_Roll_No;
	char Studant_Grade;
	float Studant_percentage;
	
	
	
	Practice9_multiconstruct(int assign1 , int assign2) {
		
		variable1=assign1;
		variable2=assign2;	
		
	}
	
	Practice9_multiconstruct(String assign3){
		
		Name=assign3;
		
	}
	
	Practice9_multiconstruct(String assign4 , int assign5 , char assign6 , float assign7 ){
		
		
		Studant_Name=assign4;
		Studant_Roll_No=assign5;
		Studant_Grade=assign6;
		Studant_percentage=assign7;
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		Practice9_multiconstruct object1=new Practice9_multiconstruct(108,108);
		object1.method1();
		
		System.out.println("-------------------------");
		
		Practice9_multiconstruct object2=new Practice9_multiconstruct("Vicky...");
		object2.method2();
		
		System.out.println("--------------------------");
		System.out.println("studant info as below");
		
		Practice9_multiconstruct object3=new Practice9_multiconstruct("Vinayak" , 007, 'A' , 97.38f);
		object3.method3();
	}
	
	
	
	
	
		public void method1() {
			
			int add=variable1+variable2;
			System.out.println(add);
		
			
		
	}
		public void method2() {
			
		 System.out.println(Name);
		 
		}
		
		
		
	
	public void method3() {
		
System.out.println(Studant_Name);
System.out.println(Studant_Roll_No);
System.out.println(Studant_Grade);
System.out.println(Studant_percentage);
	}
	
	
	
}
