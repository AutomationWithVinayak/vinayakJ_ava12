package Constructore;

public class Prctice_4 {                              //example of with parameter constructor
	
	int number; 
	int number1;                                     //1.variable declare
	    
	Prctice_4(int a, int b) {                        //2. ----Contractor with 2 parameter 
		
		number=a;                                   //3. assign variable to paerameter
		number1=b;
		
		
	}
	
	public void addition() {                        //4.non-static method
		
		
		int sum=number+number1;                     // 5.use this globle variable to sum +
		System.out.println(sum);                    //6. print this 	
		
	}
	
	public static void main(String[] args) {         // 7.main method to ex...te  progra....
		
		Prctice_4 ob=new Prctice_4(25,3);            //8.cret object //9.initilaze t parameter in parenteses 
		ob.addition();                                // 10. call method with t help of object //** objname(dot).methodname();**
		
	}                                                              //{Vicky.......}
	

}
