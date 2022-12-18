package Methods;

public class Method2 {
	public static void main(String[] args) {
		
		System.out.println("method start");
		
		Method2.m3();   //clalling by class name 
		                // syntax --classname.methodname();
		Method2.m4();
		
		
		
		m3();          //direct calling 
		               //syntax --methodname();
		m4();
		
		System.out.println("method end");
		
		
	}
      public static void m3() {     
   //m3 is method name
    	  
    	  System.out.println("SM.1 SC");
    	  
      }
       public static void m4() {
    	   System.out.println("SM.2 SC");
    	   
    	   
       }
}
