package Constructore;

public class Practice_1 {
	      //user difine Constructor (or with out parameter)
	     
/*[1st]______________________________________________________________________[1st]*/	
	
	
	  int a;
//-----------------variable dlecleration 1st then next--->
	  int b;
/*[2nd]_____________________________________________________________________[2nd]*/
	
	public Practice_1() { //------> class name same as contructor-->  is a rule              
		  
		a=10;
 //-------------------Variable initilazation is 2nd --> then next
		b=20;
		
		  System.out.println("Default Contructor");
	  }
/*[3rd]____________________________________________________________________[3rd]*/	
	
	public static void main(String[] args) {
		
  Practice_1 object=new Practice_1();  //------> object create for non static variable
	System.out.println(object.a);
//-------------------------------------------> use this variable object in print statement or access this by using...<object
	System.out.println(object.b);
	}
/*______________________________________________________________________[end]*/
	 
	

}
                                                                                                                    //{Vicky...}