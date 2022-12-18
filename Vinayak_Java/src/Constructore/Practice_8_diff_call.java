package Constructore;

public class Practice_8_diff_call {
	
	int num3;
	int num4;
	String sname;
	
	Practice_8_diff_call(int c , int d) {
		
		num3=c;
		num4=d;
	}
	
	Practice_8_diff_call(String nameinfo) {
		
		sname=nameinfo;	
	}
	
	public void addition() {
		
		int add=num3+num4;
		System.out.println("sum of 2 number is  :- " +add);
	}
	
     public void division() {
	int divi=num3/num4;
	System.out.println("division of 2 number is :- "+divi);
}
   public void studantname() {
	   String N=sname;
	   System.out.println("Studant Name :- "+N);
	   
   }
   
         public static void main(String[] args) {
        	 
  /*_________//call from same class is as below_______________________________________*/
			
        	 Practice_8_diff_call obj4=new Practice_8_diff_call(500,25);
        	 obj4.addition();
        	 obj4.division();
        	 
        	 Practice_8_diff_call obj5=new Practice_8_diff_call(" Vicky ");
        	 obj5.studantname();
        	 
        	 
        	 
                   System.out.println("-___________-");  
                   
 /*______________ //call from diff class is below_________________________*/
        	 
        	 practice7 obj7= new practice7(321,456);
        	 obj7.add();
        	 obj7.sub();
        	 
        	
        	 
        	 
        	 
        	 
		}
}
